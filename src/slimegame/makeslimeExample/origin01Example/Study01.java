package slimegame.makeslimeExample.origin01Example;

public class Study01 {
    public static void main(String[] args) {
        Slime_1.name = "슬라삐";
        Slime_1.hp = 100;

        System.out.println("슬라임의 이름은 " + Slime_1.name);
        System.out.println(Slime_1.name + "의 체력은" + Slime_1.hp);

        Slime_1.attack();
    }

}
