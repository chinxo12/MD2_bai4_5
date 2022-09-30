import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int [] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int) Math.random()*10000;
        }
        stopWatch.start();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < args.length ; j++) {
                if (arr[i]>arr[j]){
                    int x = arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());

    }
}