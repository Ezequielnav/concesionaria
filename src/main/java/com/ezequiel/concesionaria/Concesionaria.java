package com.ezequiel.concesionaria;
import com.ezequiel.concesionaria.igu.Principal;

public class Concesionaria {

    public static void main(String[] args) {
        
        //llamamos y hacemos visible a nuestra IGU(interfaz grafica de usuario)
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}
