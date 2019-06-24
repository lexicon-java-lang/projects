public class Firstthread {
    public static void main(String[] args) throws InterruptedException {

        //normal thread
        Runnable runnable = () -> {
            System.out.println("i am running in thread \t" + Thread.currentThread().getName());
        };
        Thread t1 = new Thread(runnable);
        t1.setName("biniam");
        t1.start();
        System.out.println("This is another thread\n\n");
//this is for one thread calling
        Longwrapper longwrapper = new Longwrapper(0L);
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                longwrapper.incrementValue();
            }
        };
        /*Thread t2 = new Thread(r);
        t2.start();
        t2.join();
        System.out.println(longwrapper.getValu());*/
        //for many threads calling A class at the same time gives differen results
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(r);
            threads[i].start();
        }
        for (int i=0;i<threads.length;i++)
        threads[i].join();
        System.out.println(longwrapper.getValu());
    }
}
