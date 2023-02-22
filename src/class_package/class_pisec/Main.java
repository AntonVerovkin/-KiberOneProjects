package class_package.class_pisec;

public class Main {
    public static void main(String[] args) {

        Actinopterygii fish2 = new Actinopterygii("sds", true, "A", "a", true, true, true);
        Sarcopterygii fish3 = new Sarcopterygii("dd", true, "s", "s", true, false);
        Chondrichthyes fish1 = new Chondrichthyes("Белые акулы", true, "Хрящевые рыбы",fish2.getName(), true, false);

        System.out.println(fish1.eat(fish1.getEat()));
    }
}
