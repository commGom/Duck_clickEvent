package ksa.hw.duck;

import java.util.Random;

public class DuckManager {
    private Duck[] ducks;
    private int limitCount; //Duck 배열의 크기
    private int count;      //만들어지는 Duck 갯수 카운트

    public DuckManager() {
        this.limitCount=10;
        ducks=new Duck[limitCount];
    }
    public DuckManager(int num) {
        this.limitCount=num;
        ducks=new Duck[num];
    }
    public Duck makeRandomDuck(int x,int y){
        Duck duck=null;
        if (count<limitCount){
            Random random=new Random();
            int type=random.nextInt(4);
            //0:Mallard, 1:Red, 2:Rubber, 3:Decoy
            switch (type){
                case 0:
                    duck=new MallardDuck(x,y);
                    break;
                case 1:
                    duck=new RedDuck(x,y);
                    break;
                case 2:
                    duck=new RubberDuck(x,y);
                    break;
                case 3:
                    duck=new DecoyDuck(x,y);
                    break;
                default:
                    duck=new MallardDuck(x,y);
                    break;
            }
            //만들어진 랜덤duck 객체 배열에 넣어주기
            ducks[count]=duck;
        }else{
            //예외처리
            System.out.println(String.format("제한 갯수 %d를 초과함",this.limitCount));
        }
        //duck 갯수 1 up.
        count++;
        return duck;
    }

}
