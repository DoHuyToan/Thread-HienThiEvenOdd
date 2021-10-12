public class Main {
    public static void main(String[] args) {
        NumberThread n1 = new NumberThread();
        NumberThread n2 = new NumberThread();

        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n2);

        t1.start();
        t2.start();
    }
}
