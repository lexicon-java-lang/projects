import java.util.ArrayList;
import java.util.List;

public interface StudentDao {
public List<Student> getAllStudents();
public Student getStudent(int rollno);
public void updateStudent(Student student);
public void delStudent(Student student);
}
