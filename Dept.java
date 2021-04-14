public class Dept {

    private String deptName;
    private Course[] courses;

    public Dept(String deptName, Course[] courses) {
        this.deptName = deptName;
        this.courses = courses;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public int countCourses(){

    }

    public int countStudentsInDeptCourses(){

    }
}
