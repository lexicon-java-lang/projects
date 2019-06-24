public class Main {
    public static void main(String[] args) {
        Contract call=new Sub();
        call.setnumbers(10000,0.01);
        Main call1=new Main();
        call1.dowhile();
    }
    public void dowhile(){
        int counter=0;
        do {
            System.out.print(counter);
            counter++;

        }while(counter <10);
        }
    }

