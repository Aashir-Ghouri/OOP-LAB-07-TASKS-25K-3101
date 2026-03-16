public class Course {
    public void calculateGrade(int assignments, int exams) {
        System.out.println("Calculating generic course grade...");
    }

    public static void main(String[] args) {
        Course c1 = new ProgrammingCourse();
        Course c2 = new MathematicsCourse();
        Course c3 = new DesignCourse();

        c1.calculateGrade(85, 90);
        c2.calculateGrade(85, 90);
        c3.calculateGrade(85, 90);
    }
}

class ProgrammingCourse extends Course {
    @Override
    public void calculateGrade(int assignments, int exams) {
        System.out.println("Calculating programming course grade...");
        double grade = (assignments * 0.4) + (exams * 0.6);
        System.out.println("Programming grade : " + grade);
    }
}

class MathematicsCourse extends Course {
    @Override
    public void calculateGrade(int assignments, int exams) {
        System.out.println("Calculating mathematics course grade...");
        double grade = (assignments * 0.3) + (exams * 0.7);
        System.out.println("Mathematics grade : " + grade);
    }
}

class DesignCourse extends Course {
    @Override
    public void calculateGrade(int assignments, int exams) {
        System.out.println("Calculating design course grade...");
        double grade = (assignments * 0.45) + (exams * 0.55);
        System.out.println("Designing grade : " + grade);
    }
}