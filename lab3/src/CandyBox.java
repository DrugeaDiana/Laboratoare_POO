public class CandyBox {
    private String flavor;
    private String origin;

    public CandyBox() {
        this.flavor = "sugar-free";
        this.origin = "Switzerland";
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    public float getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "The "+ origin +
                " " + flavor + " chocolate";
    }

    public String getFlavor() {
        return flavor;
    }

    public String getOrigin() {
        return origin;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public boolean equals(CandyBox candy2) {
        if (flavor.equals(candy2.getFlavor())) {
            if(origin.equals(candy2.getOrigin())) {
                if(this.getVolume() == candy2.getVolume()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void printLindtDim(){}

    public void printBaravelliDim(){}

    public void printChocAmorDim(){}

    public void printDim(){}
}
