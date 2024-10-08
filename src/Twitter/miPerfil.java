/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Twitter;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class miPerfil extends javax.swing.JFrame {

    usuario u = new usuario();
    tweets tw = new tweets();
    InicioTweets iT = new InicioTweets();

    /**
     * Creates new form perfilActual
     */
    public miPerfil() {
        initComponents();
        actualizarPerfil();

    }

    private void actualizarPerfil() {
        String usuarioSesionBuscar = u.getUsuarioSesion();
        if (u.getGenero() == 'M') {
            pfp.setIcon(u.imagenMasculina);
        } else {
            pfp.setIcon(u.imagenFemenina);
        }
        String[] tweetsPerfilU = tw.tweetsPerfil(usuarioSesionBuscar);
        tweetsUsuario.setListData(tweetsPerfilU);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Seguidores = new javax.swing.JPanel();
        pfp = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        seguidoresUsuario = new javax.swing.JLabel();
        seguidosUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tweetsUsuario = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        cerrarVentana = new javax.swing.JButton();
        genero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Seguidores.setBackground(new java.awt.Color(255, 255, 255));

        pfp.setForeground(new java.awt.Color(0, 0, 0));

        Usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Usuario.setForeground(new java.awt.Color(0, 0, 0));
        Usuario.setText("Usuario: @"+u.getUsuario());

        Nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setText("Nombre: "+u.getNombre());

        seguidoresUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        seguidoresUsuario.setForeground(new java.awt.Color(0, 0, 0));
        seguidoresUsuario.setText("Seguidores: "+u.getCantidadSeguidores());

        seguidosUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        seguidosUsuario.setForeground(new java.awt.Color(0, 0, 0));
        seguidosUsuario.setText("Seguidos: "+u.getCantidadSeguidos());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Mi Perfil");

        tweetsUsuario.setBackground(new java.awt.Color(204, 204, 204));
        tweetsUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tweetsUsuario);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tweets:");

        cerrarVentana.setBackground(new java.awt.Color(0, 153, 255));
        cerrarVentana.setForeground(new java.awt.Color(0, 0, 0));
        cerrarVentana.setText("Cerrar");
        cerrarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarVentanaActionPerformed(evt);
            }
        });

        genero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        genero.setForeground(new java.awt.Color(0, 0, 0));
        genero.setText("Genero: "+u.getGenero());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Edad: "+u.getEdad());

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Desactivar Cuenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha de Creacion: "+tw.formatoFecha());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/twitter-removebg-preview (1).png"))); // NOI18N

        javax.swing.GroupLayout SeguidoresLayout = new javax.swing.GroupLayout(Seguidores);
        Seguidores.setLayout(SeguidoresLayout);
        SeguidoresLayout.setHorizontalGroup(
            SeguidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeguidoresLayout.createSequentialGroup()
                .addGroup(SeguidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SeguidoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(SeguidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SeguidoresLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(267, 267, 267)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cerrarVentana)))
                        .addGap(25, 25, 25))
                    .addGroup(SeguidoresLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(pfp, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addGroup(SeguidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SeguidoresLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(SeguidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(seguidosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seguidoresUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genero)
                                    .addComponent(jLabel2)
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5))
                        .addGap(134, 134, 134)))
                .addGap(16, 16, 16))
        );
        SeguidoresLayout.setVerticalGroup(
            SeguidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeguidoresLayout.createSequentialGroup()
                .addGroup(SeguidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SeguidoresLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(SeguidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cerrarVentana)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addComponent(Nombre))
                    .addGroup(SeguidoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGroup(SeguidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SeguidoresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(SeguidoresLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Usuario)
                        .addGap(18, 18, 18)
                        .addGroup(SeguidoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SeguidoresLayout.createSequentialGroup()
                                .addComponent(seguidoresUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(seguidosUsuario)
                                .addGap(18, 18, 18)
                                .addComponent(genero)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(211, 211, 211))
                            .addGroup(SeguidoresLayout.createSequentialGroup()
                                .addComponent(pfp, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Seguidores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Seguidores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarVentanaActionPerformed
        // TODO add your handling code here:
        try {
            u.resetCantidadSeguidores();
            u.resetNombre();
            u.resetUsuario();
            u.resetCantidadSeguidos();
            u.resetEdad();
            u.resetGenero();
            u.resetFecha();
            iT.setVisible(true);

            InicioTweets iT = new InicioTweets();
            iT.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error!");
        }
    }//GEN-LAST:event_cerrarVentanaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String usuarioActual = u.getUsuarioSesion();
        usuario usuarioA = u.usersSearch(usuarioActual);
        int respuesta = JOptionPane.showConfirmDialog(null, "Deseas desactivar tu cuenta?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Su cuenta ha sido desactivada.");
            usuarioA.estadoCuenta = false;
            u.resetCerrarSesion();
            VentanaInicioSesion vIS = new VentanaInicioSesion();
            vIS.setVisible(true);
            this.dispose();
        } else if (respuesta == JOptionPane.NO_OPTION) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(miPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(miPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(miPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(miPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new miPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel Seguidores;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton cerrarVentana;
    private javax.swing.JLabel genero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pfp;
    private javax.swing.JLabel seguidoresUsuario;
    private javax.swing.JLabel seguidosUsuario;
    private javax.swing.JList<String> tweetsUsuario;
    // End of variables declaration//GEN-END:variables
}
