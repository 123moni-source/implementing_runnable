class NewThread implements Runnable {
    Thread obj;

    NewThread() {
        obj = new Thread(this, "Demo thread");
        System.out.println("Child thread:" + obj);
        obj.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread:" + i);
                Thread.sleep(500);

            }
        } catch (InterruptedException e) {
            System.out.println("Exiting child thread.");
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();//create a new thread
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ob) {
            System.out.println("main thread interrupted.");
        }
    }
}

