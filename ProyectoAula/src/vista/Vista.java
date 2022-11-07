package vista;

import Modelo.Cita;
import Modelo.Persona;

public class Vista {

    
    public static void main(String[] args) {
        Persona per = new Persona();
        Cita si = new Cita();
        
        per.Registrar();
        per.iniciarSesion();
        si.apartarCita();
        si.consultarCita();
        si.modCita();
    }
    
}
