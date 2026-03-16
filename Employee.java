public class Employee {
    public void calculateSalary(){
        System.out.println("Calculating salary...");
    }

    public static void main(String[] args){
        Employee e1 = new Manager();
        Employee e2 = new Developer();
        Employee e3 = new Intern();

        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
    }
}

class Manager extends Employee{
    @Override
    public void calculateSalary(){
        System.out.println("Calculating salary for manager...");
    }
}

class Developer extends Employee{
    @Override
    public void calculateSalary(){
        System.out.println("Calculating salary for developer...");
    }
}

class Intern extends Employee{
    @Override
    public void calculateSalary(){
        System.out.println("Calculating salary for intern...");
    }
}