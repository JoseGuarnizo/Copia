package controlador;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vista.User;

public class Socket {

    public static java.net.Socket s;
    public static DataInputStream entra;
    public static DataOutputStream sale;
    Controlador c = new Controlador();
    User us = new User();
    
    
    public void ConecarW() {
        try {
            s = new java.net.Socket("172.18.94.44", 4444);
            sale = new DataOutputStream(s.getOutputStream());
            
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void retorna (){
        try {
            String mensajenew = us.txt_nombre.getText().trim();
            sale.writeUTF(mensajenew);
            us.txt_nombre.setText("");
        } catch (IOException ex) {
            Logger.getLogger(Socket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   

}
