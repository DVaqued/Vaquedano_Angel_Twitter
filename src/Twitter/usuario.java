package Twitter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class usuario {

    public static usuario[] usuarios = new usuario[200];
    //Variables para la creación de cuenta
    String usuario, nombre, contraseña;
    char genero;
    int edad;
    String fecha;
    String[] seguidores;
    String[] seguidos;
    boolean estadoCuenta;

    //Variables para moestrar en el perfil
    public static String usuarioSesion = null;
    public static String usuarioPerfil = null;
    public static String nombrePerfil = null;
    public static int seguidoresPerfil = 0;
    public static int seguidosPerfil = 0;
    public static int edadPerfil = 0;
    public static char generoPerfil;
    public static String fechaCreacion = null;

    //Imagenes para los diferentes frames
    public ImageIcon imagenMasculina = new ImageIcon(getClass().getResource("/imagenes/ImagenM.jpeg"));
    public ImageIcon imagenFemenina = new ImageIcon(getClass().getResource("/imagenes/ImagenF.jpeg"));

    public usuario() {
    }

    public usuario(String usuario, String nombre, String contraseña, char genero, int edad, String[] seguidores, String[] seguidos, boolean estadoCuenta, tweets[] tweetsDelUsuario) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.genero = genero;
        this.edad = edad;
        this.seguidores = seguidores;
        this.seguidos = seguidos;
        this.estadoCuenta = true;
    }

    public usuario usersSearch(String username) {
        for (usuario user : usuarios) {
            if (user != null && user.usuario.equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void asignarUsuario(String usuario) {
        usuario u = usersSearch(usuario);
        if (u != null) {
            usuarioPerfil = u.usuario;
        }
    }

    public String getUsuario() {
        return usuarioPerfil;
    }

    public void resetUsuario() {
        usuarioPerfil = null;
    }

    public void asignarNombre(String usuario) {
        usuario u = usersSearch(usuario);
        nombrePerfil = u.nombre;
    }

    public String getNombre() {
        return nombrePerfil;
    }

    public void resetNombre() {
        nombrePerfil = null;
    }

    public void asignarCantidadSeguidores(String usuario) {
        usuario usuarioActual = usersSearch(usuario);
        int contador = 0;
        for (int i = 0; i < usuarioActual.seguidores.length; i++) {
            if (usuarioActual.seguidores[i] != null) {
                usuario seguidorA = usuarioActual.usersSearch(usuarioActual.seguidores[i]);
                if (seguidorA.estadoCuenta == true) {
                    contador++;
                }
            }
        }
        seguidoresPerfil = contador;
    }

    public void asignarCantidadSeguidos(String usuario) {
        usuario usuarioActual = usersSearch(usuario);
        int contador = 0;
        if (usuarioActual != null) {
            for (int i = 0; i < usuarioActual.seguidos.length; i++) {
                if (usuarioActual.seguidos[i] != null) {
                    usuario seguidoA = usersSearch(usuarioActual.seguidos[i]);
                    if (seguidoA != null && seguidoA.estadoCuenta) {
                        contador++;
                    }
                }
            }
        }
        seguidosPerfil = contador;
    }

    public void asignarEdad(String usuario) {
        usuario u = usersSearch(usuario);
        edadPerfil = u.edad;
    }

    public int getEdad() {
        return edadPerfil;
    }

    public void resetEdad() {
        edadPerfil = 0;
    }

    public void asignarGenero(String usuario) {
        usuario u = usersSearch(usuario);
        generoPerfil = u.genero;
    }

    public char getGenero() {
        return generoPerfil;
    }

    public void resetGenero() {
        generoPerfil = ' ';
    }

    public int getCantidadSeguidores() {
        return seguidoresPerfil;
    }

    public void resetCantidadSeguidores() {
        seguidoresPerfil = 0;
    }

    public int getCantidadSeguidos() {
        return seguidosPerfil;
    }

    public void resetCantidadSeguidos() {
        seguidosPerfil = 0;
    }

    public char getGenero(String usuario) {
        return genero;
    }

    public void asignarFecha(String usuario) {
        usuario u = usersSearch(usuario);
        fechaCreacion = u.fecha;
    }

    public String getFecha() {
        return fechaCreacion;
    }

    public void resetFecha() {
        fechaCreacion = null;
    }

    public String getUsername() {
        return usuario;
    }

    public void setUsuarioSesion(String user) {
        usuarioSesion = user;
    }

    public String getUsuarioSesion() {
        return usuarioSesion;
    }

    public void resetCerrarSesion() {
        usuarioSesion = null;
    }

    public boolean creacionCuenta(String usuario, String nombre, String contraseña, char genero, int edad, String[] seguidores, String[] seguidos, boolean estadoCuenta, tweets[] tweetsDelUsuario) {
        if (usersSearch(usuario) == null) {
            for (int contadorUsers = 0; contadorUsers < usuarios.length; contadorUsers++) {
                if (usuarios[contadorUsers] == null) {
                    usuarios[contadorUsers] = new usuario(usuario, nombre, contraseña, genero, edad, seguidores, seguidos, estadoCuenta, tweetsDelUsuario);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean verificacionCuenta(String usuario, String contraseña) {
        usuario u = usersSearch(usuario);
        if (u != null && u.contraseña.equals(contraseña)) {
            if (u.estadoCuenta == false) {
                JOptionPane.showMessageDialog(null, "Tu cuenta se ha reactivado.");
                return true;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean seguir(JButton Seguir, String usuarioSesion, String usuarioBuscarSeguir, JLabel seguidores) {
        usuario usuarioActual = usersSearch(usuarioSesion);
        usuario usuarioSeguir = usersSearch(usuarioBuscarSeguir);

        if (usuarioSeguir == null) {
            return false;
        }

        for (int i = 0; i < usuarioActual.seguidos.length; i++) {
            if (usuarioActual.seguidos[i] != null && usuarioActual.seguidos[i].equals(usuarioBuscarSeguir)) {
                return false;
            } else if (usuarioActual.seguidos[i] == null) {
                usuarioActual.seguidos[i] = usuarioBuscarSeguir;
                break;
            }
        }
        for (int i = 0; i < usuarioSeguir.seguidores.length; i++) {
            if (usuarioSeguir.seguidores[i] == null) {
                usuarioSeguir.seguidores[i] = usuarioSesion;
                asignarCantidadSeguidores(usuarioBuscarSeguir);
                Seguir.setText("Dejar de Seguir");
                seguidores.setText("Seguidores: " + getCantidadSeguidores());
                return true;
            }
        }

        return false;
    }

    public boolean dejarSeguir(JButton Seguir, String usuarioSesion, String usuarioDejarSeguir, JLabel seguidores) {
        usuario usuarioActual = usersSearch(usuarioSesion);
        usuario usuarioSeguir = usersSearch(usuarioDejarSeguir);

        if (usuarioSeguir == null) {
            return false;
        }

        for (int i = 0; i < usuarioActual.seguidos.length; i++) {
            if (usuarioActual.seguidos[i] != null && usuarioActual.seguidos[i].equals(usuarioDejarSeguir)) {
                usuarioActual.seguidos[i] = null;
                break;
            }
        }

        for (int i = 0; i < usuarioSeguir.seguidores.length; i++) {
            if (usuarioSeguir.seguidores[i] != null && usuarioSeguir.seguidores[i].equals(usuarioSesion)) {
                usuarioSeguir.seguidores[i] = null;
                asignarCantidadSeguidores(usuarioDejarSeguir);
                seguidores.setText("Seguidores: " + getCantidadSeguidores());
                break;
            }
        }

        Seguir.setText("Seguir");
        return true;
    }

    public usuario[] buscarUsuarios(String textoBuscado) {
        int contador = 0;
        usuario[] usuariosencontrados = new usuario[30];
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null && usuarios[i].usuario.contains(textoBuscado)) {
                if (!usuarios[i].usuario.equals(usuarioSesion) && usuarios[i].estadoCuenta) {
                    usuariosencontrados[contador] = usuarios[i];
                    contador++;
                }
            }
        }
        return usuariosencontrados;
    }

    public String[] getSeguidos(String usuario) {
        usuario usuarioActual = usersSearch(usuario);
        if (usuarioActual == null) {
            return new String[0];
        }
        
        String[] usuarioSeguidos = new String[20];
        int index = 0;
        for (String seguido : usuarioActual.seguidos) {
            if (seguido != null) {
                usuario seguidoA = usersSearch(seguido);
                if (seguidoA != null && seguidoA.estadoCuenta) {
                    if (index < usuarioSeguidos.length) {
                        usuarioSeguidos[index] = seguido;
                        index++;
                    }
                }
            }
        }
        return usuarioSeguidos;
    }

    public String comprobacionSeguimiento(String usuarioA) {
        String[] seguidosU = getSeguidos(getUsuarioSesion());

        if (seguidosU == null || seguidosU.length == 0) {
            return "No lo sigues.";
        }
        for (String seguido : seguidosU) {
            if (seguido != null && seguido.equals(usuarioA)) {
                return "Lo sigues.";
            }
        }
        return "No lo sigues.";
    }

    public boolean sigueOno(String usuarioA) {
        usuario usuarioIS = usersSearch(getUsuarioSesion());
        for (int i = 0; i < usuarioIS.seguidos.length; i++) {
            if (usuarioIS.seguidos[i] != null && usuarioIS.seguidos[i].equals(usuarioA)) {
                return true;
            }
        }
        return false;
    }
}
