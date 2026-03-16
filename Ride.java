public class Ride {
    public void calculateFare(double distance) {
        System.out.println("Calculating Generic ride fare...");
        System.out.println("Generic Fare : " + distance * 10);
    }

    public static void main(String[] args) {
        Ride r1 = new BikeRide();
        Ride r2 = new CarRide();
        Ride r3 = new LuxuryRide();

        r1.calculateFare(10.0);
        r2.calculateFare(10.0);
        r3.calculateFare(10.0);
    }
}

class BikeRide extends Ride {
    @Override
    public void calculateFare(double distance) {
        System.out.println("Calculating bike ride fare...");
        System.out.println("Bike ride fare : " + distance * 5);
    }
}

class CarRide extends Ride {
    @Override
    public void calculateFare(double distance) {
        System.out.println("Calculating car ride fare...");
        System.out.println("Car ride fare : " + distance * 20);
    }
}

class LuxuryRide extends Ride {
    @Override
    public void calculateFare(double distance) {
        System.out.println("Calculating luxury ride fare...");
        System.out.println("Luxury ride fare : " + distance * 50);
    }
}