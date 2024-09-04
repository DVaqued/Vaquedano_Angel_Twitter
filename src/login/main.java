 
package login;

import javax.swing.JFrame;

public class main extends JFrame {

     
    public static void main(String[] args) {
        
       VentanaIncioSesion v1 =new VentanaIncioSesion();//con un objeto llamamos a la VentanaIncioSesion para tener un mejor orden
        
       v1.setVisible(true);//las ventanas son invisibles, este comadno es para hacerlas visibles
       v1.setLocationRelativeTo(null);//al ejecutarla nos aparesca en el centro 
        
       
   
    }
    
}
