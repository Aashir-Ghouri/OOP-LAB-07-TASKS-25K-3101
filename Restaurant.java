public class Restaurant {
    public void calculateDeliveryFee(double distance) {
        System.out.println("Calculating delivery fee...");
    }

    public static void main(String[] args) {
        Restaurant r1 = new FastFoodRestaurant();
        Restaurant r2 = new FineDiningRestaurant();
        Restaurant r3 = new CafeRestaurant();

        r1.calculateDeliveryFee(5.0);
        r2.calculateDeliveryFee(5.0);
        r3.calculateDeliveryFee(5.0);
    }
}

class FastFoodRestaurant extends Restaurant {
    @Override
    public void calculateDeliveryFee(double distance) {
        System.out.println("Calculating fast food delivery fee...");
    }
}

class FineDiningRestaurant extends Restaurant {
    @Override
    public void calculateDeliveryFee(double distance) {
        System.out.println("Calculating fine dining delivery fee...");
    }
}

class CafeRestaurant extends Restaurant {
    @Override
    public void calculateDeliveryFee(double distance) {
        System.out.println("Calculating cafe delivery fee...");
    }
}