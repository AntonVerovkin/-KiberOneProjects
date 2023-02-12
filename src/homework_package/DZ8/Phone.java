package homework_package.DZ8;

public class Phone implements MemoryUsable{
    private String model;
    private float display;
    private int sizeRAM;
    private int currentSizeRAM ;
    private boolean isDualCameraSystem;



    public Phone(String model, float display, int sizeRAM, int currentSizeRAM, boolean isDualCameraSystem) {
        this.model = model;
        this.display = display;
        this.sizeRAM = sizeRAM;
        this.currentSizeRAM = currentSizeRAM;
        this.isDualCameraSystem = isDualCameraSystem;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getDisplay() {
        return display;
    }

    public void setDisplay(float display) {
        this.display = display;
    }

    public int getSizeRAM() {
        return sizeRAM;
    }

    public void setSizeRAM(int sizeRAM) {
        this.sizeRAM = sizeRAM;
    }

    public boolean isDualCameraSystem() {
        return isDualCameraSystem;
    }

    public void setDualCameraSystem(boolean dualCameraSystem) {
        isDualCameraSystem = dualCameraSystem;
    }

    public int getCurrentSizeRAM() {
        return currentSizeRAM;
    }

    public void setCurrentSizeRAM(int currentSizeRAM) {
        this.currentSizeRAM = currentSizeRAM;
    }

    @Override
    public String useMemory() {
        return"Ты можешь использовать память, пока она не заполнит sizeRAM гб";
    }

    public String useMemory(Phone currentSizeRAM) {
        if (getSizeRAM() < this.currentSizeRAM){
            return getSizeRAM() - this.currentSizeRAM + "гб памяти свободно";
        } else {
            return "Памяти не достаточно";
        }


    }



}
