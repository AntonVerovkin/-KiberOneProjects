package homework_package.DZ8;

public class Android extends Phone{
    private int amountOfSIMCards;



    public Android(String model, float display, int sizeRAM, int currentSizeRAM, boolean isDualCameraSystem, int amountOfSIMCards) {
        super(model, display, sizeRAM, currentSizeRAM, isDualCameraSystem);
        this.amountOfSIMCards = amountOfSIMCards;
    }

    public int getAmountOfSIMCards() {
        return amountOfSIMCards;
    }

    public void setAmountOfSIMCards(int amountOfSIMCards) {
        this.amountOfSIMCards = amountOfSIMCards;
    }
}
