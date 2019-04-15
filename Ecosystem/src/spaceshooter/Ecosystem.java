/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author 627997
 */
public class Ecosystem extends JPanel {

    private final Timer timer;
    private final ArrayList<Creature> creatures;
    private final ArrayList<Colts> coltss;
    private final ArrayList<Panthers> pantherss;
    private final ArrayList<Packers> packerss;
    private final ArrayList<Football> footballs;
    private boolean gameover = false;
    //private int coltsCount = 0;
        
    public Ecosystem() {
        super();
        //setSize(1200, 960);
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 1000, 1000/60);
        creatures = new ArrayList<>(7);
        footballs = new ArrayList<>(10);
        coltss = new ArrayList<>(11);
        pantherss = new ArrayList<>(11);
        packerss = new ArrayList<>(11);
        for (int i = 0; i < 11; i++) {
        coltss.add(new Colts());
        
    }
        for (int i = 0; i < 11; i++) {
        packerss.add(new Packers());
    }
        for (int i = 0; i < 11; i++) {
        pantherss.add(new Panthers());
    }
        for (int i = 0; i < 3; i++) {
        footballs.add(new Football());
    }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
        
        
        if(gameover == true) {
            g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
            g.setColor(Color.white);
            g.drawString("Colts Win", 325, 400);
}
        
        this.setBackground(new java.awt.Color(0, 153, 0));
        for (Colts colts : coltss) {
            colts.draw(g);
        }
        for (Panthers panthers : pantherss) {
            panthers.draw(g);
        }
        for (Packers packers : packerss) {
            packers.draw(g);
        }
        
        for (Football football : footballs) {
            //football.draw(g);
        }
    }
    
    private class ScheduleTask extends TimerTask {
        
        @Override
        public void run() {
            
            
            

            
            for (Panthers panthers : pantherss) {
            panthers.update();
            }
            for (Colts colts : coltss) {
            colts.update();
            
            if (colts.getX() == -500){
                //coltsCount += 1;
                gameover = true;
            }

            
           // if (coltsCount >=201)
                    
            //System.out.println(coltsCount);
            }
            for (Packers packers : packerss) {
            packers.update();
            }
            
            
            for (Panthers panthers : pantherss) {
            wallCollisions(panthers);
           
                for (Packers packers : packerss) {
                wallCollisions(packers);
        
                    for (Colts colts : coltss) {
                    wallCollisions(colts);
                    characterVsCharacter(colts, panthers, packers);
        }
          }
            }
            for (Football football : footballs) {
            football.update();
            wallCollisions(football);
        }
            repaint();
        }
    }

    private void wallCollisions(Creature c) {
       
        if (c.getX() <= 0 || c.getX() + 30 >= 1100){
            c.setVx(-c.getVx());
            c.move();
        }
        if (c.getY() <= 0 || c.getY() + 30 >= 760){
            c.setVy(-c.getVy());
            c.move();
        }
    }
    
    private void characterVsCharacter(Colts obj1, Panthers obj2, Packers obj3) {
        if (obj1.getX() > obj2.getX() 
                && obj1.getX() < obj2.getX() + obj2.getSize() 
                && obj1.getY() > obj2.getY() 
                && obj1.getY() < obj2.getY() + obj2.getSize()) {
            obj2.die();
        }
        if (obj2.getX() > obj3.getX() 
                && obj2.getX() < obj3.getX() + obj3.getSize() 
                && obj2.getY() > obj3.getY() 
                && obj2.getY() < obj3.getY() + obj3.getSize()) {
            obj3.die();
        }
        if (obj3.getX() > obj1.getX() 
                && obj3.getX() < obj1.getX() + obj1.getSize() 
                && obj3.getY() > obj1.getY() 
                && obj3.getY() < obj1.getY() + obj1.getSize()) {
            obj1.die();
            obj1.setVx(1);
        }
        
    }
    
    
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            
        }
    }
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            
            
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            
            
        if (e.getKeyCode() == KeyEvent.VK_UP)
            
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            
        }
            
    }   
    
    
    
    
    
}
