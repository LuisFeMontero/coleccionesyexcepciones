import java.util.HashSet;
import java.util.Set;

public class Course {

    private Integer id;
    private String subject;
    private Set<Student> studentSet;


    public Course(Integer id, String subject) {
        this.id = id;
        this.subject = subject;
        studentSet = new HashSet<>();
    }

    // Método para agregar un estudiante al curso
    // Recibe estudiante y agrega un estudiante

    public void addStudent(Student student) {
        studentSet.add(student);
    }

    public Integer getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }
}
