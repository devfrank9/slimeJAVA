package slimegame.origin02;

class Human {
    String name;
    int hp = 100;

    public Human(String n) {
        name = n;
    }

    public void attack(Slime s) {
        //공격
        s.hp = s.hp - 30;

        //공격 실행후 조건문
        if (s.hp < 1) {
            Study01.lbl.setText(s.name + "은 사망했다.");
            Study01.lbl2.setText("");
        } else {
            Study01.lbl.setText("현재 "+s.name + "의 체력은 " + s.hp + "이다.\n");
        }
    }
}
