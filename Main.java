import java.util.Scanner;
public class Main {


public static void binary(int num){
    int x;
    int y = 0;
    String str = "";

    do {

        x = num % 2;
        num = num / 2;
        str = x + str;

    }while (num != 0);
    System.out.println(str);
}
//100 - 1100100


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        binary(scan.nextInt());

    }
}



