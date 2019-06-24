import java.util.Scanner;

public class MainDemo {
    public static void main(String[] args) {
        System.out.println("Enter yoour name");
        Scanner scann=new Scanner(System.in);
        String name=scann.nextLine();
    Factory callbuilder=new Factory();
    Kitchen callkitchen=callbuilder.passInstance(name);
    callkitchen.report();
    }
}
