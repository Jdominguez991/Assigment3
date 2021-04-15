import java.util.*;
public class Main {

    Student s1 = new Student("Ben");
    Student s2 = new Student("Jason");
    Student s3 = new Student("Johvanni");
    Student s4 = new Student("Karen");
    Student s5 = new Student("Alex");
    Student s6 = new Student("Tony");
    Student s7 = new Student("Keith");
    Student s8 = new Student("Declan");
    Student s9 = new Student("Zecheng");
    Student s10 = new Student("Jay");
    Student s11 = new Student("Leo");
    Student s12 = new Student("Frank");
    Student s13 = new Student("Bob");
    Student s14 = new Student("Alice");
    Student s15 = new Student("Zack");

    Course c1 = new Course("Software Engineering");
    Course c2 = new Course("RBE 2002");
    Course c3 = new Course("Linear Algebra");
    Course c4 = new Course("Social Implications");
    Course c5 = new Course("English 101");

    List<Course> L1 = new ArrayList<Course>();
    List<Course> L2 = new ArrayList<Course>();


    Dept d1 = new Dept("STEM", L1);
    Dept d2 = new Dept("Humanities", L2);

    List<Dept> L3 = new ArrayList<Dept>();

    College college = new College("College",L3);

    public void main(String[] args){

        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.addStudent(s4);
        c1.addStudent(s5);
        c1.addStudent(s6);

        c2.addStudent(s7);
        c2.addStudent(s8);
        c2.addStudent(s9);
        c2.addStudent(s10);
        c2.addStudent(s11);
        c2.addStudent(s12);

        c3.addStudent(s13);
        c3.addStudent(s14);
        c3.addStudent(s15);
        c3.addStudent(s1);
        c3.addStudent(s2);
        c3.addStudent(s3);

        c4.addStudent(s4);
        c4.addStudent(s5);
        c4.addStudent(s6);
        c4.addStudent(s7);
        c4.addStudent(s8);
        c4.addStudent(s9);

        c5.addStudent(s10);
        c5.addStudent(s11);
        c5.addStudent(s12);
        c5.addStudent(s13);
        c5.addStudent(s14);
        c5.addStudent(s15);

        s1.addCourse(c1);
        s1.addCourse(c3);

        s5.addCourse(c1);
        s5.addCourse(c4);

        s9.addCourse(c2);
        s9.addCourse(c4);

        L1.add(c1);
        L1.add(c2);
        L1.add(c3);
        L2.add(c4);
        L2.add(c5);

        System.out.println("Number of students in college: "+college.countStudentsInCourses());
        for(Dept d: college.getDepts()){
            System.out.println("Number of students in " + d.getDeptName() +":" + d.countStudentsInDeptCourses();
        }

    }















}
