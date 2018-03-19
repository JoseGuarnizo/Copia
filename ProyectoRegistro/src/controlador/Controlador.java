package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;
//import java.io.*;
//import java.net.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author renzo
 */
public class Controlador implements ActionListener, Observer {

    public String rptaregistro;
    User obj1 = new User();
    EstudianteDAO obj2 = new EstudianteDAO();
    Socket obj4 = new Socket();

    public Controlador() {
    }

    public Controlador(User obj1, EstudianteDAO obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj1.btnguardar.addActionListener(this);
    }

    public void limpiar() {
        obj1.txtnombre.setText(null);
        obj1.txtapellido.setText(null);
        obj1.txtcedula.setText(null);
        obj1.txtuser.setText(null);
        obj1.jpass.setText(null);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == obj1.btnguardar) {

            String nombre = obj1.txtnombre.getText();
            String apellido = obj1.txtapellido.getText();
            String cedula = obj1.txtcedula.getText();
            String user = obj1.txtuser.getText();
            String pass = obj1.jpass.getText();

            obj4.ConecarW();
            obj4.retorna();

            rptaregistro = obj2.insertarEstudiante(nombre,
                    apellido, cedula, user, pass);

            limpiar();
            //pasc = DigestUtils.md5Hex(pass);

            if (rptaregistro != null) {
                JOptionPane.showMessageDialog(null, rptaregistro);

            } else {
                JOptionPane.showMessageDialog(null, "Registro Erroneo");

            }
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Actualizado" + o + arg);
    }

}
