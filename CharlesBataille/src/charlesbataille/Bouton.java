/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charlesbataille;

/**
 *
 * @author François
 */
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
 
import javax.swing.JButton;
  
public class Bouton extends JButton implements MouseListener{
    private String name;
    private Image img;
    
    public Bouton(String str){
        super(str);
        this.name = str;
        this.setBorderPainted(false);
        this.setOpaque(false);
        this.setBackground(new Color(0,true));

//this.setContentAreaFilled(false);
//this.setFocusPainted(false);

        try {
            img = ImageIO.read(new File("jouer_normal.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.addMouseListener(this);
    }
       
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
        GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 20, Color.cyan, true);
         g2d.setPaint(gp);
    }
    
      //Méthode appelée lors du clic de souris
    @Override
    public void mouseClicked(MouseEvent event) {
        System.out.print("Salut");
    }

    //Méthode appelée lors du survol de la souris
    @Override
    public void mouseEntered(MouseEvent event) {
        //Nous changeons le fond de notre image pour le orange lorsque nous relâchons le clic, avec le fichier fondBoutonHover.png
        try {
            img = ImageIO.read(new File("jouer_survol.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }

  //Méthode appelée lorsque la souris sort de la zone du bouton
    
    @Override
  public void mouseExited(MouseEvent event) { 
    try {
        img = ImageIO.read(new File("jouer_survol.png"));
    } catch (IOException e) {
        e.printStackTrace();
    }
     System.out.print("Quitter !!!");
  }

  //Méthode appelée lorsque l'on presse le bouton gauche de la souris
    @Override
  public void mousePressed(MouseEvent event) {
    try {
        img = ImageIO.read(new File("jouer_normal.png"));
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.print("Quitter !!!2");
  }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

