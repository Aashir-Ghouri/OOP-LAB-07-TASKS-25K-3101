public class Shape {
    public void area() {
        System.out.println("Displaying area of a generic shape.");
    }

    public static void main(String[] args){
        Shape c1 = new Circle(2);
        Shape r1 = new Rectangle(2,3);
        Shape t1 = new Triangle(2,4);

        c1.area();
        r1.area();
        t1.area();
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of circle : " + result);
    }
}

class Rectangle extends Shape {
    double length, width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    @Override
    public void area() {
        double result = length * width;
        System.out.println("Area of rectangle : " + result);
    }
}

class Triangle extends Shape {
    double base, height;

    public Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    @Override
    public void area(){
        double result = 0.5 * base * height;
        System.out.println("Area of triangle : " + result);
    }
}
