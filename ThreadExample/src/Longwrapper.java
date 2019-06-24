public class Longwrapper {
    private Object key=new Object();
    private long l;

    public Longwrapper(long l) {
        this.l = l;
    }
    public long getValu(){
        return l;
    }
    public void incrementValue(){
        synchronized (key) {
            l = l + 1;
        }
    }
}
