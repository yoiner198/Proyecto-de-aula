package vista.admin;

import java.awt.event.KeyEvent;
import vista.VentanaRegistro;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.entidades.Medico;
import modelo.entidades.Paciente;
import vista.VentanaPrincipal;
import vista.credenciales.Registro;

public class VistaAdmin extends javax.swing.JPanel {

    public static DefaultTableModel dtmUsuario;
    private DefaultTableCellRenderer centrarColumna = new DefaultTableCellRenderer();
    public static Registro panelRegistro = new Registro();
    public static Object[] filaUsuarios = new Object[4];
    public static DefaultTableModel dtmMedico;
    public static Object[] filaMedicos = new Object[4];
    private TableRowSorter filtro;

    public VistaAdmin() {
        initComponents();
        centrarColumna.setHorizontalAlignment(SwingConstants.CENTER);
        dtmUsuario = (DefaultTableModel) tablaUsuarios.getModel();
        dtmMedico = (DefaultTableModel) tablaMedicos.getModel();

        centrarColumnas(tablaUsuarios);
        centrarColumnas(tablaMedicos);
        llenarTablaUsuarios();
        llenarTablaMedicos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloBienvenida = new javax.swing.JLabel();
        ctnPaneles = new javax.swing.JTabbedPane();
        controlUsuarios = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMedicos = new javax.swing.JTable();
        btnAgregarMedico = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        boxBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(198, 212, 222));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setPreferredSize(new java.awt.Dimension(750, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloBienvenida.setBackground(new java.awt.Color(128, 209, 236));
        tituloBienvenida.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        tituloBienvenida.setForeground(new java.awt.Color(0, 0, 0));
        tituloBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBienvenida.setText("Bienvenido Admin");
        tituloBienvenida.setOpaque(true);
        add(tituloBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 340, 60));

        ctnPaneles.setBackground(new java.awt.Color(255, 255, 255));
        ctnPaneles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ctnPaneles.setForeground(new java.awt.Color(0, 0, 0));
        ctnPaneles.setOpaque(true);

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Cita", "Medico encargado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.getTableHeader().setReorderingAllowed(false);
        controlUsuarios.setViewportView(tablaUsuarios);
        if (tablaUsuarios.getColumnModel().getColumnCount() > 0) {
            tablaUsuarios.getColumnModel().getColumn(1).setMinWidth(200);
            tablaUsuarios.getColumnModel().getColumn(3).setMinWidth(200);
        }

        ctnPaneles.addTab("Usuarios", controlUsuarios);

        tablaMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Disponibilidad", "No. Pacientes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMedicos);
        if (tablaMedicos.getColumnModel().getColumnCount() > 0) {
            tablaMedicos.getColumnModel().getColumn(1).setMinWidth(200);
        }

        ctnPaneles.addTab("Médicos", jScrollPane1);

