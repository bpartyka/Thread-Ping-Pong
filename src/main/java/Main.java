public class Main {
    public static void main(String [] args){

        Ball ball= new Ball();
        User user1= new User("ping", ball);
        User user2= new User("pong",ball);
        user1.addUser(user1);
        user2.addUser(user2);

    }
}
