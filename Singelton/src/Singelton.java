public class Singelton {
    private static Singelton obj=new Singelton();

    private Singelton() {
    }

    public static Singelton getInstance(){
        return obj;

    }
    public void show(){
        System.out.println("Hello Singelton Designe patern");
    }
}
/*
public class Singelton{
private static Singelton obj=new Singelton;
private Singelton(){}
public static Singelton getInstance(){
return obj;
public void show(){
sout("am singelton);
}
}
 */