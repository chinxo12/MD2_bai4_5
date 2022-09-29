public class Main {
    public static void main(String[] args) {
//       Fan fan1 = new Fan(3,true,10,"yellow");
//       Fan fan2 = new Fan(2,false,5,"blue");
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        System.out.println("Fan");
        System.out.println(fan1.toString());
        fan1.setSpeed(3);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.toString());
        fan2.setSpeed(2);
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println("Fan2 sau khi  " + fan2.toString());





    }
}