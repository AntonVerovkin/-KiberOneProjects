package class_package.class_pisec;

public class Sarcopterygii extends Osteichthyes {
    private boolean hasThePairedFinsHadWellDevelopedFleshyLobes;

    public Sarcopterygii(String name, boolean isPredator, String family, String eat, boolean hasSwimBladder, boolean hasThePairedFinsHadWell_DevelopedFleshyLobes) {
        super(name, isPredator, family, eat, hasSwimBladder);
        this.hasThePairedFinsHadWellDevelopedFleshyLobes = hasThePairedFinsHadWell_DevelopedFleshyLobes;
    }

    public boolean isHasThePairedFinsHadWell_DevelopedFleshyLobes() {
        return hasThePairedFinsHadWellDevelopedFleshyLobes;
    }

    public void setHasThePairedFinsHadWell_DevelopedFleshyLobes(boolean hasThePairedFinsHadWell_DevelopedFleshyLobes) {
        this.hasThePairedFinsHadWellDevelopedFleshyLobes = hasThePairedFinsHadWell_DevelopedFleshyLobes;
    }
}
