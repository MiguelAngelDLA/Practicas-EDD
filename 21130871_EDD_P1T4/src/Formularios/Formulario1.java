/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Dato;
import Clases.ListaEnlazada;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class Formulario1 extends javax.swing.JFrame {

    /**
     * Creates new form Formulario1
     */
    ListaEnlazada<Dato> listaEn = new ListaEnlazada();
    public Formulario1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAleatorio = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMostrar = new javax.swing.JTable();
        jButtonAleatorio = new javax.swing.JButton();
        jButtonInsertarIni = new javax.swing.JButton();
        jButtonInsertarFin = new javax.swing.JButton();
        jButtonElimIni = new javax.swing.JButton();
        jButtonElimFin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableAleatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "NUMERO", "NOMBRE", "COSTO"
            }
        ));
        jScrollPane1.setViewportView(jTableAleatorio);

        jTableMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableMostrar);

        jButtonAleatorio.setText("ALEATORIO");
        jButtonAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAleatorioActionPerformed(evt);
            }
        });

        jButtonInsertarIni.setText("INSERTAR AL INICIO");
        jButtonInsertarIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarIniActionPerformed(evt);
            }
        });

        jButtonInsertarFin.setText("INSERTAR AL FINAL");
        jButtonInsertarFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarFinActionPerformed(evt);
            }
        });

        jButtonElimIni.setText("ELIMINAR INICIO");
        jButtonElimIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonElimIniActionPerformed(evt);
            }
        });

        jButtonElimFin.setText("ELIMINAR FINAL");
        jButtonElimFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonElimFinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonInsertarFin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonElimFin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonInsertarIni, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonElimIni, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInsertarIni, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonElimIni, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertarFin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonElimFin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertarIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarIniActionPerformed
        // TODO add your handling code here:
        int numero = Integer.parseInt(this.jTableAleatorio.getValueAt(0, 0).toString());
        String nombre = this.jTableAleatorio.getValueAt(0, 1).toString();
        double costo = Double.parseDouble(this.jTableAleatorio.getValueAt(0, 2).toString());
        
        Dato oDato = new Dato(numero, nombre, costo);
        
       listaEn.insertarAlInicio(oDato);
       
       this.mostrarListaEnlazada();
    }//GEN-LAST:event_jButtonInsertarIniActionPerformed

    private void jButtonInsertarFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarFinActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        int numero = Integer.parseInt(this.jTableAleatorio.getValueAt(0, 0).toString());
        String nombre = this.jTableAleatorio.getValueAt(0, 1).toString();
        double costo = Double.parseDouble(this.jTableAleatorio.getValueAt(0, 2).toString());
        
        Dato oDato = new Dato(numero, nombre, costo);
        
       listaEn.insAlFinal(oDato);
       
       this.mostrarListaEnlazada();
    }//GEN-LAST:event_jButtonInsertarFinActionPerformed

    private void jButtonElimIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonElimIniActionPerformed
        // TODO add your handling code here:
        listaEn.elimAlInicio();
        this.mostrarListaEnlazada();
    }//GEN-LAST:event_jButtonElimIniActionPerformed

    private void jButtonElimFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonElimFinActionPerformed
        // TODO add your handling code here:
        listaEn.elimAlFin();
        this.mostrarListaEnlazada();
    }//GEN-LAST:event_jButtonElimFinActionPerformed

    private void jButtonAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAleatorioActionPerformed
        // TODO add your handling code here:
        Dato oDato= new Dato();
        oDato.aleatorio(jTableAleatorio);
        mostrarListaEnlazada();
    }//GEN-LAST:event_jButtonAleatorioActionPerformed

    public void mostrarListaEnlazada(){
        
        if(!listaEn.listaVacia()){
            Dato aux = new Dato(); 
            int nodos = listaEn.contNodos();
            DefaultTableModel modelo = (DefaultTableModel)jTableMostrar.getModel();
                        
            modelo.setColumnCount(nodos);
            for(int i = 0; i < nodos; i++){
                aux = listaEn.elimAlInicio();
                aux.mostrarDato(jTableMostrar, i);
                listaEn.insAlFinal(aux);
            }
        }
        else
            JOptionPane.showMessageDialog(null, "La lista está vacía");
    }
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
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAleatorio;
    private javax.swing.JButton jButtonElimFin;
    private javax.swing.JButton jButtonElimIni;
    private javax.swing.JButton jButtonInsertarFin;
    private javax.swing.JButton jButtonInsertarIni;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAleatorio;
    private javax.swing.JTable jTableMostrar;
    // End of variables declaration//GEN-END:variables
}
