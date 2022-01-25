/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Cita;
import Clases.Conexion;
import Clases.Pago;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author RAMYR
 */
public class AgregarFactura extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarDoctor
     */
    public AgregarFactura() {
        initComponents();
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cmbMedico = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        cmbPaciente = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        cmbServicio = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Factura");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355686_pencil.png"))); // NOI18N
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355589_floppy.png"))); // NOI18N
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355601_sign-error.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cmbMedico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccione>" }));

        jLabel16.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel16.setText("Medico");

        cmbPaciente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccione>" }));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel8.setText("Cliente");

        jDateChooser1.setDateFormatString("dd-MMM-yyyy");
        jDateChooser1.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel17.setText("Servicio");

        cmbServicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Seleccione>" }));
        cmbServicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbServicioItemStateChanged(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1435355822_sign-add.png"))); // NOI18N
        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel9.setText("Fecha");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setText("TOTAL");

        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(10, 10, 10)
                        .addComponent(jButton2)
                        .addGap(10, 10, 10)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jLabel1)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        setBounds(0, 0, 694, 585);
    }// </editor-fold>//GEN-END:initComponents

    public void Guardar() {

        int cmbPac = cmbPaciente.getSelectedIndex();
        int cmbMed = cmbMedico.getSelectedIndex();
        
        int ID_Paciente = ID_Pac[cmbPac];
        int ID_Medico = ID_Med[cmbMed];
        int Cantidad = 1;


        int fila = jTable1.getSelectedRow();

        if (cmbMed == 0 || cmbPac == 0 ) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos y seleccione correctamente",
                    "Complete", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (jTable1.getRowCount()== 0) {
            JOptionPane.showMessageDialog(this, "Agregue al menos un servicio",
                    "Agregue", JOptionPane.ERROR_MESSAGE);
            return;
        } 
            
          
 
            Pago.Agregar_Pago(ID_Paciente, ID_Medico);
            int ID_PMax = 0;
            try{
                
                resultado = Conexion.consulta("Select Max(ID_Pago) from Pago");
                
                while(resultado.next()){
                    ID_PMax = resultado.getInt(1);
                }
                
            }catch(SQLException ex){}
            
            for(int i=0; i<jTable1.getRowCount(); i++){
                
            int ID_Servicio = Integer.parseInt(model.getValueAt(i, 0).toString());
            Pago.Agregar_DetellePago(ID_PMax, ID_Servicio, Cantidad);
            
            }
            
            
            Limpiar();// TODO add your handling code here:
            
       

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Guardar();
    }//GEN-LAST:event_jButton2ActionPerformed

    ResultSet resultado;
    int ID_Serv[];
    int ID_Pac[];
    int ID_Med[];

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

     Date Hoy = new Date();
     jDateChooser1.setDate(Hoy);
        
     String [] Header = {"Codigo","Nombre","Descripcion","Precio"};
     model.setColumnIdentifiers(Header);
     jTable1.setModel(model);
             
        int ID_ServicioMax = 0;

        try {

            resultado = Conexion.consulta("Select Max(ID_Servicio) from Servicio");

            while (resultado.next()) {
                ID_ServicioMax = resultado.getInt(1);
            }
        } catch (SQLException ex) {

        }

        ID_ServicioMax++;

        ID_Serv = new int[ID_ServicioMax];

        ID_Serv[0] = 0;

        int i = 1;

        try {

            resultado = Conexion.consulta("Select ID_Servicio, Nombre_Servicio from Servicio Where Estado = "+true);

            while (resultado.next()) {
                ID_Serv[i] = resultado.getInt(1);
                cmbServicio.addItem(resultado.getString(2).trim());
                i++;
            }
        } catch (SQLException ex) {

        }

        int ID_Paciente = 0;

        try {

            resultado = Conexion.consulta("Select Max(ID_Paciente) from Paciente");

            while (resultado.next()) {
                ID_Paciente = resultado.getInt(1);
            }
        } catch (SQLException ex) {

        }

        ID_Paciente++;

        ID_Pac = new int[ID_Paciente];

        ID_Pac[0] = 0;

        int j = 1;

        try {

            resultado = Conexion.consulta("Select ID_Paciente, Nombres, Apellidos from Paciente Where Estado = "+true);

            while (resultado.next()) {
                ID_Pac[j] = resultado.getInt(1);
                cmbPaciente.addItem(resultado.getString(2).trim() + " " + resultado.getString(3).trim());
                j++;
            }
        } catch (SQLException ex) {

        }

        int ID_Medico = 0;

        try {

            resultado = Conexion.consulta("Select Max(ID_Medico) from Medico");

            while (resultado.next()) {
                ID_Medico = resultado.getInt(1);
            }
        } catch (SQLException ex) {

        }

        ID_Medico++;

        ID_Med = new int[ID_Medico];

        ID_Med[0] = 0;

        int k = 1;

        try {

            resultado = Conexion.consulta("Select ID_Medico, Nombres, Apellidos from Medico  Where Estado = "+true);

            while (resultado.next()) {
                ID_Med[k] = resultado.getInt(1);
                cmbMedico.addItem(resultado.getString(2).trim() + " " + resultado.getString(3).trim());
                k++;
            }
        } catch (SQLException ex) {

        }
       
        TableColumnModel columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(250);
        columnModel.getColumn(3).setPreferredWidth(50);
        

      /*columnModel.getColumn(0).setResizable(false);
        columnModel.getColumn(1).setResizable(false);
        columnModel.getColumn(2).setResizable(false);
        columnModel.getColumn(3).setResizable(false);*/


        jTable1.setColumnModel(columnModel);


// TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

    public void Limpiar() {
        cmbServicio.setSelectedIndex(0);
        cmbPaciente.setSelectedIndex(0);
        cmbMedico.setSelectedIndex(0);
       

        Date hoy = new Date();
        jDateChooser1.setDate(hoy);

        model.setRowCount(0);

        jTable1.setModel(model);

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmbServicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbServicioItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbServicioItemStateChanged

    double Total = 0;
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    int cmbServ = cmbServicio.getSelectedIndex();
    
    if(cmbServ == 0){
        JOptionPane.showMessageDialog(this, "Seleccione un servicio para agregar","Seleccione",JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    int ID_Servicio = ID_Serv[cmbServ];
    String Nombre = "";
    String Descripcion = "";
    double Precio = 0;
    
    try{
      
        resultado = Conexion.consulta("Select Nombre_Servicio, Descripcion_Servicio, Precio_Servicio "
                + "from Servicio where ID_Servicio = "+ID_Servicio);
        
        while(resultado.next()){
            Nombre = resultado.getString(1);
            Descripcion = resultado.getString(2);
            Precio = resultado.getDouble(3);
        }
        
    }catch(SQLException ex){}
    
    String [] Datos = new String[4];
    
    Datos [0] = String.valueOf(ID_Servicio);
    Datos [1] = Nombre.trim();
    Datos [2] = Descripcion.trim();
    Datos [3] = String.valueOf(Precio);

    model.addRow(Datos);
    
    Total = Total+Precio;
    txtTotal.setText(String.valueOf(Total));
    
    
    jTable1.setModel(model);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed



    DefaultTableModel model = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int row, int column) {

            return false;
        }

    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbMedico;
    private javax.swing.JComboBox cmbPaciente;
    private javax.swing.JComboBox cmbServicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
