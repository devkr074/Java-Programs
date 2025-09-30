class InnerProgram_99 implements Runnable {
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

public class Program_99 extends Thread {
    public static int amount = 0;

    public void run() {
        amount++;
    }

    public static void main(String[] args) {
        Program_99 thread = new Program_99();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
        thread.start();
        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
        InnerProgram_99 obj = new InnerProgram_99();
        Thread thread2 = new Thread(obj);
        thread2.start();
        System.out.println("This code is outside of the thread");
    }
}