package problem1;

public class Problem1 {
    public static void main(String[] args) {
        Student student = new Student();

        student.setId("24B031735");
        student.setName("Nurasyl");
        student.setYearOfStudy(2);

        System.out.println(student.getId());
        System.out.println(student.getName());

        System.out.println(student.getYearOfStudy());

        student.incrementYearOfStudy();

        System.out.println(student.getYearOfStudy());
    }
}
