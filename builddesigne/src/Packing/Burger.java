package Packing;

public abstract class Burger implements Item{


    @Override
    public Packing packing()
    {
        return new Wrraper();
    }


    public abstract float price();

}
