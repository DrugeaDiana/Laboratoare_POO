import java.util.ArrayList;

public class CandyBag {

    private ArrayList<CandyBox> candies = new ArrayList<CandyBox>();

    public CandyBag() {
        Lindt lin1 = new Lindt("cherry", "Austria", 20F, (float) 5.4, (float) 19.2);
        Lindt lin2 = new Lindt("apricot", "Austria", 20F, (float) 5.4, (float) 19.2);
        Lindt lin3 = new Lindt("strawberry", "Austria", 20F, (float) 5.4, (float) 19.2);
        candies.add(lin1);
        candies.add(lin2);
        candies.add(lin3);

        Baravelli bar1 = new Baravelli("grape", "Italy", (float) 6.7, (float) 8.7);
        candies.add(bar1);

        ChocAmor choc1 = new ChocAmor("coffee", "France", 5.5F);
        ChocAmor choc2 = new ChocAmor("vanilla", "France", 5.5F);
        candies.add(choc1);
        candies.add(choc2);
    }

    public ArrayList<CandyBox> getCandies() {
        return candies;
    }

    public void setCandies(ArrayList<CandyBox> candies) {
        this.candies = candies;
    }
}
