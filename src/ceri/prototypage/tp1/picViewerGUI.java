/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceri.prototypage.tp1;

import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author tansadio
 */
public class picViewerGUI extends javax.swing.JFrame {

    /**
     * Creates new form picViewerGUI
     */
    public picViewerGUI() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        PanelGauche = new javax.swing.JPanel();
        modifyImage = new javax.swing.JButton();
        searchImage = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        addImage = new javax.swing.JButton();
        deleteImage = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        browse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelImage = new javax.swing.JPanel();
        PanelDroit = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        addTag = new javax.swing.JButton();
        frenchLanguage = new javax.swing.JButton();
        englishLanguage = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        imgCenter = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jSplitPane1.setDividerLocation(220);

        modifyImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceri/prototypage/tp1/images/pencil.gif"))); // NOI18N
        modifyImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyImageActionPerformed(evt);
            }
        });

        searchImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceri/prototypage/tp1/images/search.gif"))); // NOI18N

        addImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceri/prototypage/tp1/images/plus.gif"))); // NOI18N
        addImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImageActionPerformed(evt);
            }
        });

        deleteImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceri/prototypage/tp1/images/delete.gif"))); // NOI18N
        deleteImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteImageActionPerformed(evt);
            }
        });

        browse.setFont(new java.awt.Font("Ubuntu", 0, 10)); // NOI18N
        browse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceri/prototypage/tp1/images/folder.gif"))); // NOI18N
        browse.setText("Nom du Répertoire d'images");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        PanelImage.setLayout(new javax.swing.BoxLayout(PanelImage, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(PanelImage);

        javax.swing.GroupLayout PanelGaucheLayout = new javax.swing.GroupLayout(PanelGauche);
        PanelGauche.setLayout(PanelGaucheLayout);
        PanelGaucheLayout.setHorizontalGroup(
            PanelGaucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGaucheLayout.createSequentialGroup()
                .addGroup(PanelGaucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGaucheLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelGaucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(browse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelGaucheLayout.createSequentialGroup()
                                .addComponent(addImage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modifyImage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchImage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteImage)
                                .addGap(0, 53, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        PanelGaucheLayout.setVerticalGroup(
            PanelGaucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGaucheLayout.createSequentialGroup()
                .addComponent(browse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelGaucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGaucheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(modifyImage)
                        .addComponent(searchImage)
                        .addComponent(addImage))
                    .addComponent(deleteImage, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(PanelGauche);

        addTag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceri/prototypage/tp1/images/plus.png"))); // NOI18N
        addTag.setText("Tag");

        frenchLanguage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceri/prototypage/tp1/images/france.png"))); // NOI18N

        englishLanguage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceri/prototypage/tp1/images/britain.png"))); // NOI18N

        image.setText("image");

        imgCenter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imgCenter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ceri/prototypage/tp1/images/refresh.png"))); // NOI18N
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDroitLayout = new javax.swing.GroupLayout(PanelDroit);
        PanelDroit.setLayout(PanelDroitLayout);
        PanelDroitLayout.setHorizontalGroup(
            PanelDroitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDroitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDroitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDroitLayout.createSequentialGroup()
                        .addComponent(addTag)
                        .addGap(138, 138, 138)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(frenchLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(englishLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addContainerGap())
            .addGroup(PanelDroitLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(imgCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDroitLayout.setVerticalGroup(
            PanelDroitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDroitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDroitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDroitLayout.createSequentialGroup()
                        .addGroup(PanelDroitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addTag)
                            .addComponent(image))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDroitLayout.createSequentialGroup()
                        .addGroup(PanelDroitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(englishLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frenchLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jSplitPane1.setRightComponent(PanelDroit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //Create a file chooser
    public JFileChooser fc = new JFileChooser();
    public ArrayList<JLabel> addImageInPanel = new ArrayList<>();
    public Hashtable<String,JLabel> addIm = new Hashtable<String,JLabel>();
    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        // TODO add your handling code here:
        //Handle open button action.
        if (evt.getSource() == browse) {
            // FileNameExtensionFilter filter = new FileNameExtensionFilter(
             // "JPG,GIF,PNG Images", "jpeg","jpg", "gif","png");
            //fc.setFileFilter(filter);
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY );
            int returnVal = fc.showOpenDialog(picViewerGUI.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
               
                if (file.isDirectory()) {
                    for(File fileEntry: file.listFiles()){
                        ImageIcon img = new ImageIcon(fileEntry.getPath());
                        ImageIcon icon = new ImageIcon(getScaledImage(img.getImage(), 90, 70));                        
                        JLabel newLabel = new JLabel(icon);
                        newLabel.setBorder(new EmptyBorder(10, 10, 0, 0));
                        newLabel.addMouseListener(new MouseAdapter(){
                        public void mousePressed(MouseEvent me){
                            int width = img.getIconHeight();
                            int height = img.getIconHeight();
                            if ((width >400) || (height > 319)){
                                imgCenter.setIcon(new ImageIcon(getScaledImage(img.getImage(), 400, 310)));
                            }
                            else imgCenter.setIcon(img);
                            String fileName = fileEntry.getName();
                            fileName = fileName.substring(0, fileName.lastIndexOf("."));
                            image.setText(fileName);
                        }
                        });
                        String fileName = fileEntry.getName();
                        fileName = fileName.substring(0, fileName.lastIndexOf('.'));
                        System.out.println("FileName : " + fileName);
                        addIm.put(fileName, newLabel);                        
                        //addImageInPanel.add(newLabel); 
                        //System.out.println("file.getName(): " + fileEntry.getName());
                        //System.out.println(fileEntry.getPath() + " : Hauteur -> "
                          //      + icon.getIconHeight() + " :Largeur " + icon.getIconWidth());
                        //System.out.println("---------: " + addImageInPanel[i].getText());
                    }
                    Enumeration e = addIm.elements();
                    while(e.hasMoreElements())
                        PanelImage.add((Component)e.nextElement());
                    /*addImageInPanel.stream().forEach((addImageInPanel1) -> {
                        PanelImage.add(addImageInPanel1);
                    });*/
                    image.setText(file.getName());
                }
               
            } else {
                 image.setText("Cancel");
            }
       } 
    }//GEN-LAST:event_browseActionPerformed
    protected ImageIcon createImageIcon(String path, String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
     private Image getScaledImage(Image srcImg, int w, int h){
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();
        return resizedImg;
    }
    private void addImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImageActionPerformed
        // Code qui gère le bouton d'ajout d'images
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY );
        int returnVal = fc.showOpenDialog(picViewerGUI.this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                if(file.isFile())
                {
                    ImageIcon img = new ImageIcon(file.getPath());
                    ImageIcon icon = new ImageIcon(getScaledImage(img.getImage(), 90, 70));                        
                    JLabel newLabel = new JLabel(icon);
                    newLabel.setBorder(new EmptyBorder(10, 10, 0, 0));
                    newLabel.addMouseListener(new MouseAdapter(){
                        public void mousePressed(MouseEvent me){
                            int width = img.getIconHeight();
                            int height = img.getIconHeight();
                            if ((width >400) || (height > 319)){
                                imgCenter.setIcon(new ImageIcon(getScaledImage(img.getImage(), 400, 310)));
                            }
                            else imgCenter.setIcon(new ImageIcon(file.getPath()));
                            String fileName = file.getName();
                            fileName = fileName.substring(0, fileName.lastIndexOf("."));
                            image.setText(fileName);
                        }
                    });
                    String fileName = file.getName();
                    fileName = fileName.substring(0, fileName.lastIndexOf("."));
                    addIm.put(fileName, newLabel);
                    Enumeration e = addIm.elements();
                    while(e.hasMoreElements())
                        PanelImage.add((Component) e.nextElement());
                    //addImageInPanel.add(newLabel); 
                    //PanelImage.add(newLabel);
                     image.setText(fileName);
                }
            }
    }//GEN-LAST:event_addImageActionPerformed

    private void modifyImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyImageActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("InputDialog modify");
        String message = JOptionPane.showInputDialog(
            frame, 
            "Enter le nom de l'image", 
            "Renommer un fichier",
            JOptionPane.WARNING_MESSAGE
        );
        
    }//GEN-LAST:event_modifyImageActionPerformed

    private void deleteImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteImageActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("InputDialog delete");
        String message = JOptionPane.showInputDialog(
            frame, 
            "Enter le nom de l'image", 
            "Supprimer un fichier",
            JOptionPane.ERROR_MESSAGE
        );
        PanelImage.remove((JLabel)addIm.get(message));
        imgCenter.setIcon(null);
        addIm.remove(message);
    }//GEN-LAST:event_deleteImageActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
       SwingUtilities.updateComponentTreeUI(this);
       PanelImage.repaint();
    }//GEN-LAST:event_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(picViewerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(picViewerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(picViewerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(picViewerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new picViewerGUI().setVisible(true);
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDroit;
    private javax.swing.JPanel PanelGauche;
    private javax.swing.JPanel PanelImage;
    private javax.swing.JButton addImage;
    private javax.swing.JButton addTag;
    private javax.swing.JButton browse;
    private javax.swing.JButton deleteImage;
    private javax.swing.JButton englishLanguage;
    private javax.swing.JButton frenchLanguage;
    private javax.swing.JLabel image;
    private javax.swing.JLabel imgCenter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton modifyImage;
    private javax.swing.JButton refresh;
    private javax.swing.JButton searchImage;
    // End of variables declaration//GEN-END:variables
}
