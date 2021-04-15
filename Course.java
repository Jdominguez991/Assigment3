import java.util.*;

public class Course {
    protected String name;
    protected List<Student> students = new ArrayList<Student>();

    public Course(String name) {
        this.name = name;
    }

    //getters and setters
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


    //converts course name into a string
    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }

    //prints out all the students in a course
    public void listCourseStudents(){
        //inital statment for stating course
        System.out.print(name+" students: ");
        for(Student s: students){
            System.out.print(s.getName() + " ");
        }
        System.out.print("\n");
    }

    //adds a student to a course
    public void addStudent(Student student){
        students.add(student);
    }
}
