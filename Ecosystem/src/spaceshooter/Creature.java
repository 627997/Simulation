/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceshooter;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author 627997
 */
public abstract class Creature {
    
    //Fields
    protected int x;
    protected int y;
    protected int vx;
    protected int vy;
    private Rectangle bound;
    private int size;
    
    
    

    //Constructor
    public Creature(int x, int y) {
        size = 100 ;
        this.x = (int) (Math.random() * 800);
        this.y = (int) (Math.random() * 700);
        this.vx = (int) (Math.random()*15) - 6;
        this.vy = (int) (Math.random()*15) - 6;
        bound = new Rectangle(this.x, this.y, this.size, this.size);
    }
    
    public Rectangle getBound() {
        return bound;
    }
    
        public void die() {
        this.x = -500;
        this.y = -500;
        
        
        }


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

    public Creature() {
        this(100,100);
    }
    
    public abstract void draw(Graphics g);
    
    public void update() {
        move();
    }
    
    public void move() {
        x += vx;
        y += vy;
    }
}

