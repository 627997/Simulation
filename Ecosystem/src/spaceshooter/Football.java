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
public class Football extends Creature {
    private int size;
    private Color color;
    private ImageIcon ii;
    private Image img;
    
    public Football(int size) {
        super();
        this.size = size;
        this.color = new Color(255,0,100,100);
        this.ii = new ImageIcon(getClass().getResource("/images/football.png"));
        this.img = ii.getImage();
    }
    
    public Football() {
        this(50);
    }
    
    @Override
    public void draw(Graphics g) {
        //g.setColor(color);
        //g.fillOval(x, y, size, size);
        g.drawImage(img, x, y, size, size, null);
    }
}