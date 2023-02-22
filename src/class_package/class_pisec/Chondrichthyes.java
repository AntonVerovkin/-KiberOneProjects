package class_package.class_pisec;

public class Chondrichthyes extends Pisces implements Eatable{
    private boolean hasPlacoidScale;
    private boolean notHasSwimBladder;

    public Chondrichthyes(String name, boolean isPredator, String family, String eat, boolean hasPlacoidScale, boolean hasSwimBladder) {
        super(name, isPredator, family, eat);
        this.hasPlacoidScale = hasPlacoidScale;
        this.notHasSwimBladder = hasSwimBladder;
    }



    public boolean isHasPlacoidScale() {
        return hasPlacoidScale;
    }

    public void setHasPlacoidScale(boolean hasPlacoidScale) {
        this.hasPlacoidScale = hasPlacoidScale;
    }

    public boolean isHasSwimBladder() {
        return notHasSwimBladder;
    }

    public void setHasSwimBladder(boolean hasSwimBladder) {
        this.notHasSwimBladder = hasSwimBladder;
    }


}
