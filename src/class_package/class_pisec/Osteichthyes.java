package class_package.class_pisec;

public class Osteichthyes extends Pisces{
    private boolean hasSwimBladder;

    public Osteichthyes(String name, boolean isPredator, String family, String eat, boolean hasSwimBladder) {
        super(name, isPredator, family, eat);
        this.hasSwimBladder = hasSwimBladder;
    }

    public boolean isHasSwimBladder() {
        return hasSwimBladder;
    }

    public void setHasSwimBladder(boolean hasSwimBladder) {
        this.hasSwimBladder = hasSwimBladder;
    }
}
