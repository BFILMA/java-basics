public class DaemonThreads extends Thread{
    public DaemonThreads(String name){
        super(name);
    }
    public void run(){
        if(isDaemon()){
            System.out.println(getName() + " is a daemon thread");
        }
        else{
            System.out.println(getName() + " is a user thread");
        }
    }
    public static void main(String[] args) {
        DaemonThreads t1 = new DaemonThreads("t1");
        DaemonThreads t2 = new DaemonThreads("t2");
        DaemonThreads t3 = new DaemonThreads("t3");

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.setDaemon(true);
        t3.start();
    }
}
