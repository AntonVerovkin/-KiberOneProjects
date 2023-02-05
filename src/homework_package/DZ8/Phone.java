package homework_package.DZ8;

public class Phone {
    private String model;
    private float display;
    private int sizeRAM;
    private boolean isDualCameraSystem;

    public Phone(String model, float display, int sizeRAM, boolean isDualCameraSystem) {
        this.model = model;
        this.display = display;
        this.sizeRAM = sizeRAM;
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
}
