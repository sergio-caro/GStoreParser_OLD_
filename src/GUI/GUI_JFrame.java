/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import html_parser.ParserClass;
import threads.Hilo_Conn_Base;
import java.awt.Color;
import java.io.File;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author sergio
 */
public class GUI_JFrame extends javax.swing.JFrame {

    /**
     * Creates new form GUI_JFrame
     */
    private Hilo_Conn_Base hilo_conexiones;

    // Directory separator (Unix-based by default)
    private String path_separator = "/";
    // Default directory (Unix-based by default)
    private String base_path = "/Users/sergio/Dropbox/Universidad/Doctorado/Estudio Android/paso 1/instant messenger/";

    public GUI_JFrame() {
        if (is_win_based_os()) {
            // If Win-based OS, change path to a Windows format
            this.path_separator = "\\";
            this.base_path = "C:\\Users\\Sergio\\Dropbox\\Universidad\\Doctorado\\Estudio Android\\paso 1\\instant messenger\\";
        }
    
        initComponents();

        jtf_filePath.setText(this.base_path);
    }

    public String get_base_path() {
        return path_separator;
    }

    public final boolean is_win_based_os() {
        String nombreSistemaOperativo = System.getProperty("os.name")
                .toLowerCase();
        return nombreSistemaOperativo.contains("win");
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
        jtf_filePath = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtf_fileName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton_Initialize = new javax.swing.JButton();
        jButton_haltRequest = new javax.swing.JButton();
        jToggleButton_start_stop = new javax.swing.JToggleButton();
        jButton_BrowseFile = new javax.swing.JButton();
        jButton_GenerateLinks = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Google Store Parser (v.2.1.5.alpha)");

        jLabel1.setText("Directorio:");

        jtf_filePath.setText("/Users/sergio/Dropbox/Universidad/Doctorado/Estudio Android/paso 1/instant messenger/");
        jtf_filePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_filePathActionPerformed(evt);
            }
        });

        jLabel2.setText("Fichero:");

        jtf_fileName.setText("app_list.html");

        jLabel3.setText("Log:");

        jScrollPane1.setEnabled(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton_Initialize.setBackground(new java.awt.Color(204, 255, 204));
        jButton_Initialize.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton_Initialize.setText("Inicializar Componentes");
        jButton_Initialize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InitializeActionPerformed(evt);
            }
        });

        jButton_haltRequest.setBackground(new java.awt.Color(255, 153, 153));
        jButton_haltRequest.setText("Detener Ejecución");
        jButton_haltRequest.setEnabled(false);
        jButton_haltRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_haltRequestActionPerformed(evt);
            }
        });

        jToggleButton_start_stop.setBackground(new java.awt.Color(0, 255, 0));
        jToggleButton_start_stop.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jToggleButton_start_stop.setText("Start");
        jToggleButton_start_stop.setEnabled(false);
        jToggleButton_start_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_start_stopActionPerformed(evt);
            }
        });

        jButton_BrowseFile.setBackground(new java.awt.Color(255, 255, 153));
        jButton_BrowseFile.setText("Browse File");
        jButton_BrowseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BrowseFileActionPerformed(evt);
            }
        });

        jButton_GenerateLinks.setBackground(new java.awt.Color(213, 149, 255));
        jButton_GenerateLinks.setText("Generar Links");
        jButton_GenerateLinks.setToolTipText("Generar fichero con los Hipervinculos a las apps.");
        jButton_GenerateLinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GenerateLinksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_filePath))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_fileName, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_BrowseFile)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_GenerateLinks)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton_Initialize)
                .addGap(65, 65, 65)
                .addComponent(jToggleButton_start_stop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_haltRequest)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtf_filePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_fileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_BrowseFile)
                    .addComponent(jButton_GenerateLinks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Initialize)
                    .addComponent(jButton_haltRequest)
                    .addComponent(jToggleButton_start_stop))
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_filePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_filePathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_filePathActionPerformed

    private void jButton_InitializeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InitializeActionPerformed
        if (this.jtf_filePath.getText().isEmpty() || this.jtf_fileName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El directorio/fichero no puede ser vacío", null, JOptionPane.ERROR_MESSAGE);
        } else {
            this.jTextArea1.setText("");
            this.hilo_conexiones = new Hilo_Conn_Base(jtf_filePath.getText(), jtf_fileName.getText(), jTextArea1, this);
            if (this.hilo_conexiones.isOk_initialization()) {
                toggleButtons(false);
                this.jtf_fileName.setToolTipText("");
                this.hilo_conexiones.start();
            }
        }
    }//GEN-LAST:event_jButton_InitializeActionPerformed

    private void jButton_haltRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_haltRequestActionPerformed
        //Solicitar la finalización de la ejecución
        this.hilo_conexiones.halt_request();
        add_to_log("Solicitando fin de ejecución.........");
        toggleButtons(true);
        this.jButton_Initialize.setEnabled(false);
        jButton_BrowseFile.setEnabled(false);
        jButton_GenerateLinks.setEnabled(false);
        this.jtf_fileName.setText("");
        this.jtf_fileName.setToolTipText("Indica el nombre de fichero creado (ver LOG)");
    }//GEN-LAST:event_jButton_haltRequestActionPerformed

    private void jToggleButton_start_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_start_stopActionPerformed
        if (jToggleButton_start_stop.isSelected()) {
            this.hilo_conexiones.initalize_request();
            jToggleButton_start_stop.setText("Stop");
            jToggleButton_start_stop.setBackground(Color.yellow);
        } else {
            this.hilo_conexiones.stop_temporarly();
            add_to_log("[INFO] El hilo descansará hasta próximas órdenes.");
            jToggleButton_start_stop.setText("Start");
            jToggleButton_start_stop.setBackground(Color.green);
        }
    }//GEN-LAST:event_jToggleButton_start_stopActionPerformed

    private void jButton_BrowseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BrowseFileActionPerformed
        JFileChooser fileChooser = generateFileChooser();

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            this.jtf_fileName.setText(selectedFile.getName());
            this.jtf_filePath.setText(selectedFile.getParent() + path_separator);
        }
    }//GEN-LAST:event_jButton_BrowseFileActionPerformed

    private JFileChooser generateFileChooser() {
        JFileChooser fileChooser = new JFileChooser();

        if (!this.jtf_filePath.getText().isEmpty()) {
            File f = new File(this.jtf_filePath.getText());
            if (f.isDirectory()) {
                fileChooser.setCurrentDirectory(f);
            } else {
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            }
        } else {
            //No hay directorio, coger la home
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        }
        return fileChooser;
    }

    private void jButton_GenerateLinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GenerateLinksActionPerformed
        // Genera un fichero HTML para por utilizar en la aplicación.
        this.jButton_Initialize.setEnabled(false);
        this.jTextArea1.setText("");
        //Seleccionar fichero
        JFileChooser fileChooser = generateFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            this.jtf_fileName.setText("app_list.html");
            this.jtf_filePath.setText(selectedFile.getParent() + path_separator);
            //Analizar fichero
            ParserClass pc = new ParserClass(this);
            pc.generate_hyperlink_file(selectedFile.getParent() + path_separator, selectedFile.getName());
        }
    }//GEN-LAST:event_jButton_GenerateLinksActionPerformed

    public void toggleButtons(boolean b) {
        this.jButton_Initialize.setEnabled(b);
        jButton_BrowseFile.setEnabled(b);
        jButton_GenerateLinks.setEnabled(b);
        this.jButton_haltRequest.setEnabled(!b);
        this.jToggleButton_start_stop.setEnabled(!b);
    }

    public void add_to_log(String text) {
        this.jTextArea1.setText(jTextArea1.getText() + "\n [" + (new Date()).toString() + "] [JFrame] " + text);
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public javax.swing.JButton getjButton_Initialize() {
        jButton_BrowseFile.setEnabled(true);
        jButton_GenerateLinks.setEnabled(true);
        return jButton_Initialize;
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
            java.util.logging.Logger.getLogger(GUI_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_BrowseFile;
    private javax.swing.JButton jButton_GenerateLinks;
    private javax.swing.JButton jButton_Initialize;
    private javax.swing.JButton jButton_haltRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToggleButton jToggleButton_start_stop;
    private javax.swing.JTextField jtf_fileName;
    private javax.swing.JTextField jtf_filePath;
    // End of variables declaration//GEN-END:variables
}
