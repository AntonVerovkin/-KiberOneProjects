package homework_package;

public class DZ_1 {
    public static void main(String[] args) {

        long imaginaryLandPopulation = 1;
        long populationGrowth = 10000000;

        for (int i = 1; i <= 15; i ++ ) {
            imaginaryLandPopulation /= 1000;
            imaginaryLandPopulation *= 12;
            imaginaryLandPopulation += populationGrowth;

            populationGrowth = imaginaryLandPopulation;
        }

        System.out.println(imaginaryLandPopulation);
    }
}
