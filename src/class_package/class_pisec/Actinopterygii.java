package class_package.class_pisec;

public class Actinopterygii extends Osteichthyes {
    private boolean hasABonySpine;
    private boolean hasChoanaeAbsent;

    public Actinopterygii(String name, boolean isPredator, String family, String eat, boolean hasSwimBladder, boolean hasABonySpine, boolean hasChoanaeAbsent) {
        super(name, isPredator, family, eat, hasSwimBladder);
        this.hasABonySpine = hasABonySpine;
        this.hasChoanaeAbsent = hasChoanaeAbsent;
    }

    public boolean isHasABonySpine() {
        return hasABonySpine;
    }

    public void setHasABonySpine(boolean hasABonySpine) {
        this.hasABonySpine = hasABonySpine;
    }

    public boolean isHasChoanaeAbsent() {
        return hasChoanaeAbsent;
    }

    public void setHasChoanaeAbsent(boolean hasChoanaeAbsent) {
        this.hasChoanaeAbsent = hasChoanaeAbsent;
    }
}
