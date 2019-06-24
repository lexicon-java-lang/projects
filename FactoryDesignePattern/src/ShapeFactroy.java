public class ShapeFactroy {
    public Shape getShape(String shapetype ){
        if(shapetype==null){
            return null;
        }
        if(shapetype.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        else if(shapetype.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        else if(shapetype.equalsIgnoreCase("square")){
            return new  Square();
        }
        return null;

    }
}


