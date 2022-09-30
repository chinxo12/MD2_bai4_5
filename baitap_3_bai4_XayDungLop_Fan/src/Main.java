public class Main {
    public static void main(String[] args) {
//       Fan fan1 = new Fan(3,true,10,"yellow");
//       Fan fan2 = new Fan(2,false,5,"blue");
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println("fan1");
        System.out.println(fan1.toString());
        System.out.println("fan2");
        System.out.println(fan2.toString());






    }
}