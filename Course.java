import java.util.*;

public class Course {
    protected String name;
    protected List<Student> students;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }

    public void listCourseStudents(){
        System.out.print(name+" students: ");
        for(Student s: students){
            System.out.print(s.getName() + " ");
        }
        System.out.print("\n");
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
