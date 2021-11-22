package ksa.hw.ui;

import ksa.hw.duck.Duck;
import ksa.hw.duck.DuckManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame {
    private Graphics g; //마우스를 눌렀을 때, 그림그리기 위해 필요한 객체
    private DuckManager duckManager;
    public static final int FRAME_WIDTH=800;
    public static final int FRAME_HEIGHT=600;
    public MyFrame(){
        //마우스이벤트리스너 추가 리스너 : 마우스의 액션을 기다리고 있다가 반응.
        //새롭게 커스터마이징한 리스너를 추가해준다.(MyListener)
        this.addMouseListener(new MyListener());
        //JFrame 기본 설정들(크기, 종료작업, 리사이즈, 보임여부)
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        //JFrame위에 그릴 수 있는 Graphics 객체를 가져온다.
        g=this.getGraphics();
        duckManager=new DuckManager();
    }

    public class MyListener implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {

        }
        //마우스를 눌렀을 때, 이벤트 발생하는 것 만들 것이다.
        @Override
        public void mousePressed(MouseEvent e) {
            int x=e.getX();
            int y=e.getY();
            //MyFrame에서 가지고 있는 Graphics객체를 Duck에게 전달하여 그릴 것이다.
            //duck이 null이 아닐 때, DuckManager의 배열에 저장
            Duck duck=duckManager.makeRandomDuck(x,y);
            if(duck!=null){
                System.out.println(String.format("(%d,%d)",x,y));
                duck.display(g);
            }

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
