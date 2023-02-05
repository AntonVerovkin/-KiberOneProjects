package classes;

public class Class9 {
    public static void main(String[] args) {
        int num = 0;
        System.out.println(sum(2,3, 1) );
        System.out.println(sum(2.7,2.3));
    }
    public static int sum(int x, int y){
        return x + y;
    }

    public static int sum(int x, int y, int z){
        return x + y + z;
    }

    public static int sum(double x, double y){
        return (int) (x + y);
    }
}
