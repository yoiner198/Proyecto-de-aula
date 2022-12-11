package vista;

import com.formdev.flatlaf.FlatLightLaf;

public class Programa {
    public static void main(String[] args) {
        
        FlatLightLaf.setup();
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    }
}
