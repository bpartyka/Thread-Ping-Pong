public class Ball {

    private int movementCounter;
    String name;
    public void move(){
        movementCounter++;
        System.out.println(name);
    }
    public Ball (String name){
        this.name=name;
        movementCounter=0;
    }
    public void addBall(){
        Ball ball= new Ball(name);
        Runnable r= new BallRunnable(ball);
        Thread t=new Thread(r);
        t.start();
    }


}
