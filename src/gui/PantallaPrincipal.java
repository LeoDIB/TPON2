/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import logica.Controladora;

/**
 *
 * @author leonardo dibiagi
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    Controladora control;

    public PantallaPrincipal(Controladora control) {

        this.control = control;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxAlergico = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxAtencionEspecial = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtNombreDuenio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCelularDuenio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaObservaciones = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txtNroCliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        labelImg = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JToggleButton();
        btnLimpiar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(184, 226, 255));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLabel3.setText("Raza:");

        txtRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLabel4.setText("Color:");

        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLabel5.setText("Alérgico:");

        jComboBoxAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jComboBoxAlergico.setSelectedIndex(1);
        jComboBoxAlergico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlergicoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLabel6.setText("Atención Especial:");

        jComboBoxAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        jComboBoxAtencionEspecial.setSelectedIndex(1);
        jComboBoxAtencionEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAtencionEspecialActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLabel7.setText("Nombre del dueño:");

        jLabel8.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLabel8.setText("Observaciones:");

        txtCelularDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularDuenioActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLabel9.setText("Celular del dueño:");

        txtAreaObservaciones.setColumns(20);
        txtAreaObservaciones.setRows(5);
        txtAreaObservaciones.setText("Escriba aquí observaciones...");
        jScrollPane2.setViewportView(txtAreaObservaciones);

        jLabel11.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        jLabel11.setText("Nro Cliente:");

        txtNroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroClienteActionPerformed(evt);
            }
        });
        txtNroCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNroClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCelularDuenio, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                        .addComponent(txtRaza)
                                        .addComponent(txtColor)
                                        .addComponent(txtNombreDuenio))
                                    .addComponent(jComboBoxAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(331, 331, 331))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelularDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Montserrat SemiBold", 1, 36)); // NOI18N
        jLabel10.setText("PELUQUERÍA CANINA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        labelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/corgi-groom.png"))); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Montserrat SemiBold", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(labelImg, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar)
                                .addGap(66, 66, 66)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelImg)
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnLimpiar))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void jComboBoxAlergicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlergicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAlergicoActionPerformed

    private void txtCelularDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularDuenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularDuenioActionPerformed

    // definimos lo que hará el botón guardar, es decir traer los datos de cada campo

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String nroCliente = txtNroCliente.getText();
        String nombre = txtNombre.getText();
        String raza = txtRaza.getText();
        String nombreDuenio = txtNombreDuenio.getText();
        String celularDuenio = txtCelularDuenio.getText();
        String color = txtColor.getText();
        String observaciones = txtAreaObservaciones.getText();
        String atencionEspecial = (String) jComboBoxAtencionEspecial.getSelectedItem();
        String alergico = (String) jComboBoxAlergico.getSelectedItem();

        try {
            if (  "".equals(nroCliente)) {

                JOptionPane.showMessageDialog(null, "Nro de Cliente necesario ", "ERROR", JOptionPane.ERROR_MESSAGE);
                
             } else if (control.ValidaClienteExistente(nroCliente) == true) {

                JOptionPane.showMessageDialog(null, "Nro de Cliente ya existe ", "ERROR", JOptionPane.ERROR_MESSAGE);

              txtNroCliente.setText("");

                 } else {

                control.altaCliente(nroCliente, nombre, raza, color, alergico, atencionEspecial, nombreDuenio, celularDuenio, observaciones);
                JOptionPane.showMessageDialog(null, "Cliente Guardado", "EXITO", JOptionPane.INFORMATION_MESSAGE);

                limpiarRegistros();

            }
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed
    // determinamos lo que hará el botón limpiar, setear todos los campos de texto en "vacío", y los jcomboText a su valor por defecto "No"

    private void limpiarRegistros() {
        txtNroCliente.setText("");
        txtNombre.setText("");
        txtRaza.setText("");
        txtNombreDuenio.setText("");
        txtCelularDuenio.setText("");
        jComboBoxAlergico.setSelectedIndex(1);
        jComboBoxAtencionEspecial.setSelectedIndex(1);
        txtColor.setText("");
        txtAreaObservaciones.setText("Escriba observaciones aquí...");

    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarRegistros();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jComboBoxAtencionEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAtencionEspecialActionPerformed

    }//GEN-LAST:event_jComboBoxAtencionEspecialActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroClienteActionPerformed

    private void txtNroClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNroClienteKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {

            evt.consume();

            Toolkit.getDefaultToolkit().beep();
        }


    }//GEN-LAST:event_txtNroClienteKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnGuardar;
    private javax.swing.JToggleButton btnLimpiar;
    private javax.swing.JComboBox<String> jComboBoxAlergico;
    private javax.swing.JComboBox<String> jComboBoxAtencionEspecial;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelImg;
    private javax.swing.JTextArea txtAreaObservaciones;
    private javax.swing.JTextField txtCelularDuenio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNroCliente;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
