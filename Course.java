public class Course {
    protected String name;
    protected Student[] students;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void listCourseStudents(){
        System.out.print(name+" students: ");
        for(Student s: students){
            System.out.print(s.getName() + " ");
        }
        System.out.print("\n");
    }

    public void addStudent(Student student){

    }
}
