public class DaoMainDemo {
    public static void main(String[] args) {
        StudentDao studentdaoCALL=new StudentDaoImp();
        for(Student stdinlist:studentdaoCALL.getAllStudents()) {
            System.out.println("student Rollno[" + stdinlist.getRollno()+"  and name["+stdinlist.getName());
        }

        Student std=studentdaoCALL.getAllStudents().get(0);
        std.setName("marry");
        studentdaoCALL.updateStudent(std);
    studentdaoCALL.getStudent(01);
        System.out.println("rollnum"+std.getRollno()+"Name"+std.getName());
    }

}
