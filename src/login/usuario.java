package login;

import java.util.Date;

public class usuario {

    /*Usuario
    Nombre
    Contraseña
    Edad
    Genero
    Fecha de creacion
    Estado de cuenta
    Seguidores/Seguidos
     */
    public static usuario[] usuarios = new usuario[200];
    String usuario, nombre, contraseña;
    char genero;
    int edad;
    Date fecha = new Date();
    boolean estadoCuenta;
    public static String usuarioSesion = null;

    String[] seguidores;
    String[] seguidos;

    public usuario() {

    }

    public usuario(String usuario, String nombre, String contraseña, char genero, int edad, String[] seguidores, String[] seguidos, boolean estadoCuenta) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.genero = genero;
        this.edad = edad;
        this.seguidores = seguidores;
        this.seguidos = seguidos;
        this.estadoCuenta = true;
    }

    private usuario usersSearch(String userName) {
        for (usuario user : usuarios) {
            if (user != null && user.usuario.equals(userName)) {
                return user;
            }
        }
        return null;
    }

    public boolean creacionCuenta(String usuario, String nombre, String contraseña, char genero, int edad, String[] seguidores, String[] seguidos, boolean estadoCuenta) {
        if (usersSearch(usuario) == null) {
            for (int contadorUsers = 0; contadorUsers < usuarios.length; contadorUsers++) {
                if (usuarios[contadorUsers] == null) {
                    usuarios[contadorUsers] = new usuario(usuario, nombre, contraseña, genero, edad, seguidores, seguidos, estadoCuenta);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean verificacionCuenta(String usuario, String contraseña) {
        usuario u = usersSearch(usuario);
        if (u != null && u.contraseña.equals(contraseña)) {
            return true;
        }
        return false;
    }

    public void setUsuarioSesion(String user) {
        usuarioSesion = user;
    }

    public void resetCerrarSesion() {
        usuarioSesion = null;
    }

    public String getUsuarioSesion() {
        return usuarioSesion;
    }
}
