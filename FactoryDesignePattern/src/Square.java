public class Square implements  Shape {

    public void draw() {
        System.out.println("i am a Square class");

    }
    public void calcularea(int length){
        int result=length*length;
        System.out.println("the area of a square is"+result);
    }


}
