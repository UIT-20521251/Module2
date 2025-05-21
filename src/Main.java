import ss4_OOP.StopWatch;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter hours: ");
        int hours = Integer.parseInt(sc.nextLine());
        System.out.printf("Enter minutes: ");
        int minutes = Integer.parseInt(sc.nextLine());
        System.out.printf("Enter seconds: ");
        int seconds = Integer.parseInt(sc.nextLine());
        StopWatch watch =new StopWatch(hours, minutes, seconds);
        watch.startCount();
    }

}