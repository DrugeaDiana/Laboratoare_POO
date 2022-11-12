public class Area {
    private int number;
    private String street;
    private String message;
    private CandyBag candies;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Area() {
        number = 0;
        street = "nowhere";
        message = "nowhere";
    }

    public Area(CandyBag candies, int number, String street, String message) {
        this.candies = candies;
        this.number = number;
        this.street = street;
        this.message = message;
    }

    public void getBirthdayCard() {
        System.out.println("Street " + street + ", number " + number + '\n');
        System.out.println(message + '\n');
        for(int i = 0; i < candies.getCandies().size(); i++ ) {
            if(candies.getCandies().get(i) instanceof Lindt) {
                candies.getCandies().get(i).printLindtDim();
            } else if (candies.getCandies().get(i) instanceof Baravelli) {
                candies.getCandies().get(i).printBaravelliDim();
            } else {
                candies.getCandies().get(i).printChocAmorDim();
            }
        }
    }

    public void getBirthdayCardv2() {
        System.out.println("Street " + street + ", number " + number + '\n');
        System.out.println(message + '\n');
        for(int i = 0; i < candies.getCandies().size(); i++ ) {
            candies.getCandies().get(i).printDim();
        }
    }
}
