/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.PilaGenerica;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class Formulario1 extends javax.swing.JFrame {

    PilaGenerica<Double> pila1, pila2, pila3;
    /**
     * Creates new form Formulario
     */
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonCrear = new javax.swing.JButton();
        jButtonAleatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePila1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePila2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePila3 = new javax.swing.JTable();
        jButtonSumar = new javax.swing.JButton();
        P1xP2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextFieldBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tamaño:");

        jButtonCrear.setText("Crear");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });

        jButtonAleatorio.setText("Aleatorio");
        jButtonAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAleatorioActionPerformed(evt);
            }
        });

        jTablePila1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PILA 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePila1);

        jTablePila2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PILA 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTablePila2);

        jTablePila3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PILA 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTablePila3);

        jButtonSumar.setText("Sumar");
        jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumarActionPerformed(evt);
            }
        });

        P1xP2.setText("Ultimo x Penultimo");
        P1xP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1xP2ActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonCrear)
                .addGap(18, 18, 18)
                .addComponent(jButtonAleatorio)
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSumar)
                    .addComponent(P1xP2)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jTextFieldBuscar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCrear)
                    .addComponent(jButtonAleatorio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButtonSumar)
                        .addGap(34, 34, 34)
                        .addComponent(P1xP2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(73, 73, 73))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        // TODO add your handling code here:
        int tamaño = Integer.parseInt(this.jTextField1.getText());
        pila1 = new PilaGenerica(tamaño);
        pila2 = new PilaGenerica(tamaño);
        pila3 = new PilaGenerica(tamaño);
        
        JOptionPane.showMessageDialog(this, "Las pilas han sido creadas");
    }//GEN-LAST:event_jButtonCrearActionPerformed

    private void jButtonAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAleatorioActionPerformed
        // TODO add your handling code here:
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.##");
        for(int i = 0; i < pila1.getTamañoArreglo(); i++){
            double num = random.nextInt(100) + random.nextDouble();
            double num2 = random.nextInt(100) + random.nextDouble();

            pila1.push(Double.parseDouble(df.format(num)));
            pila2.push(Double.parseDouble(df.format(num2)));
        }
        
        mostrarPila(pila1, jTablePila1);
        mostrarPila(pila2, jTablePila2);
        
    }//GEN-LAST:event_jButtonAleatorioActionPerformed

    private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed
        // TODO add your handling code here:
        sumarPilas();
        mostrarPila(pila1, jTablePila1);
        mostrarPila(pila2, jTablePila2);
    }//GEN-LAST:event_jButtonSumarActionPerformed

    private void P1xP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1xP2ActionPerformed
        // TODO add your handling code here:
        intPP1PorPenultP2();
        mostrarPila(pila1, jTablePila1);
        mostrarPila(pila2, jTablePila2);
        mostrarPila(pila3, jTablePila3);
    }//GEN-LAST:event_P1xP2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            double numeroABuscar = Double.parseDouble(jTextFieldBuscar.getText());
            int posicion = pila1.indiceDe(numeroABuscar);
            JOptionPane.showMessageDialog(this, posicion);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario1().setVisible(true);
            }
        });
    }
    
    public void mostrarPila(PilaGenerica<Double> pila, JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        modelo.setRowCount(pila.getTope());
        int cont = pila.getTope();
        
        double num;
        
        int i = 0;
        PilaGenerica<Double> aux = new PilaGenerica(pila.getTamañoArreglo());
        while(!pila.pilaVacia()){
            num = pila.pop();
            tabla.setValueAt(num, i++, 0);
            aux.push(num);
        }
        
        while(!aux.pilaVacia()){
            pila.push(aux.pop());
        }
    }
    
    public void intPP1PorPenultP2(){
        if(pila1.getTope() > 0 && pila2.getTope() > 2){
            PilaGenerica<Double> pAux1 = new PilaGenerica(pila1.getTope()-1);
            
            while(!pAux1.pilaLlena()){
                pAux1.push(pila1.pop());
            }
            
            double n1 = pila1.pop();
            
            double nu, np;
            nu = pila2.pop();
            np = pila2.pop();
            
            pila2.push(n1);
            pila2.push(nu);
            
            pila1.push(np);
            
            while(!pAux1.pilaVacia()){
                pila1.push(pAux1.pop());
            }
        }
    }
    
    public void intercambiarElemento(PilaGenerica<Double> p1, PilaGenerica<Double> p2, int posicion1, int posicion2){
        
        
    }
    public void sumarPilas(){
        if(!pila1.pilaVacia() && !pila2.pilaVacia()){
        PilaGenerica<Double> aP1 = new PilaGenerica(pila1.getTope());
        PilaGenerica<Double> aP2 = new PilaGenerica(pila1.getTope());
        
        
        while(!pila1.pilaVacia()){
            aP1.push(pila1.pop());
        }
        
        while(!pila2.pilaVacia()){
            aP2.push(pila2.pop());
        }
        
        double n1, n2;
        while(!aP1.pilaVacia()){
            n1 = aP1.pop();
            n2 = aP2.pop();
            pila3.push(n1 + n2);
            
            pila1.push(n1);
            pila2.push(n2);
        }
        }
        else{
            JOptionPane.showMessageDialog(this,"No pueden estar vacias la pila 1 y 2");
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton P1xP2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAleatorio;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonSumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePila1;
    private javax.swing.JTable jTablePila2;
    private javax.swing.JTable jTablePila3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
