package steganography;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
@author Sukanya
 */
public class mainPage extends javax.swing.JFrame {

    /*Creates new form mainPage*/
    public mainPage() {
        initComponents();
    }

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        openfc = new javax.swing.JFileChooser();
        extraction = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        Choose = new javax.swing.JButton();
        Decode = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        dText = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dheight = new javax.swing.JLabel();
        dwidth = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        savefc = new javax.swing.JFileChooser();
        dopenfc = new javax.swing.JFileChooser();
        choose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        etext = new javax.swing.JTextArea();
        Encoding = new javax.swing.JLabel();
        width = new javax.swing.JLabel();
        Height = new javax.swing.JLabel();
        Encode = new javax.swing.JButton();
        Dsection = new javax.swing.JButton();
        ewidth = new javax.swing.JLabel();
        eheight = new javax.swing.JLabel();

        extraction.setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        jLabel1.setText("Decoding: Data retrieval");

        Choose.setText("Choose file");
        Choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseActionPerformed(evt);
            }
        });

        Decode.setText("Decode");
        Decode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecodeActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        dText.setColumns(20);
        dText.setRows(5);
        jScrollPane2.setViewportView(dText);

        jLabel2.setText("Width");

        jLabel3.setText("Height");

        back.setText("back (Encoding section)");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout extractionLayout = new javax.swing.GroupLayout(extraction.getContentPane());
        extraction.getContentPane().setLayout(extractionLayout);
        extractionLayout.setHorizontalGroup(
            extractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extractionLayout.createSequentialGroup()
                .addGroup(extractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(extractionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit))
                    .addGroup(extractionLayout.createSequentialGroup()
                        .addGroup(extractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(extractionLayout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addGroup(extractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(extractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dheight, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                    .addComponent(dwidth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(extractionLayout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(extractionLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(extractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(extractionLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Decode, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                    .addGroup(extractionLayout.createSequentialGroup()
                                        .addGap(165, 165, 165)
                                        .addComponent(Choose)
                                        .addGap(0, 415, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(extractionLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        extractionLayout.setVerticalGroup(
            extractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extractionLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(extractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(dheight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(extractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(dwidth, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(extractionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, extractionLayout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, extractionLayout.createSequentialGroup()
                        .addComponent(Choose, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Decode, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addComponent(Exit)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        choose.setText("Select file");
        choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseActionPerformed(evt);
            }
        });

        etext.setColumns(20);
        etext.setFont(new java.awt.Font("Monospaced", 2, 14)); // NOI18N
        etext.setRows(5);
        etext.setText("Enter your text here..");
        jScrollPane1.setViewportView(etext);

        Encoding.setFont(new java.awt.Font("Lucida Calligraphy", 1, 18)); // NOI18N
        Encoding.setText("           Encoding:data hiding");

        width.setText("Width");

        Height.setText("Height");

        Encode.setText("Encode");
        Encode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncodeActionPerformed(evt);
            }
        });

        Dsection.setText("NEXT (Decoding section)");
        Dsection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DsectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(Encode, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(choose, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(Dsection, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(181, 181, 181))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(Encoding, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ewidth, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Height, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eheight, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Height, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Encoding, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                        .addComponent(eheight, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ewidth, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(width))
                .addGap(95, 95, 95)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Encode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dsection, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
File efile,dfile;
BufferedImage image;
    private void chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseActionPerformed
 int Fvalue = openfc.showOpenDialog(this);

      if (Fvalue == JFileChooser.APPROVE_OPTION) {
       efile = openfc.getSelectedFile();
     try {
         image = ImageIO.read(efile);
     } catch (IOException ex) {
         Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
     }
         } 
         
        eheight.setText(""+image.getHeight());
        ewidth.setText(""+image.getWidth());
      
      if (Fvalue == JFileChooser.CANCEL_OPTION) {
        System.out.println("You pressed cancel");
      }
 
    }//GEN-LAST:event_chooseActionPerformed

    private void EncodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncodeActionPerformed
String message=etext.getText();
      byte[] num=message.getBytes();
      int MessageLength=message.length();
      int count=0;
      int h=image.getHeight();
      int w=image.getWidth();
      int red,color,blue,green,i,j;
      for(i=1;i<=h&&(count<MessageLength);i++){
            for(j=1;j<=w&&(count<MessageLength);j++){
        //FINDING the RGB value of the pixels and then REPLACING the blue value and subsituting it again into the buffered image
        color=  image.getRGB(i,j); 
        red   = (color & 0x00ff0000) >> 16;
        green = (color & 0x0000ff00) >> 8;
        blue  =  num[count];
        
        int rgb=(red<<16)|(green<<8)|blue;
        image.setRGB(i,j,rgb);
        count++;
        }
             
        // saving the last value,which is an eof.
       color=  image.getRGB(i,j+1); 
        red   = (color & 0x00ff0000) >> 16;
        green = (color & 0x0000ff00) >> 8;
        blue  =  255;
      
        int rgb=(red<<16)|(green<<8)|blue;
        image.setRGB(i,j+1,rgb);
      }  
          //saving the file using a filechooser
     int saveValue=savefc.showSaveDialog(this);
  if (saveValue == JFileChooser.APPROVE_OPTION) {
            try {
               ImageIO.write(image, "png", savefc.getSelectedFile());
            } catch (IOException e) {
            }
   }
    }//GEN-LAST:event_EncodeActionPerformed

    private void DsectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DsectionActionPerformed
extraction.setVisible(true);
dispose();
    }//GEN-LAST:event_DsectionActionPerformed

    private void ChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseActionPerformed
 int Fvalue = dopenfc.showOpenDialog(this);
      if (Fvalue == JFileChooser.APPROVE_OPTION) {
       dfile = dopenfc.getSelectedFile();
     try {
         image = ImageIO.read(dfile);
     } catch (IOException ex) {
         Logger.getLogger(mainPage.class.getName()).log(Level.SEVERE, null, ex);
     }
            
         
        dheight.setText(""+image.getHeight());
        dwidth.setText(""+image.getWidth());
      }
      if (Fvalue == JFileChooser.CANCEL_OPTION) {
        System.out.println("You pressed cancel");
      }        // TODO add your handling code here:
    }//GEN-LAST:event_ChooseActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
setVisible(true);
extraction.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void DecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecodeActionPerformed
 int i,j,clr,blue=0,count=1;
char[] c=new char[100];
for(i=1;i<=image.getHeight()&&blue!=255;i++){
      for(j=1;j<=image.getWidth()&&blue!=255;j++){
         clr=  image.getRGB(i,j);
         int red   = (clr & 0x00ff0000) >> 16;
         int green = (clr & 0x0000ff00) >> 8;
         blue  =  clr & 0x000000ff;
        // System.out.println(""+blue);
         c[count]=(char) blue;
         count++;
         //System.out.println(c);
         }
 String str=new String(c);
 dText.setText(str);
}        
    }//GEN-LAST:event_DecodeActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
System.exit(0);        
    }//GEN-LAST:event_ExitActionPerformed

   
    public static void main(String args[]) {
    
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
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Choose;
    private javax.swing.JButton Decode;
    private javax.swing.JButton Dsection;
    private javax.swing.JButton Encode;
    private javax.swing.JLabel Encoding;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel Height;
    private javax.swing.JButton back;
    private javax.swing.JButton choose;
    private javax.swing.JTextArea dText;
    private javax.swing.JLabel dheight;
    private javax.swing.JFileChooser dopenfc;
    private javax.swing.JLabel dwidth;
    private javax.swing.JLabel eheight;
    private javax.swing.JTextArea etext;
    private javax.swing.JLabel ewidth;
    private javax.swing.JFrame extraction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFileChooser openfc;
    private javax.swing.JFileChooser savefc;
    private javax.swing.JLabel width;
    // End of variables declaration//GEN-END:variables
}
