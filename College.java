import java.util.*;

public class College {

   private String collegeName;
   private List<Dept> depts;

    public College(String collegeName, List<Dept> depts) {
        this.collegeName = collegeName;
        this.depts = depts;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public List<Dept> getDepts() {
        return depts;
    }

    public void setDepts(List<Dept> depts) {
        this.depts = depts;
    }

    public int countCourses(){
        int count = 0;
        for(Dept d: depts){
            count += d.countCourses();
        }
        return count;
    }

    public int countStudentsInCourses(){
        int count = 0;
        for(Dept d: depts){
            count += d.countStudentsInDeptCourses();
        }
        return count;
    }
}