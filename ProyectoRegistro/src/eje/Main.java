package eje;

import controlador.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;
import vista.*;

/**
 *
 * @author renzo
 */
public class Main {

    public static void main(String[] args) {

        EstudianteDAO obj1 = new EstudianteDAO();
        User obj2 = new User();
        Controlador obj3 = new Controlador(obj2, obj1);
        

        obj1.addObserver(obj3);
        obj2.setVisible(true);
        obj2.setLocationRelativeTo(null);
    }
}
