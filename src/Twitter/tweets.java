/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Twitter;

/**
 *
 * @author angel
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class tweets {
    usuario u = new usuario();

    private String username;
    private String contenidoTweet;
    private String fecha;
    public static tweets[] tweetsArray = new tweets[100];

    public tweets() {

    }

    public tweets(String username, String contenidoTweet) {
        this.username = username;
        this.contenidoTweet = contenidoTweet;
    }

    public String mensajeTweet() {
        return  username + ":  " + contenidoTweet + "  ---  " + formatoFecha();
    }

    public boolean publicarTweetUsuario(String username, String contenidoTweet) {
        username = usuario.usuarioSesion;
        for (int i = tweetsArray.length - 1; i >= 0; i--) {
            if (tweetsArray[i] == null) {
                tweetsArray[i] = new tweets(username, contenidoTweet);
                return true;
            }
        }
        return false;
    }

    public String[] tweetsPerfil(String usuarioPerfil) {
        int index = 0;
        String[] tweetsPerfil = new String[20];
        for (tweets t : tweetsArray) {
            if (t != null && t.username.equals(usuarioPerfil)) {
                tweetsPerfil[index] = t.mensajeTweet();
                index++;
            }
        }
        return tweetsPerfil;
    }

    private boolean contieneSeguido(String[] seguidos, String usuario) {
        for (String seguido : seguidos) {
            if (seguido != null && seguido.equals(usuario)) {
                return true;
            }
        }
        return false;
    }

    public String[] tweetsFiltrados(String[] seguidos, String usuarioSesion) {
        usuario u = new usuario();
        String[] tweetsFiltradosU = new String[100];
        int index = 0;
        for (tweets t : tweetsArray) {
            if (t != null && t.username != null) {
                if (t != null && t.username != null) {
                    usuario usuarioA = u.usersSearch(t.username);
                    if (usuarioA != null && (t.username.equals(usuarioSesion) || contieneSeguido(seguidos, t.username)) && usuarioA.estadoCuenta) {
                        tweetsFiltradosU[index] = t.mensajeTweet();
                        index++;
                    }
                }
            }
        }
        return tweetsFiltradosU;
    }

    public String[] buscarHashtags(String hashtag) {
        String[] hashtagTweets = new String[40];
        int index = 0;
        String hashtagBuscado = "#" + hashtag.trim();
        for (int i = 0; i < tweetsArray.length; i++) {
            if (tweetsArray[i] != null) {
                usuario usuarioActual = u.usersSearch(tweetsArray[i].username);
                if (usuarioActual != null) {
                    String tweetActual = tweetsArray[i].mensajeTweet();
                    if (tweetActual != null && tweetActual.contains(hashtagBuscado) && usuarioActual.estadoCuenta) {
                        if (index < 40) {
                            hashtagTweets[index] = tweetActual;
                            index++;
                        }
                    }
                }
            }
        }
        if (index == 0) {
            return null;
        }
        return hashtagTweets;
    }

    public String[] buscarMenciones(String usuarioBuscado) {
        String[] mencionesUsuario = new String[40];
        int index = 0;
        String usuarioB = "@" + usuarioBuscado.trim();

        for (int i = 0; i < tweetsArray.length; i++) {
            if (tweetsArray[i] != null) {

                String usuarioAutorTweet = tweetsArray[i].username;
                usuario usuarioActual = u.usersSearch(usuarioAutorTweet);
                String tweetActual = tweetsArray[i].mensajeTweet();

                if (tweetActual.contains(usuarioB) && usuarioActual != null && usuarioActual.estadoCuenta) {
                    if (index < mencionesUsuario.length) {
                        mencionesUsuario[index] = tweetActual;
                        index++;
                    }
                }
            }
        }
        if (index == 0) {
            return null;
        }

        return mencionesUsuario;
    }
    public String formatoFecha() {
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd MMMM yyyy");
        String fechaFormateada = formato.format(fechaActual);
        return fechaFormateada;
    }
}
