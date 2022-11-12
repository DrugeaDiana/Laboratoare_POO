public class Lindt extends CandyBox{

    private float length;
    private float width;
    private float height;

    public Lindt(){
        length = 0;
        width = 0;
        height = 0;
    }

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Lindt(float length, float width, float height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    @Override
    public float getVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "Lindt: The " + super.getOrigin() + " " + super.getFlavor()
                + " chocolate has volume " + getVolume();
    }

    public void printLindtDim() {
        System.out.println("Lindt: " + length + " " + width + " " + height);
    }

    public void printDim(){
        System.out.println("Lindt: " + length + " " + width + " " + height);
    }
}
