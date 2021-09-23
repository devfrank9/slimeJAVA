package slimegame.makeslimeExample.origin03Example;

import java.util.Timer;
import java.util.TimerTask;

public class TimerExample {
    public static void main(String[] args) {
        
        System.out.println("1");

        Timer timer1 = new Timer();                 //타이머 객체 생성
        TimerTask task1 = new TimerTask() { //일정시간 후에 실행할 코드; // 작업 객체 생성 

            @Override
            public void run() {
        
                System.out.println("2");
                timer1.cancel();
            }
        };
    timer1.schedule(task1, 3000); // 타이머와 작업을 연결, 첫번째인수는 수행할 작업, 두번째 인수는 3초(밀리초 단위=3000)

    }
}
