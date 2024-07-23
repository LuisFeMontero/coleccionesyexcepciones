
public class Main {
    public static void main(String[] args) {

        University university = new University("Monster University");

        university.generateStudent(1,"Mike");
        university.generateCourse(300,"Algebra");

        try {
            university.subscribeStudent(300,1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}