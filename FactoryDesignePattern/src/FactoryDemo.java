public class FactoryDemo {
    public static void main(String[] args) {


        ShapeFactroy shapeFactroy = new ShapeFactroy();
        Shape shape1 = shapeFactroy.getShape("circle");
        shape1.draw();
        Shape shape2 = shapeFactroy.getShape("rectangle");
        shape2.draw();
        Shape shape3 = shapeFactroy.getShape("square");
        shape3.draw();
    }
}
