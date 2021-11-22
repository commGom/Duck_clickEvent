package ksa.hw.duck;

import java.awt.*;

public class RedDuck extends Duck implements Flyable, Quackable{
    public RedDuck(int x, int y) {
        super(x, y);
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(this.x,this.y,Duck.SIZE,Duck.SIZE);
    }

    @Override
    public void fly(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("날다", this.x-10, this.y+40);
    }

    @Override
    public void quack(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawString("꽥꽥", this.x+20, this.y-5);
    }
}
