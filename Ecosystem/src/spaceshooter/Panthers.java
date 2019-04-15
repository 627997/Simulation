/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 627997
 */
public class Panthers extends Creature {
    private int size;
    //private Color color;
    private ImageIcon ii;
    private Image img;
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVx() {
        return vx;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public int getVy() {
        return vy;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public Panthers(int size) {
        super();
        this.size = size;
        //this.color = new Color(255,0,100,100);
        this.ii = new ImageIcon(getClass().getResource("/images/panthers.png"));
        this.img = ii.getImage();
    }
    
    public Panthers() {
        this(50);
    }
    
    @Override
    public void draw(Graphics g) {
        //g.setColor(color);
        //g.fillOval(x, y, size, size);
        g.drawImage(img, x, y, size, size, null);
    }
}