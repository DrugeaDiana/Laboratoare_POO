import java.util.Random;

public class Dealership{
    Dealership.BrandOffer brand = new Dealership.BrandOffer();
    Dealership.SpecialOffer special = new Dealership.SpecialOffer();
    Dealership.DealerOffer dealer = new Dealership.DealerOffer();
    static class BrandOffer implements Offer{
        public int getDiscount (Car car) {
            switch (car.getType()) {
                case MERCEDES: {
                    return car.getPrice() * 5 / 100;
                }
                case FIAT: {
                    return car.getPrice() * 10 / 100;
                }
                case SKODA: {
                    return car.getPrice() * 15 / 100;
                }
                default: {
                    return 0;
                }
            }
        }
    }

    static class DealerOffer implements Offer{
        public int getDiscount(Car car) {
            switch (car.getType()) {
                case MERCEDES: {
                    return 300 * (2022 - car.getYear());
                }
                case FIAT: {
                    return 100 * (2022 - car.getYear());
                }
                case SKODA : {
                    return 150 * (2022 - car.getYear());
                }
                default :{
                    return 0;
                }
            }
        }
    }

    static class SpecialOffer implements Offer{
        public int getDiscount(Car car) {
            return Main.rand.nextInt(1000);
        }
    }

    public void getFinalPrice (Car car) {
        System.out.println("Applying Brand discount: " + brand.getDiscount(car) + " euros");
        System.out.println("Applying Dealer discount: " + dealer.getDiscount(car) + " euros");
        System.out.println("Applying Special discount: " + special.getDiscount(car) + " euros");
    }

    public void negotiate (Car car, Offer offer) {
        System.out.println("Applying Client discount: " + offer.getDiscount(car) + " euros");
    }
}
