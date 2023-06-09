/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import com.mycompany.examenunidad2.ExamenUnidad2;
import static com.mycompany.examenunidad2.ExamenUnidad2.elementos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DanielAlejandroCehGarcia-68616-al068616@uacam.mx
 */
public class Principal extends javax.swing.JFrame {
    
     DefaultTableModel dtmElementos = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
    };

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        ExamenUnidad2.llenarTabla();
        setModelo();
        setDatos();
    }
    
     public void setModelo(){
        String[] tblcabecera = {"Numero Atómico", "Simbolo", "Nombre", "Masa atómica", "Color"};
        dtmElementos.setColumnIdentifiers(tblcabecera);
        tblElementos.setModel(dtmElementos);
    }
     
    public void setDatos(){
        Object[] datos = new Object[dtmElementos.getColumnCount()];
        dtmElementos.setRowCount(0);
        // System.out.println("municipios.size() "+municipios.size());
        for (ExamenUnidad2 elemento : elementos) {
            datos[0] = elemento.getNumeroAtomico();
            datos[1] = elemento.getSimbolo();
            datos[2] = elemento.getNombre();
            datos[3] = elemento.getMasaAtomica();
            datos[4] = elemento.getColor();
            dtmElementos.addRow(datos);
        }
        
        tblElementos.setModel(dtmElementos);
    }
    
    private void limpiarCampos(){
        this.NumAtomico.setText("");
        this.MasaAtomica.setText("");
        this.NombreS.setText("");
        this.Simbolo.setText("");
        this.Color.setText("");
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
        NumAtomico = new javax.swing.JTextField();
        MasaAtomica = new javax.swing.JTextField();
        NombreS = new javax.swing.JTextField();
        Simbolo = new javax.swing.JTextField();
        Color = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Aceptarbtn = new javax.swing.JButton();
        Cancelarbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblElementos = new javax.swing.JTable();
        Eliminarbtn = new javax.swing.JButton();
        Exportarbtn = new javax.swing.JButton();
        Actualizarbtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel2.setText("N. Atómico");

        jLabel3.setText("M. Atómica");

        jLabel4.setText("Nombre");

        jLabel5.setText("Simbolo");

        jLabel6.setText("Color");

        Aceptarbtn.setText("Aceptar");
        Aceptarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarbtnActionPerformed(evt);
            }
        });

        Cancelarbtn.setText("Cancelar");
        Cancelarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Simbolo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(Color, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NumAtomico)
                    .addComponent(MasaAtomica)
                    .addComponent(NombreS))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(Aceptarbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Cancelarbtn)
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumAtomico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MasaAtomica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Simbolo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Aceptarbtn)
                    .addComponent(Cancelarbtn))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        tblElementos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblElementos);

        Eliminarbtn.setText("Eliminar");
        Eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarbtnActionPerformed(evt);
            }
        });

        Exportarbtn.setText("Exportar");
        Exportarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarbtnActionPerformed(evt);
            }
        });

        Actualizarbtn.setText("Actualizar");
        Actualizarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Eliminarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Exportarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Actualizarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Actualizarbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Eliminarbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exportarbtn)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarbtnActionPerformed
        // TODO add your handling code here:
        int numero = Integer.parseInt(this.NumAtomico.getText().trim());
        double masa = Double.parseDouble(this.MasaAtomica.getText().trim());
        String nombre = this.NombreS.getText();
        String simbolo = this.Simbolo.getText();
        String color = this.Color.getText();
        ExamenUnidad2.insertarElemento(numero, simbolo, nombre, masa, color);
        limpiarCampos();
        setDatos();
    }//GEN-LAST:event_AceptarbtnActionPerformed

    private void CancelarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarbtnActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_CancelarbtnActionPerformed

    private void ActualizarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarbtnActionPerformed
        // TODO add your handling code here:
        int filaActual = tblElementos.getSelectedRow();
        if(Actualizarbtn.isSelected()){
            if (filaActual != -1){
                elementos.get(filaActual).setNumeroAtomico(Integer.parseInt(NumAtomico.getText()));
                elementos.get(filaActual).setSimbolo(Simbolo.getText());
                elementos.get(filaActual).setNombre(NombreS.getText());
                elementos.get(filaActual).setMasaAtomica(Double.parseDouble(MasaAtomica.getText()));
                elementos.get(filaActual).setColor(Color.getText());
                setDatos();
            }else{
                System.out.println("Es necesario Seleccionar un registro");
                Actualizarbtn.setSelected(false);
            }
        }else{
            limpiarCampos();
        }
    }//GEN-LAST:event_ActualizarbtnActionPerformed

    private void EliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarbtnActionPerformed
        // TODO add your handling code here:
        int filaActual = tblElementos.getSelectedRow();
        if (filaActual != -1){
            elementos.remove(filaActual);
            setDatos();
        }
    }//GEN-LAST:event_EliminarbtnActionPerformed

    private void ExportarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarbtnActionPerformed
        // TODO add your handling code here:
        File archivo = new File("exportados\\tblElemento.txt");
        PrintWriter escribir;
        try{
            escribir = new PrintWriter(archivo);
            for(ExamenUnidad2 elemento : elementos){
                escribir.print(elemento.toString() + "\n");
            }
            escribir.close();
        }catch(FileNotFoundException ex){
                java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ExportarbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptarbtn;
    private javax.swing.JToggleButton Actualizarbtn;
    private javax.swing.JButton Cancelarbtn;
    private javax.swing.JTextField Color;
    private javax.swing.JButton Eliminarbtn;
    private javax.swing.JButton Exportarbtn;
    private javax.swing.JTextField MasaAtomica;
    private javax.swing.JTextField NombreS;
    private javax.swing.JTextField NumAtomico;
    private javax.swing.JTextField Simbolo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblElementos;
    // End of variables declaration//GEN-END:variables
}
