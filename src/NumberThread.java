public class NumberThread implements Runnable {
    private Thread mytThread;

    public NumberThread(){
        mytThread = new Thread(this, "my runnable thread");
        System.out.println("my thread created" + mytThread);
        mytThread.start();
    }

    public Thread getMytThread(){
        return mytThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i<10; i+=2){
                System.out.println(i);
                Thread.sleep(10);
            }
            for (int i=2; i<10; i+=2){
                System.out.println(i);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
