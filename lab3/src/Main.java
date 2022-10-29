import java.util.*;

public class Main {
    public static void main(String[] args) {
        CandyBox candy1 = new CandyBox();
        CandyBox candy2 = new CandyBox("martzipan", "craiova");
        CandyBox candy3 = new CandyBox();

        System.out.println(candy1.equals(candy2));
        System.out.println(candy1.equals(candy3));

        Lindt candy4 = new Lindt();
        Lindt candy5 = new Lindt(1, 1, 2);

        System.out.println(candy4.equals(candy5));

        candy4.printLindtDim();
    }
}
