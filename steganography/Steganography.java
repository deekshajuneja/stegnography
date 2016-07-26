/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package steganography;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
*
 * @author Sukanya
 */
public class Steganography {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        }); // TODO code application logic here
    }
}
