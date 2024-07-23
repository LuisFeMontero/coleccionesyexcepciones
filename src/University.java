import java.util.HashSet;
import java.util.Set;

public class University {
    private String name;
    private Set<Course> courseSet;
    private Set<Student> studentSet;

    public University(String name) {
        this.name = name;
        courseSet = new HashSet<>();
        studentSet = new HashSet<>();
    }

    // Método para generar un curso
    public void generateCourse(Integer id, String subject) {
        Course course = new Course(id,subject);
        courseSet.add(course);
    }

    // Método para generar un estudiante
    public void generateStudent(Integer id, String name) {
        Student student = new Student(id, name);
        studentSet.add(student);
    }



    // Método para suscribir un estudiante a un curso
    public void subscribeStudent(Integer courseId, Integer studentId) throws Exception {
        Course course = findCourse(courseId);
        Student student = findStudent(studentId);
        if(course == null){
            throw new CourseNotFoundException(courseId + " is not a valid course Id.");
        }
        if(student == null){
            throw new StudentNotFoundException(studentId + " is not a valid student Id.");
        }
        course.addStudent(student);
        System.out.println(student.getName() + " is now in " + course.getSubject());
    }

    // Métodos auxiliares para encontrar estudiante y curso por ID
    private Student findStudent(Integer studentId) {
        Student wantedStudent = null;
        for (Student student : studentSet) {
            if (student.getId().equals(studentId)) {
                wantedStudent = student;
            }
        }
        return wantedStudent;
    }

    private Course findCourse(Integer courseId) {
        Course wantedCourse = null;
        for (Course course : courseSet){
            if (course.getId().equals(courseId)){
                wantedCourse = course;
            }
        }
        return wantedCourse;
    }
}
