package slimegame.origin01;

class Human {
    String name;
    int hp = 100;

    public Human(String n) {
        name = n;
    }

    public void attack(Slime s) {
        //공격
        System.out.println("인간은 " + s.name + "을 공격했습니다.");
        s.hp = s.hp - 30;

        //공격 실행후 조건문
        if (s.hp < 1) {
            System.out.println(s.name + "은 사망했다.");
        } else {
            System.out.println("현재 "+s.name + "의 체력은 " + s.hp + "이다.\n");
        }
    }
}
