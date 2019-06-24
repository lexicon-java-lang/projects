public class Kitchen {
    private static Kitchen kitchenInstance=new Kitchen();
    private Kitchen(){

    }
    public static Kitchen getInstance(){
        return new Kitchen();
    }
    public void dishwasher(){
        System.out.println("i am a kitchen how long do you want me to wash the dishes ");
    }
}
