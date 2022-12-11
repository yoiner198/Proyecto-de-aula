package vista.credenciales;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import modelo.entidades.Paciente;
import vista.VentanaPrincipal;

public class Registro extends javax.swing.JPanel {
    
    List<Component> cuadrosTextoPrincipales;
    List<Component> cuadrosTexto;
    private final ImageIcon imagen1 = new ImageIcon(
            getClass().getResource("/vista/imagenes/showImage.png"));
    private final ImageIcon imagen2 = new ImageIcon(
            getClass().getResource("/vista/imagenes/hideImage.png"));
    
    public Registro() {
        initComponents();
        this.cuadrosTextoPrincipales = new ArrayList();
        this.cuadrosTexto = new ArrayList();
        
        this.cuadrosTextoPrincipales.add(txtCedula);
        this.cuadrosTextoPrincipales.add(txtNombre1);
        this.cuadrosTextoPrincipales.add(txtApellido1);
        this.cuadrosTextoPrincipales.add(txtUsuario);
        this.cuadrosTextoPrincipales.add(txtPassword);
        
        this.addTxt();
        for(Component component : cuadrosTexto){
            component.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    notSpace(evt);
                }
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre2 = new javax.swing.JTextField();
        cedula = new javax.swing.JLabel();
        nombre3 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        sesion = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtCedula = new javax.swing.JTextField();
        nombre4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        apellido1 = new javax.swing.JLabel();
        apellido2 = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        txtApellido1 = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        mensajeError = new javax.swing.JLabel();
        show = new javax.swing.JButton();

        setBackground(new java.awt.Color(198, 212, 222));
        setForeground(new java.awt.Color(198, 212, 222));
        setMinimumSize(new java.awt.Dimension(870, 560));
        setPreferredSize(new java.awt.Dimension(870, 560));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre2.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre2.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        txtNombre2.setForeground(new java.awt.Color(0, 0, 0));
        add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 160, 30));

        cedula.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        cedula.setForeground(new java.awt.Color(0, 0, 0));
        cedula.setText("Cédula");
        add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        nombre3.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        nombre3.setForeground(new java.awt.Color(0, 0, 0));
        nombre3.setText("Segundo nombre");
        add(nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        btnRegistro.setBackground(new java.awt.Color(128, 209, 236));
        btnRegistro.setFont(new java.awt.Font("Noto Sans", 0, 25)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistro.setText("Registrar");
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroMouseClicked(evt);
            }
        });
        add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 160, 50));

        sesion.setForeground(new java.awt.Color(0, 6, 148));
        sesion.setText("Iniciar sesion");
        sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sesionMouseClicked(evt);
            }
        });
        add(sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, -1, -1));

        usuario.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        usuario.setText("Usuario");
        add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 100, 30));

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 250, 30));

        nombre4.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        nombre4.setForeground(new java.awt.Color(0, 0, 0));
        nombre4.setText("Primer nombre");
        add(nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 140, 30));

        apellido1.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        apellido1.setForeground(new java.awt.Color(0, 0, 0));
        apellido1.setText("Primer apellido");
        add(apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        apellido2.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        apellido2.setForeground(new java.awt.Color(0, 0, 0));
        apellido2.setText("Segundo apellido");
        add(apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        txtApellido2.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido2.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        txtApellido2.setForeground(new java.awt.Color(0, 0, 0));
        add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 160, 30));

        txtApellido1.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido1.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        txtApellido1.setForeground(new java.awt.Color(0, 0, 0));
        add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 140, 30));

        password.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setText("Contraseña");
        add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        txtNombre1.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre1.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(0, 0, 0));
        add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 140, 30));

        titulo.setFont(new java.awt.Font("Noto Sans", 1, 50)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Registrarse");
        titulo.setName("titulo"); // NOI18N
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 90));

        mensajeError.setForeground(new java.awt.Color(255, 0, 0));
        mensajeError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(mensajeError, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 320, 20));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/showImage.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 60, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sesionMouseClicked

        this.setVisible(false);
        VentanaPrincipal.panelPrincipal.add(VentanaPrincipal.sesion);
        VentanaPrincipal.sesion.setVisible(true);
        limpiar();
        mensajeError.setText("");
    }//GEN-LAST:event_sesionMouseClicked

    private void btnRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseClicked

        if(isEmpty()){
            mensajeError.setText("Hay campos vacios por favos llene los campos");
            
        }else if(VentanaPrincipal.archivoPaciente.buscar(txtCedula.getText()) != null || 
                VentanaPrincipal.archivoAdmin.buscarUsuario(txtUsuario.getText()) != null ||
                VentanaPrincipal.archivoPaciente.buscarUsuario(txtUsuario.getText()) != null ||
                VentanaPrincipal.archivoMedico.buscar(txtCedula.getText()) != null){
            
            mensajeError.setText("Cédula o usuario ya registrado");
            
        }else{
            
            String nombres[] = new String[2];
            String apellidos[] = new String[2];
        
            nombres[0] = txtNombre1.getText();
            nombres[1] = txtNombre2.getText();
            apellidos[0] = txtApellido1.getText();
            apellidos[1] = txtApellido2.getText();
        
            Paciente paciente = new Paciente(txtCedula.getText(), nombres, apellidos, 
                null, null, txtUsuario.getText(), txtPassword.getText());
            VentanaPrincipal.archivoPaciente.agregar(paciente);
            VentanaPrincipal.archivoPaciente.getPacientes().add(paciente);
            
            JOptionPane.showMessageDialog(this, "Registro exitoso", 
                    "Registro con exito", JOptionPane.DEFAULT_OPTION);
            
            mensajeError.setText("");
            limpiar();
            sesionMouseClicked(evt);
        }
    }//GEN-LAST:event_btnRegistroMouseClicked

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        if(txtPassword.getEchoChar() == (char) 0){
            txtPassword.setEchoChar('\u2022');
            show.setIcon(imagen1);
        }else{
            txtPassword.setEchoChar((char)0);
            show.setIcon(imagen2);
        }
    }//GEN-LAST:event_showMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellido1;
    private javax.swing.JLabel apellido2;
    public javax.swing.JButton btnRegistro;
    public javax.swing.JLabel cedula;
    public javax.swing.JLabel mensajeError;
    private javax.swing.JLabel nombre3;
    private javax.swing.JLabel nombre4;
    public javax.swing.JLabel password;
    public javax.swing.JLabel sesion;
    public javax.swing.JButton show;
    public javax.swing.JLabel titulo;
    public javax.swing.JTextField txtApellido1;
    public javax.swing.JTextField txtApellido2;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtNombre1;
    public javax.swing.JTextField txtNombre2;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsuario;
    public javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

    private boolean isEmpty(){
        for(Component component : cuadrosTextoPrincipales){
            JTextComponent jtext = (JTextComponent) component;
            if(jtext.getText().isEmpty()){
                return true;
            }
        }
        return false;
    }
    
    private void addTxt(){
        for(Component component : this.getComponents()){
            if(component instanceof JTextField && !(component instanceof JPasswordField)){
                JTextField jtext = (JTextField) component;
                this.cuadrosTexto.add(jtext);
            }
        }
    }
    
    private void limpiar(){
        for(Component component : this.getComponents()){
            if(component instanceof JTextField){
                JTextField jtext = (JTextField) component;
                jtext.setText("");
            }
        }
    }
    
    private void notSpace(KeyEvent evt){
        if(evt.getKeyChar() == KeyEvent.VK_SPACE){
            evt.consume();
        }
    }
}
