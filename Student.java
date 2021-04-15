import java.util.*;

public class Student {
    private String name;
    private List<Course> courses = new ArrayList<Course>();

    public Student(String name) {
        this.name = name;
    }


    //getters and setters
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public List<Course> getCourses() { return courses;}


    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }




    //retund the name of the student in order for it be read as a string
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    //prints out a list of all the courses the student is taking
    public void listStudentCourses(){
        //inital statment for stating course
        System.out.print(name+" courses: ");
        for(Course c: courses){
            System.out.print(c.getName() + " ");
        }
        System.out.print("\n");
    }

    //adds a course to the department
    public void addCourse(Course course){

        this.courses.add(course);
    }
}
