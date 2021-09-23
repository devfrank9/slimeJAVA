package slimegame.origin03;

import javax.swing.JOptionPane;

public class Slime {

    String name;
    int hp = 80;

    // 생성자
    public Slime(String n) {
        name = n;
    }

    // 공격
    public void attack(Human h) {

        attack(h, 10);

    }

    public void attack(Human h, int damage) {

        if (hp > 0) {

            h.hp = h.hp - damage;

            if (h.hp < 1) {
                JOptionPane.showMessageDialog(null, "Game Over");
                System.exit(0);
            }

            if (damage < 30) {
                Study01.lbl2.setText(name + "의 공격. " + h.name + "의 체력은 " + h.hp + "남았다.");
            } else {
                Study01.lbl2.setText(name + "의 강한공격. " + h.name + "의 체력은 " + h.hp + "남았다.");
            }

        }
    }

}

class BlueSlime extends Slime { // class 상속클래스 extends 모체클래스

    BlueSlime(String n) {
        super(n); // 상속클래스는 this()대신 super()를 쓴다.
    }

    // 약한 공격
    @Override
    public void attack(Human h) { // 오버라이드 : 부모클래스로 부터 상속받은 함수를 일부러 적어서 내는것
        attack(h, 8);
    }

    void heal(Slime s) { // 자기 자신을 포함한 모든 슬라임을 치료할수 있다.

        if (hp > 0 && s.hp > 0) { // 자신의 체력과 치료받을 슬라임의 체력이 모두 0을 넘어야 한다.

            s.hp += 10; // 힐량

            if (s.hp > 80) { // 치료 후 체력이 80을 넘지 않도록
                s.hp = 80; // 다시 체력 80을 만들어 준다.(최대값 고정)
            }

            Study01.lbl2.setText(name + "은 " + s.name + "를 치료. 그의 체력은 " + s.hp + ".");
        }
    }
}

class RedSlime extends Slime {

    RedSlime(String n) {
        super(n);
    }

    @Override
    public void attack(Human h) {
        attack(h, 15);
    }

    public void attack2(Human h) {
        attack(h, 30);
    }
}