package homework_package;

public class DZ5_EX1 {


    public static void main(String[] args) {
        double sinusR = 0.0;
        for (int i = -1; i < 36; i++){

            double radians = Math.toRadians(sinusR);
            System.out.format("Синус %.1f градусов равен %.4f%n", sinusR, Math.sin(radians));
            sinusR += 10;
        }

    }


}
