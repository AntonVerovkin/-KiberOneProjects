package class_package.Animals;

public class Main {
    public static void main(String[] args) {
        Fish firstFish = new Fish("Скорпеновые", "Крылатка-зебра", "Крылатки", false, false);
        Fish secondFish = new Fish("Помацентровые", "Рыбы-клоуны", "Ы", false, false);

        System.out.println(firstFish.equals(secondFish));
    }
}
