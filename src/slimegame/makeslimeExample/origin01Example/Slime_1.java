//Slime.java
package slimegame.makeslimeExample.origin01Example;

public class Slime_1 {
    static String name; //슬라임의 이름을 위한 변수
    static int hp; //슬라임의 체력을 위한 변수

    public static void attack() {
        System.out.println(name + "는 인간을 공격했습니다."); //공격함수.
    }

}
//클래스의 개념이 게임으로 도입.
//게임에 나오는 등장인물에 대해
//그 녀석이 어떤 갖고있는 속성(변수)을 가지고 있고,
//어떤 행동(함수)을 하는지 미리 구상해서 클래스를 만든다.