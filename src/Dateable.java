import java.util.Scanner;


public class Dateable {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter ur age");
        int age = scan.nextInt();
        int dateable = ( 7 + ( age / 2 ) );
        System.out.println(dateable);
        int page = (100 - age);
                System.out.println("ur "+ age + " so read "+ page+" pages everyday ok?");

    }
}
