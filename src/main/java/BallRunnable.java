public class BallRunnable implements Runnable {

    public static final int movementMax=5;

   private  Ball ball;

   public BallRunnable(Ball b){
       ball=b;
   }
    public void run() {
        try{
            for (int i = 0; i<movementMax;i++){
                ball.move();
                Thread.sleep(10);
            }

        }
        catch (InterruptedException ex){

        }
    }
}
