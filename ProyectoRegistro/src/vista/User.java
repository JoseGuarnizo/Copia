package vista;

import javax.swing.JOptionPane;

public class User extends javax.swing.JFrame {

    public User() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        lbl_cedula = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        lbl_user = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jpass = new javax.swing.JPasswordField();
        btn_guardar = new javax.swing.JToggleButton();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nombre.setText("NOMBRE");
        getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 66, -1, -1));

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 66, 110, -1));

        lbl_apellido.setText("APELLIDO");
        getContentPane().add(lbl_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 110, -1));

        lbl_cedula.setText("CEDULA");
        getContentPane().add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 110, -1));

        lbl_user.setText("USER");
        getContentPane().add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        lbl_pass.setText("PASSWORD");
        getContentPane().add(lbl_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        txt_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_userKeyTyped(evt);
            }
        });
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 110, -1));

        jpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpassKeyTyped(evt);
            }
        });
        getContentPane().add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 110, -1));

        btn_guardar.setText("Guardar");
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 140, -1));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < ' ' || c > ' ') &&
                (c < 'A' || c > 'Z')) {
            evt.consume();
        }
        {
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        int lim = 10;
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        {
            if (txt_cedula.getText().length() >= lim) {
                evt.consume();
     
                JOptionPane.showMessageDialog(rootPane, "Solo 10 digitos");
            }
        }
    }//GEN-LAST:event_txt_cedulaKeyTyped

    private void txt_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < ' ' || c > ' ') &&
                (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_apellidoKeyTyped

    private void txt_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < ' ' || c > ' ') &&
                (c < 'A' || c > 'Z') && (c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_userKeyTyped

    private void jpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpassKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < ' ' || c > ' ') &&
                (c < 'A' || c > 'Z') && (c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jpassKeyTyped

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new User().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton btn_guardar;
    public javax.swing.JPasswordField jpass;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JLabel lblfondo;
    public javax.swing.JTextField txt_apellido;
    public javax.swing.JTextField txt_cedula;
    public javax.swing.JTextField txt_nombre;
    public javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
