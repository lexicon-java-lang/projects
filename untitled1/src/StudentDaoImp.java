import java.util.ArrayList;
import java.util.List;

public class StudentDaoImp implements StudentDao {
    List<Student> students;
    public StudentDaoImp(){
        students=new ArrayList<Student>();
        Student student1=new Student("Biniam",01);
        Student student2=new Student("Eden",02);
        Student student3=new Student("Noah",03);
        students.add(student1);
        students.add(student2);
        students.add(student3);

    }


    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollno) {
        return students.get(rollno);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollno()).setName(student.getName());




    }

    @Override
    public void delStudent(Student student) {
        students.remove(student.getRollno());
        System.out.println("studen [Rollno:"+student.getRollno()+"]  is deleted from database ");

    }
}
