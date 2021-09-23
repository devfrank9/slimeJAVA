package slimegame.makeslimeExample.origin03Example;

public class Horse {

    Horse(int i) {
        System.out.println(i + "킬로그램의 말이 탄생했습니다.");
        //생성자의 인수로 정수값 하나만 넣어주면 첫번째 생성자가 호출되고
    }

    Horse(int i, String str) {
        System.out.println(i + "킬로그램의 " + str + "라는 이름의 말이 탄생했습니다.");
        //정수값과 문자값을 같이 넣어주면 두번째 생성자가 호출됨
    }

}
