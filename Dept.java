import java.util.*;

public class Dept {

    String deptName;
    List<Course> courses;

    public Dept(String deptName, List<Course> courses) {
        this.deptName = deptName;
        this.courses = courses;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
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
