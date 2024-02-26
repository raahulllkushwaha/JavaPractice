class MyThread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("I'm happy");
            System.out.println("rahul");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("I'm sad");
            System.out.println("kushwaha");
        }
    }
}

public class practingThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
