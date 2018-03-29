package GUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class Calculos extends javax.swing.JDialog {

    private final String ruta = System.getProperties().getProperty("user.dir")+"//";
    int numeros[] = new int[3];
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    public Calculos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    try {
         archivo = new File (ruta+"Numeros.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);         
         String linea;
         StringTokenizer token;
         int n = 0;
         while((linea=br.readLine())!=null){
             token = new StringTokenizer(linea, "\t");
             while(token.hasMoreTokens()){
                 numeros[n] = Integer.parseInt(token.nextToken());
                 n++;
             }
         }          
      }      
      catch(IOException e){}finally{try{if( null != fr ){fr.close();}}catch (IOException e2){}
      }    
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cj_respuesta = new javax.swing.JTextField();
        Dividir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Dividir1 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("Resultados");

        cj_respuesta.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cj_respuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cj_respuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cj_respuestaActionPerformed(evt);
            }
        });

        Dividir.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        Dividir.setText("Multiplica");
        Dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DividirActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jButton2.setText("Restar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jButton3.setText("Sumar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Dividir1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        Dividir1.setText("Volver");
        Dividir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dividir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Dividir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cj_respuesta)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Dividir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cj_respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dividir)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Dividir1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cj_respuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cj_respuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cj_respuestaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cj_respuesta.setText(""+(numeros[0]+numeros[1]+numeros[2]));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cj_respuesta.setText(""+(numeros[0]-numeros[1]-numeros[2]));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DividirActionPerformed
        cj_respuesta.setText(""+(numeros[0]*numeros[1]*numeros[2]));
    }//GEN-LAST:event_DividirActionPerformed

    private void Dividir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dividir1ActionPerformed
        dispose();
    }//GEN-LAST:event_Dividir1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Calculos dialog = new Calculos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dividir;
    private javax.swing.JButton Dividir1;
    private javax.swing.JTextField cj_respuesta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
