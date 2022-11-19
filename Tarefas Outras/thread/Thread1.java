package thread;
import java.lang.Thread;

public class Thread1 {
    public static void main(String[] args) {

        Thread goal = Thread.currentThread();
        System.out.println("Nome da Thread: " +goal.getName());
        System.out.println("Thread.toString(): " +goal);
    }
}
