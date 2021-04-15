import java.util.*;

public class Student {
    private String name;
    private List<Course> courses = new ArrayList<Course>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public void listStudentCourses(){
        System.out.print(name+" courses: ");
        for(Course c: courses){
            System.out.print(c.getName() + " ");
        }
        System.out.print("\n");
    }
    public void addCourse(Course course){

        this.courses.add(course);
    }
}
