package homework_package;

public class DZ4_EX2 {
    public static void main(String[] args) {


        String[] array = {
                "Galka",
                "Palka",
                "гурец",
                "Пельмень",
                "Мед",
        };



        for (int i = 0; i < array.length; i++) {

            if (array[i].length() > 5) {
                System.out.println(array[i]);
            }
        }
    }

}
