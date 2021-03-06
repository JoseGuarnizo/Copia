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
        txtnombre = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        lbl_cedula = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        lbl_user = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jpass = new javax.swing.JPasswordField();
        btnguardar = new javax.swing.JToggleButton();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_nombre.setText("NOMBRE");
        getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 66, -1, -1));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 66, 110, -1));

        lbl_apellido.setText("APELLIDO");
        getContentPane().add(lbl_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 110, -1));

        lbl_cedula.setText("CEDULA");
        getContentPane().add(lbl_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 110, -1));

        lbl_user.setText("USER");
        getContentPane().add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        lbl_pass.setText("PASSWORD");
        getContentPane().add(lbl_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtuserKeyTyped(evt);
            }
        });
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 110, -1));

        jpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpassKeyTyped(evt);
            }
        });
        getContentPane().add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 110, -1));

        btnguardar.setText("Guardar");
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 140, -1));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < ' ' || c > ' ') &&
                (c < 'A' || c > 'Z')) {
            evt.consume();
        }
        {
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        int lim = 10;
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        {
            if (txtcedula.getText().length() >= lim) {
                evt.consume();
     
                JOptionPane.showMessageDialog(rootPane, "Solo 10 digitos");
            }
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < ' ' || c > ' ') &&
                (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtuserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < ' ' || c > ' ') &&
                (c < 'A' || c > 'Z') && (c < '0' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtuserKeyTyped

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
    public javax.swing.JToggleButton btnguardar;
    public javax.swing.JPasswordField jpass;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JLabel lblfondo;
    public javax.swing.JTextField txtapellido;
    public javax.swing.JTextField txtcedula;
    public javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
