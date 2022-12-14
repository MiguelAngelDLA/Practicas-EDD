/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formulario;

import Clases.Dato;
import Clases.ListaEnlazada;
import Clases.Nodo;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krodr
 */
public class Formulario1 extends javax.swing.JFrame {
    ListaEnlazada <Dato> oLE;
    
    /**
     * Creates new form Formulario1
     */
    public Formulario1() {
        initComponents();
        oLE=new ListaEnlazada();
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
        jTableMostrarListaEnlazada = new javax.swing.JTable();
        jButAleatorio = new javax.swing.JButton();
        jButInsAlIni = new javax.swing.JButton();
        jButInsAlFin = new javax.swing.JButton();
        jButElimAlIni = new javax.swing.JButton();
        jButElimAlFin = new javax.swing.JButton();
        jButInsAlIni1 = new javax.swing.JButton();

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

        jTableMostrarListaEnlazada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane2.setViewportView(jTableMostrarListaEnlazada);

        jButAleatorio.setText("ALEATORIO");
        jButAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatorioActionPerformed(evt);
            }
        });

        jButInsAlIni.setText("INSERTAR AL INICIO");
        jButInsAlIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButInsAlIniActionPerformed(evt);
            }
        });

        jButInsAlFin.setText("INSERTAR AL FINAL");
        jButInsAlFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButInsAlFinActionPerformed(evt);
            }
        });

        jButElimAlIni.setText("ELIMINAR AL INICIO");
        jButElimAlIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButElimAlIniActionPerformed(evt);
            }
        });

        jButElimAlFin.setText("ELIMINAR AL FIN");
        jButElimAlFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButElimAlFinActionPerformed(evt);
            }
        });

        jButInsAlIni1.setText("FUNCION PERROTA");
        jButInsAlIni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButInsAlIni1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButAleatorio)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButInsAlIni)
                                    .addComponent(jButInsAlFin))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButElimAlIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButElimAlFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButInsAlIni1)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButAleatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButInsAlIni)
                    .addComponent(jButElimAlIni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButElimAlFin)
                    .addComponent(jButInsAlFin))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButInsAlIni1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
        
    
    private void jButAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatorioActionPerformed
        Dato oDato = new Dato();
        oDato.aleatorio(jTableAleatorio);
    }//GEN-LAST:event_jButAleatorioActionPerformed

    private void jButElimAlFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButElimAlFinActionPerformed
        oLE.elimAlFin();
        this.mostrarListaSinDesenlazar(jTableMostrarListaEnlazada);
    }//GEN-LAST:event_jButElimAlFinActionPerformed

    private void jButInsAlIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButInsAlIniActionPerformed
        int numero=Integer.parseInt(this.jTableAleatorio.getValueAt(0,0).toString());
        String nombre = this.jTableAleatorio.getValueAt(0,1).toString();
        double costo = Double.parseDouble(this.jTableAleatorio.getValueAt(0,2).toString());
        
        Dato oD = new Dato(numero,nombre,costo);
        
        oLE.insAlIni(oD);
        this.mostrarListaSinDesenlazar(jTableMostrarListaEnlazada);

    }//GEN-LAST:event_jButInsAlIniActionPerformed

    private void jButInsAlFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButInsAlFinActionPerformed
        int numero=Integer.parseInt(this.jTableAleatorio.getValueAt(0,0).toString());
        String nombre = this.jTableAleatorio.getValueAt(0,1).toString();
        double costo = Double.parseDouble(this.jTableAleatorio.getValueAt(0,2).toString());
        
        Dato oD = new Dato(numero,nombre,costo);
        
        oLE.insAlFin(oD);
        this.mostrarListaSinDesenlazar(jTableMostrarListaEnlazada);
    }//GEN-LAST:event_jButInsAlFinActionPerformed

    private void jButElimAlIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButElimAlIniActionPerformed
        oLE.elimAlIni();
        this.mostrarListaSinDesenlazar(jTableMostrarListaEnlazada);

    }//GEN-LAST:event_jButElimAlIniActionPerformed

    private void jButInsAlIni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButInsAlIni1ActionPerformed
        // TODO add your handling code here:
        this.funcionPerrota();
        this.mostrarListaSinDesenlazar(jTableMostrarListaEnlazada);
    }//GEN-LAST:event_jButInsAlIni1ActionPerformed

    //Metodo para mostrar sin desenlazar
    public void mostrarListaSinDesenlazar(JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        
        
         modelo.setColumnCount(oLE.contNodos() + 1);

        modelo.setValueAt("Numero", 0, 0);
        modelo.setValueAt("Nombre", 1, 0);
        modelo.setValueAt("Costo", 2, 0);

        for(int i = 0; i < oLE.contNodos(); i++){
            Dato datoAct = (Dato)oLE.getNodo(i).getDato();
            datoAct.mostrarDato(tabla, i+1);
        }
    }
    
    public void funcionPerrota(){
        int cont1 = 0;
        int cont2 = oLE.contNodos() - 1;
        
        while(cont1 < cont2){
            boolean sonEquivalentes = sonEquivalentes((Dato)oLE.getNodo(cont1).getDato(), (Dato)oLE.getNodo(cont2).getDato());
            
            if(sonEquivalentes)
                oLE.eliminarEnPosicion(cont2);
            
            cont1++;
            cont2--;
        }
    }
    
    public boolean sonEquivalentes(Dato dato1, Dato dato2){
        boolean nombresIguales = dato1.getNombre().equals(dato2.getNombre());
        boolean numerosIguales = dato1.getNumero() == dato2.getNumero();
        boolean costosIguales = dato1.getCosto() == dato2.getCosto();
        if(nombresIguales && numerosIguales && costosIguales)
            return true;
        else return false;
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
    private javax.swing.JButton jButAleatorio;
    private javax.swing.JButton jButElimAlFin;
    private javax.swing.JButton jButElimAlIni;
    private javax.swing.JButton jButInsAlFin;
    private javax.swing.JButton jButInsAlIni;
    private javax.swing.JButton jButInsAlIni1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAleatorio;
    private javax.swing.JTable jTableMostrarListaEnlazada;
    // End of variables declaration//GEN-END:variables
}
