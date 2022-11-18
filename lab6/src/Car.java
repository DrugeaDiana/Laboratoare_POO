public class Car {
    private int price;
    private int year;
    public enum CarType {
        MERCEDES,
        FIAT,
        SKODA
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    CarType type;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public Car(final int price, final CarType type, final int year) {
        this.price = price;
        this.year = year;
        this.type = type;
    }



    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", carType=" + type +
                ", year=" + year +
                '}';
    }
}
