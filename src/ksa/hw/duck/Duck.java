package ksa.hw.duck;

import java.awt.*;

public abstract class Duck {
    protected int x;
    protected int y;
    public static final int SIZE=30;


    public Duck(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void display(Graphics g);
    public final void swim(Graphics g){
        g.setColor(Color.BLACK);
        g.drawString("수영",this.x-5,this.y-5);
    }

}
