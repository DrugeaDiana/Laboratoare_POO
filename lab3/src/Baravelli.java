public class Baravelli extends CandyBox{

    private float radius;
    private float height;

    public Baravelli(){
        radius = 0;
        height = 0;
    }

    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public float getVolume() {
        return (float) (Math.PI * radius * radius * height);
    }

    @Override
    public String toString() {
        return "Baravelli: The " + super.getOrigin() + " " +
                super.getFlavor() + " chocolate has volume " +
                getVolume();
    }

    public void printBaravelliDim(){
        System.out.println("Baravelli: " + radius + " " + height);
    }

    public void printDim(){
        System.out.println("Baravelli: " + radius + " " + height);
    }
}
