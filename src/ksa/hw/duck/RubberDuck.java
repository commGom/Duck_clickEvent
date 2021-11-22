package ksa.hw.duck;

import java.awt.*;

public class RubberDuck extends Duck implements Quackable{
    public RubberDuck(int x, int y) {
        super(x, y);
    }

    @Override
    public void display(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(this.x,this.y,Duck.SIZE,Duck.SIZE);

    }

    @Override
    public void quack(Graphics g) {
        g.setColor(Color.RED);
        g.drawString("삑삑", this.x+20, this.y-5);
    }
}
