public class Student {
    private String name;
    private Course[] courses;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public String toString(){

    }

    public void listStudentCourses(){
        System.out.print(name+" courses: ");
        for(Course c: courses){
            System.out.print(c.getName() + " ");
        }
        System.out.print("\n");
    }
    public void addCourse(Course course){

    }
}
