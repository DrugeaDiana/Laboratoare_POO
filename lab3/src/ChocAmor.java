public class ChocAmor extends CandyBox{
    private float length;

    public ChocAmor() {
        length = 0;
    }

    public ChocAmor(String flavor, String origin, float length){
        super(flavor, origin);
        this.length = length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    @Override
    public float getVolume() {
        return length * length * length;
    }

    @Override
    public String toString() {
        return "ChocAmor: The " + super.getOrigin() + " " +
                super.getFlavor() + " chocolate has volume " +
                getVolume();
    }

    public void printChocAmorDim() {
        System.out.println("ChocAmor: " + length);
    }

    public void printDim(){
        System.out.println("ChocAmor: " + length);
    }
}
