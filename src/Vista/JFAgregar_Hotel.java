/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;
import Controlador.Registro;
import Modelo.Hotel;
import sql.Conexion;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.JOptionPane;
/**
 *
 * @author Metatron
 */
public class JFAgregar_Hotel extends javax.swing.JFrame {
    /**
     * Creates new form JFAgregar_Hotel
     */
    public JFAgregar_Hotel() {
        initComponents();
        fillCity();
        fillStars();
    }
    private static JFAgregar_Hotel instancia;
    public static JFAgregar_Hotel getInstancia(){
        if(instancia==null){
            instancia = new JFAgregar_Hotel();
        }
        return instancia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigoHotel = new javax.swing.JTextField();
        txtNombreHotel = new javax.swing.JTextField();
        cmbCiudadHotel = new javax.swing.JComboBox<>();
        cmbEstrellas = new javax.swing.JComboBox<>();
        rbtSiMascotas = new javax.swing.JRadioButton();
        rbtNoMascotas = new javax.swing.JRadioButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Agregar Hotel");

        jLabel2.setText("Código:");

        jLabel3.setText("Nombre Hotel:");

        jLabel4.setText("Ciudad:");

        jLabel5.setText("Estrellas:");

        jLabel6.setText("Acepta Mascotas");

        cmbCiudadHotel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCiudadHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCiudadHotelActionPerformed(evt);
            }
        });

        cmbEstrellas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        rbtSiMascotas.setText("Si");
        rbtSiMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtSiMascotasActionPerformed(evt);
            }
        });

        rbtNoMascotas.setText("No");
        rbtNoMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNoMascotasActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(rbtSiMascotas)
                        .addGap(18, 18, 18)
                        .addComponent(rbtNoMascotas))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbCiudadHotel, 0, 140, Short.MAX_VALUE)
                            .addComponent(txtNombreHotel)
                            .addComponent(txtCodigoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEstrellas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(btnGrabar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCiudadHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbEstrellas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbtSiMascotas)
                    .addComponent(rbtNoMascotas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGrabar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void fillCity() {
        this.cmbCiudadHotel.removeAllItems();
        for (String city_list : Hotel.cities.city_list) {
            this.cmbCiudadHotel.addItem(city_list);
        }
    }//función para llenar cmbCiudadHotel
    private void fillStars(){
        this.cmbEstrellas.removeAllItems();
        this.cmbEstrellas.addItem("Seleccione");
        int count = 1;
        for (int i = 0; i < 5; i++) {
            this.cmbEstrellas.addItem(Integer.toString(count));
            count++;
        }
        
    }//función para llenar cmbEstrellas

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        
        Hotel hotel = new Hotel();
        
        if(Registro.searchHotel(this.txtCodigoHotel.getText())==null)
        {

                if(this.txtCodigoHotel.getText().length()==0){
                    javax.swing.JOptionPane.showMessageDialog(this,"Rellene el campo de Codigo");

                } 
                if(this.txtCodigoHotel.getText().length()>8){
                    javax.swing.JOptionPane.showMessageDialog(this,"El código es muy largo (debe ser menor de 8 caracteres)");
                }                  
                else 
                {
                    hotel.setCodigo_Hotel(this.txtCodigoHotel.getText().trim());
                }

            
                if(this.txtNombreHotel.getText().length()==0){
                    javax.swing.JOptionPane.showMessageDialog(this,"Rellene el campo de Nombre"); 
                }
                if(this.txtNombreHotel.getText().length()>30){
                    javax.swing.JOptionPane.showMessageDialog(this,"El nombre es muy largo (debe ser menor de 30 caracteres)");
                } 
                else 
                {
                    hotel.setNombre_Hotel(this.txtNombreHotel.getText().trim());
                }
            
                if(this.cmbCiudadHotel.getSelectedIndex()==0){
                    javax.swing.JOptionPane.showMessageDialog(this,"Seleccione una ciudad");
                } 
                else 
                {
                    hotel.setCiudad_Hotel(this.cmbCiudadHotel.getSelectedItem().toString());
                }
            
                if(this.cmbEstrellas.getSelectedIndex()==0){
                    javax.swing.JOptionPane.showMessageDialog(this,"Seleccione una cantidad de estrellas");
                    hotel.setEstrellas_Hotel(null);
                }
                else{
                hotel.setEstrellas_Hotel((this.cmbEstrellas.getSelectedIndex()));
                }        
                
                

                
                if(!this.rbtNoMascotas.isSelected()&&!this.rbtSiMascotas.isSelected()) 
                {
                        javax.swing.JOptionPane.showMessageDialog(this,"Ingrese opcion para mascotas");
                        hotel.setMascotas_Hotel(null);
                } 
                else
                {
                    if(this.rbtNoMascotas.isSelected())
                    {
                        hotel.setMascotas_Hotel(false);
                    }
                
                    if(this.rbtSiMascotas.isSelected()){
                        hotel.setMascotas_Hotel(true); 
                    }                    
                }

                
                if(Registro.addHotel(hotel))
                {
                    javax.swing.JOptionPane.showMessageDialog(this,"Registrado con exito");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "No se grabó el registro");
                }         
        }
        else
        {
        javax.swing.JOptionPane.showMessageDialog(this, "El código del hotel ya está registrado");
        }    
            
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void cmbCiudadHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCiudadHotelActionPerformed
         
    }//GEN-LAST:event_cmbCiudadHotelActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCodigoHotel.setText("");
        txtNombreHotel.setText("");
        cmbCiudadHotel.setSelectedIndex(0);
        cmbEstrellas.setSelectedIndex(0);
        rbtSiMascotas.setSelected(false);
        rbtNoMascotas.setSelected(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    
    private void rbtSiMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtSiMascotasActionPerformed

        rbtNoMascotas.setSelected(false);
    }//GEN-LAST:event_rbtSiMascotasActionPerformed

    private void rbtNoMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNoMascotasActionPerformed

        rbtSiMascotas.setSelected(false);
    }//GEN-LAST:event_rbtNoMascotasActionPerformed

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
            java.util.logging.Logger.getLogger(JFAgregar_Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAgregar_Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAgregar_Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAgregar_Hotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFAgregar_Hotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCiudadHotel;
    private javax.swing.JComboBox<String> cmbEstrellas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JRadioButton rbtNoMascotas;
    private javax.swing.JRadioButton rbtSiMascotas;
    private javax.swing.JTextField txtCodigoHotel;
    private javax.swing.JTextField txtNombreHotel;
    // End of variables declaration//GEN-END:variables
}
