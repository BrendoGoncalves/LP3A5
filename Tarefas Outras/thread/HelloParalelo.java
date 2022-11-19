package thread;

public class HelloParalelo {

        public static void main(String[] args) {
            class HelloParaleloX implements Runnable {
                public void run() {
                    System.out.println("Hello world paralelo!");
                }
            }
            Thread t1 = new Thread(new HelloParaleloX());
            t1.start();
            System.out.println("Thread principal: " + Thread.currentThread().getName());
        }
}
