package homework_package;

public class DZ_2 {
    public static void main(String[] args) {
        int num = 2;
        int num2 = 1;
        while (num <= 400){
            System.out.print(num + " ");
            num += num2;
            //System.out.println(num2);
            num2 *= 2;

        }

        System.out.println(" ");

        num = 2;
        num2 = 1;
        //System.out.println(num);
        //System.out.println(num2);
        for(int i = 1; i < 10; i++){
            System.out.print(num + " ");
            num += num2;
            //System.out.println(num2);
            num2 *= 2;
        }
    }
}
