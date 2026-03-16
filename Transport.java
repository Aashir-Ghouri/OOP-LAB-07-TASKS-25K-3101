public class Transport {
    public void fare() {
        System.out.println("Calculating transport fare...");
    }

    public static void main(String[] args) {
        Transport t1 = new Bus();
        Transport t2 = new Train();
        Transport t3 = new Taxi();

        t1.fare();
        t2.fare();
        t3.fare();
    }
}

class Bus extends Transport {
    @Override
    public void fare() {
        System.out.println("Calculating bus fare...");
    }
}

class Train extends Transport {
    @Override
    public void fare() {
        System.out.println("Calculating train fare...");
    }
}

class Taxi extends Transport {
    @Override
    public void fare() {
        System.out.println("Calculating taxi fare...");
    }
}