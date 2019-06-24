public class Factory {

    public Kitchen passInstance( String object)
    {
        if(object==null){
            return null;
        }
        if(object.equalsIgnoreCase("eden")){
            return new Eden();
        }
        else if(object.equalsIgnoreCase("biniam")){
            return new Biniam();
        }
        else if(object.equalsIgnoreCase("noah")){
            return new Noah();
        }

        return null;
    }
}
