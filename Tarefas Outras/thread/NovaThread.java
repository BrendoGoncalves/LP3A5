package thread;

class NovaThread extends Thread {
    public void run() {
        System.out.println("Sou uma nova thread" + this.getName() );
    }
}
