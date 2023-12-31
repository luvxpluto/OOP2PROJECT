/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author esteban
 */
public class InterfazUsurio extends javax.swing.JFrame {

  /**
   * Creates new form InterfazUsurio
   */
  public InterfazUsurio() {
    initComponents();
    txtSalida.setEnabled(false);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jSpinner1 = new javax.swing.JSpinner();
    jPanel1 = new javax.swing.JPanel();
    lbDescripcion = new javax.swing.JLabel();
    lbOperacion = new javax.swing.JLabel();
    cbOperaciones = new javax.swing.JComboBox<>();
    cbAlgoritmos = new javax.swing.JComboBox<>();
    lbAlgoritmo = new javax.swing.JLabel();
    btAbrirTXT = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    txtEntrada = new javax.swing.JTextArea();
    lbEntrada = new javax.swing.JLabel();
    btAplicarAlgoritmo = new javax.swing.JButton();
    lbSalida = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    txtSalida = new javax.swing.JTextArea();
    btEnviarCorreo = new javax.swing.JButton();
    btSalir = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(177, 74, 207));

    jPanel1.setBackground(new java.awt.Color(177, 174, 207));

    lbDescripcion.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 1, 18)); // NOI18N
    lbDescripcion.setForeground(new java.awt.Color(255, 255, 255));
    lbDescripcion.setText("Dígite el texto que desea cifrar/descifrar o cargue un archivo TXT con el contenido del texto");

    lbOperacion.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 14)); // NOI18N
    lbOperacion.setForeground(new java.awt.Color(255, 255, 255));
    lbOperacion.setText("Operación a realizar:");

    cbOperaciones.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
    cbOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cifrado", "Descifrado" }));
    cbOperaciones.setBorder(null);

    cbAlgoritmos.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
    cbAlgoritmos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "César", "Llave", "Vigenére", "Palabra inversa", "Mensaje inverso", "Código telefónico", "Codificacion binaria", "DES", "AES" }));

    lbAlgoritmo.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 14)); // NOI18N
    lbAlgoritmo.setForeground(new java.awt.Color(255, 255, 255));
    lbAlgoritmo.setText("Algoritmo");

    btAbrirTXT.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
    btAbrirTXT.setText("Abir archivo TXT");
    btAbrirTXT.setAlignmentX(0.5F);
    btAbrirTXT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btAbrirTXT.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btAbrirTXTActionPerformed(evt);
      }
    });

    txtEntrada.setColumns(20);
    txtEntrada.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
    txtEntrada.setRows(5);
    jScrollPane1.setViewportView(txtEntrada);

    lbEntrada.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 14)); // NOI18N
    lbEntrada.setForeground(new java.awt.Color(255, 255, 255));
    lbEntrada.setText("Entrada:");

    btAplicarAlgoritmo.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
    btAplicarAlgoritmo.setText("Aplicar algoritmo");
    btAplicarAlgoritmo.setAlignmentX(0.5F);
    btAplicarAlgoritmo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    lbSalida.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 14)); // NOI18N
    lbSalida.setForeground(new java.awt.Color(255, 255, 255));
    lbSalida.setText("Salida:");

    txtSalida.setColumns(20);
    txtSalida.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
    txtSalida.setRows(5);
    jScrollPane2.setViewportView(txtSalida);

    btEnviarCorreo.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
    btEnviarCorreo.setText("Enviar por correo");
    btEnviarCorreo.setAlignmentX(0.5F);
    btEnviarCorreo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btEnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btEnviarCorreoActionPerformed(evt);
      }
    });

    btSalir.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 13)); // NOI18N
    btSalir.setText("Salir");
    btSalir.setAlignmentX(0.5F);
    btSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btSalirActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(79, 79, 79)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(lbDescripcion)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbOperacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAlgoritmo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbAlgoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(56, 56, 56)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lbEntrada)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lbSalida)
              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(56, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(btAbrirTXT)
            .addGap(437, 437, 437))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(btAplicarAlgoritmo)
            .addGap(430, 430, 430))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(42, 42, 42)
            .addComponent(btEnviarCorreo)
            .addGap(365, 365, 365))))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addComponent(lbDescripcion)
        .addGap(18, 18, 18)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lbOperacion)
          .addComponent(cbOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbAlgoritmo)
          .addComponent(cbAlgoritmos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btAbrirTXT)
        .addGap(45, 45, 45)
        .addComponent(lbEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btAplicarAlgoritmo)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(lbSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(28, 28, 28)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btEnviarCorreo)
          .addComponent(btSalir))
        .addContainerGap(39, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btEnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarCorreoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btEnviarCorreoActionPerformed

  private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btSalirActionPerformed

  private void btAbrirTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirTXTActionPerformed
    // TODO add your handling code here:
    JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt");

    chooser.setFileFilter(filter);

    int returnVal = chooser.showOpenDialog(this);
    
    if (returnVal == JFileChooser.APPROVE_OPTION) {
      File file = chooser.getSelectedFile();
      // Verificar la extensión del archivo
      if (file.getName().toLowerCase().endsWith(".txt")) {
        try {
          Scanner scanner = new Scanner(file);
          while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            txtEntrada.insert(data, 0);
          }
          scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
      } else {
          // Alerta si el archivo no es de tipo ".txt"
          JOptionPane.showMessageDialog(this, "Por favor, seleccione un archivo de texto (.txt).", "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }//GEN-LAST:event_btAbrirTXTActionPerformed

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
      java.util.logging.Logger.getLogger(InterfazUsurio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(InterfazUsurio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(InterfazUsurio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(InterfazUsurio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new InterfazUsurio().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btAbrirTXT;
  private javax.swing.JButton btAplicarAlgoritmo;
  private javax.swing.JButton btEnviarCorreo;
  private javax.swing.JButton btSalir;
  private javax.swing.JComboBox<String> cbAlgoritmos;
  private javax.swing.JComboBox<String> cbOperaciones;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JSpinner jSpinner1;
  private javax.swing.JLabel lbAlgoritmo;
  private javax.swing.JLabel lbDescripcion;
  private javax.swing.JLabel lbEntrada;
  private javax.swing.JLabel lbOperacion;
  private javax.swing.JLabel lbSalida;
  private javax.swing.JTextArea txtEntrada;
  private javax.swing.JTextArea txtSalida;
  // End of variables declaration//GEN-END:variables
}
