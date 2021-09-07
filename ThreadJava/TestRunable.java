package ThreadJava;

class TestRunable implements Runnable {
    public void run() {
        System.out.println("thread is running...");
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        TestRunable m1 = new TestRunable();
        TestRunable m2 = new TestRunable();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
        //t1.run();
        //t2.run();
    }
}