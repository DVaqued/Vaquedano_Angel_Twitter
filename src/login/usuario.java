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
    public static usuario[] usuarios = new usuario[500];
    String usuario, nombre, contraseña, genero;
    int edad;
    Date fecha = new Date();
    boolean estadoCuenta;

    String[] seguidores;
    String[] seguidos;
    
    public usuario(){
    }
    
    public usuario(String usuario, String nombre, String contraseña, String genero, int edad, String[] seguidores, String[] seguidos, boolean estadoCuenta) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.genero = genero;
        this.edad = edad;
        this.seguidores = seguidores;
        this.seguidos = seguidos;
        this.estadoCuenta = estadoCuenta;
    }

    private usuario usersSearch(String userName) {
        for (usuario user : usuarios) {
            if (user != null && user.usuario.equals(userName)) {
                return user;
            }
        }
        return null;
    }

    public boolean creacionCuenta(String usuario, String nombre, String contraseña, String genero, int edad, String[] seguidores, String[] seguidos, boolean estadoCuenta) {
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
}
