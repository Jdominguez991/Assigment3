import java.util.*;

public class College {

   private String collegeName;
   private List<Dept> depts;

    public static void College(String collageName, List<Dept> depts) {

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

    public int countStudentsInCourse(){

    }
}