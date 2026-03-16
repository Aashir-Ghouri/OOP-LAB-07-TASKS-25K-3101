public class Animal {
    public void makeSound(){
        System.out.println("Animal sound!");
    }

    public static void main(String[] args){
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();
        Animal cow1 = new Cow();

        dog1.makeSound();
        cat1.makeSound();
        cow1.makeSound();
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Dog Barks!");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cat Meows!");
    }
}

class Cow extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Cow Moos!");
    }
}
