// class MyRunnable implements Runnable {
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             // System.out.println(Thread.currentThread().getId() + " Value " + i);
//             System.out.println(i);
//         }
//     }
// }

// public class thread {
//     public static void main(String args[]) {
//         Thread t1 = new Thread(new MyRunnable());
//         t1.start();

//         Thread t2 = new Thread(new MyRunnable());
//         t2.start();
//     }
// }

class MyRunnable implements Runnable {
    @Override
    public void run() {
        while(true){
      System.out.println("This is running in a separate thread (Runnable interface)");
    }
  }
}
  public class thread {
    public static void main(String[] args) {
      MyRunnable myRunnable = new MyRunnable();
      Thread thread = new Thread(myRunnable);
      thread.start();
  
      System.out.println("This is running in the main thread!");
    }
  }
  
