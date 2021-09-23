package slimegame.makeslimeExample.origin02Example;

public class SoccerPlayer {
    int str = 100; // 공격력
    int def = 70; // 수비력

    // 공격 중심
    public void offensive() {
        str += 10;
        def -= 10;
    }

    // 수비 중심
    public void defensive() {
        str -= 10;
        def += 10;
    }

}
