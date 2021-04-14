public class Dept {

    String deptName;
    Course[] courses;

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
        int count = 0;
        for(Course c: courses){
            count++;
        }
        return count;
    }

    public int countStudentsInDeptCourses(){

    }
}
