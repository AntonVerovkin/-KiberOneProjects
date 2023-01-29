package homework_package;

public class DZ7_EX2 {
    public static void main(String[] args) {

        System.out.println(volume(1,2, 3));
        System.out.println(volume(1,  3));
    }

    public static int volume(int a, int b, int h) {
        return a * b * h;
    }
    public static float volume(int a, int h) {
       return (float) (Math.pow(a,2) * h / 7);
    }

}

//h * (a * a) / 6,928

