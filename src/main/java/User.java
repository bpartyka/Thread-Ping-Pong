public class User {
    private int movementCounter;
    String name;
    Ball ball;
    public void move(){
        movementCounter++;
        System.out.println(name);
    }
    public User (String name, Ball ball){
        this.name=name;
        this.ball=ball;
        movementCounter=0;
    }
    public User (){

        movementCounter=0;
    }
    public void addUser(User user){
        Runnable r= new UserRunnable(user);
        Thread t= new Thread(r);
        t.start();
    }
}