        add(ctnPaneles, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 800, 290));

        btnAgregarMedico.setBackground(new java.awt.Color(128, 209, 236));
        btnAgregarMedico.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        btnAgregarMedico.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarMedico.setText("Agregar Medico");
        btnAgregarMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMedicoMouseClicked(evt);
            }
        });
        add(btnAgregarMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 150, 30));

        btnEliminar.setBackground(new java.awt.Color(128, 209, 236));
        btnEliminar.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 120, 30));

        boxBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        boxBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxBusquedaKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boxBusquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                boxBusquedaKeyReleased(evt);
            }
        });
        add(boxBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 120, 30));

        btnBuscar.setBackground(new java.awt.Color(128, 209, 236));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagenes/lupa.png"))); // NOI18N
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 60, 30));

        btnSalir.setBackground(new java.awt.Color(128, 209, 236));
        btnSalir.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked

        if (dtmUsuario.getRowCount() == 0 && dtmMedico.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Sin personas en las tablas",
                    "Eliminar", JOptionPane.WARNING_MESSAGE);
        } else {

            if (ctnPaneles.getSelectedIndex() == 0) {

                if (tablaUsuarios.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(this, "Seleccione el paciente a eliminar",
                            "Eliminar", JOptionPane.WARNING_MESSAGE);
                } else {
                    Paciente pacienteEliminar = (Paciente) VentanaPrincipal.archivoPaciente.
                            buscar((String) dtmUsuario.getValueAt(tablaUsuarios.getSelectedRow(), 0));

                    if (pacienteEliminar.getCita() != null) {
                        JOptionPane.showMessageDialog(this, "No se puede eliminar, paciente con cita en el sistema",
                                "Eliminar", JOptionPane.DEFAULT_OPTION);
                    } else {

                        VentanaPrincipal.archivoPaciente.eliminar(pacienteEliminar);
                        for (Paciente paciente : VentanaPrincipal.archivoPaciente.getPacientes()) {
                            if (paciente.getCedula().equals(pacienteEliminar.getCedula())) {
                                VentanaPrincipal.archivoPaciente.getPacientes().remove(paciente);
                                break;
                            }
                        }
                        dtmUsuario.removeRow(tablaUsuarios.getSelectedRow());

                        JOptionPane.showMessageDialog(this, "Paciente eliminado",
                                "Eliminar", JOptionPane.DEFAULT_OPTION);
                    }
                }
            }
            if (ctnPaneles.getSelectedIndex() == 1) {

                if (tablaMedicos.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(this, "Seleccione el medico a eliminar",
                            "Eliminar", JOptionPane.WARNING_MESSAGE);
                } else {
                    Medico medicoEliminar = (Medico) VentanaPrincipal.archivoMedico.
                            buscar((String) dtmMedico.getValueAt(tablaMedicos.getSelectedRow(), 0));

                    if (!medicoEliminar.getPacientes().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "No se puede eliminar, Medico con pacientes por atender",
                                "Eliminar", JOptionPane.DEFAULT_OPTION);
                    } else {
                        VentanaPrincipal.archivoMedico.eliminar(medicoEliminar);
                        for (Medico medico : VentanaPrincipal.archivoMedico.getMedicos()) {
                            if (medico.getCedula().equals(medicoEliminar.getCedula())) {
                                VentanaPrincipal.archivoMedico.getMedicos().remove(medico);
                                break;
                            }
                        }
                        VentanaPrincipal.archivoMedico.getMedicos().remove(medicoEliminar);
                        dtmMedico.removeRow(tablaMedicos.getSelectedRow());

                        JOptionPane.showMessageDialog(this, "Medico eliminado",
                                "Eliminar", JOptionPane.DEFAULT_OPTION);
                    }
                }
            }
        }

    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnAgregarMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMedicoMouseClicked

        VentanaRegistro registro = new VentanaRegistro(null, true);
        panelRegistro.titulo.setText("Registro");
        registro.setTitle("Registro de medico");

        panelRegistro.remove(panelRegistro.sesion);
        panelRegistro.remove(panelRegistro.usuario);
        panelRegistro.remove(panelRegistro.txtUsuario);
        panelRegistro.remove(panelRegistro.password);
        panelRegistro.remove(panelRegistro.txtPassword);
        panelRegistro.remove(panelRegistro.show);
        panelRegistro.remove(panelRegistro.mensajeError);
        panelRegistro.remove(panelRegistro.btnRegistro);

        registro.panelDatos.add(panelRegistro);
        registro.setVisible(true);
    }//GEN-LAST:event_btnAgregarMedicoMouseClicked

    private void boxBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxBusquedaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            filtrarTabla(tablaMedicos);
            filtrarTabla(tablaUsuarios);
        }
    }//GEN-LAST:event_boxBusquedaKeyPressed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        filtrarTabla(tablaMedicos);
        filtrarTabla(tablaUsuarios);
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void boxBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxBusquedaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            filtrarTabla(tablaMedicos);
            filtrarTabla(tablaUsuarios);
        }
    }//GEN-LAST:event_boxBusquedaKeyReleased

    private void boxBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxBusquedaKeyTyped
        filtrarTabla(tablaMedicos);
        filtrarTabla(tablaUsuarios);
    }//GEN-LAST:event_boxBusquedaKeyTyped

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        this.setVisible(false);
        VentanaPrincipal.panelPrincipal.add(VentanaPrincipal.sesion);
        VentanaPrincipal.sesion.setVisible(true);
    }//GEN-LAST:event_btnSalirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxBusqueda;
    private javax.swing.JButton btnAgregarMedico;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane controlUsuarios;
    private javax.swing.JTabbedPane ctnPaneles;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMedicos;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JLabel tituloBienvenida;
    // End of variables declaration//GEN-END:variables

    private void llenarTablaUsuarios() {

        limpiarTabla(dtmUsuario);

        for (Paciente paciente : VentanaPrincipal.archivoPaciente.getPacientes()) {
            String nombres[] = paciente.getNombres();
            String apellidos[] = paciente.getApellidos();

            filaUsuarios[0] = paciente.getCedula();
            if (nombres[1].isEmpty() && apellidos[1].isEmpty()) {
                filaUsuarios[1] = nombres[0] + " " + apellidos[0];

            } else if (nombres[1].isEmpty()) {
                filaUsuarios[1] = nombres[0] + " " + apellidos[0] + " " + apellidos[1];

            } else if (apellidos[1].isEmpty()) {
                filaUsuarios[1] = nombres[0] + " " + nombres[1] + " " + apellidos[0];

            } else {
                filaUsuarios[1] = nombres[0] + " " + nombres[1] + " " + apellidos[0] + " " + apellidos[1];
            }

            if (paciente.getCita() == null) {
                filaUsuarios[2] = "No";
            } else {
                filaUsuarios[2] = paciente.getCita().getRef();
            }

            if (paciente.getMedico() == null) {
                filaUsuarios[3] = "Sin medico asignado";
            } else {
                filaUsuarios[3] = paciente.getMedico().getNombres()[0] + " "
                        + paciente.getMedico().getApellidos()[0];
            }

            dtmUsuario.addRow(filaUsuarios);
        }
    }

    private void llenarTablaMedicos() {

        limpiarTabla(dtmMedico);

        for (Medico medico : VentanaPrincipal.archivoMedico.getMedicos()) {
            String nombres[] = medico.getNombres();
            String apellidos[] = medico.getApellidos();

            filaMedicos[0] = medico.getCedula();
            if (nombres[1].isEmpty() && apellidos[1].isEmpty()) {
                filaMedicos[1] = nombres[0] + " " + apellidos[0];

            } else if (nombres[1].isEmpty()) {
                filaMedicos[1] = nombres[0] + " " + apellidos[0] + " " + apellidos[1];

            } else if (apellidos[1].isEmpty()) {
                filaMedicos[1] = nombres[0] + " " + nombres[1] + " " + apellidos[0];

            } else {
                filaMedicos[1] = nombres[0] + " " + nombres[1] + " " + apellidos[0] + " " + apellidos[1];
            }

            if (medico.getPacientes().size() < 10) {
                filaMedicos[2] = "Si";
            } else {
                filaMedicos[2] = "No";
            }

            if (medico.getPacientes().isEmpty()) {
                filaMedicos[3] = 0;
            } else {
                filaMedicos[3] = medico.getPacientes().size();
            }
            dtmMedico.addRow(filaMedicos);
        }
    }

    private void limpiarTabla(DefaultTableModel dtm) {
        for (int i = 0; i < dtm.getRowCount(); i++) {
            dtm.removeRow(i);
        }
    }

    private void filtrarTabla(JTable datos) {

        JTable tabla = datos;

        this.filtro = new TableRowSorter(tabla.getModel());
        tabla.setRowSorter(filtro);

        String filtrar = this.boxBusqueda.getText();
        this.filtro.setRowFilter(RowFilter.regexFilter(filtrar));
    }

    private void centrarColumnas(JTable tabla) {
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centrarColumna);
        }
    }
}
