public class UserRunnable implements Runnable {
    public static final int movementMax=5;

    private  Ball ball;
    private User user;
    private Object lock= new Object();
    public UserRunnable(User us){
        user=us;
    }
    public void run() {

        synchronized (lock){
        try{
            for (int i = 0; i<movementMax;i++){
                user.move();
                Thread.sleep(10);
            }

        }
        catch (InterruptedException ex){

        }}

    }
}
