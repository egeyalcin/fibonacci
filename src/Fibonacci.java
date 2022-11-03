import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int howMuch;
        int i = 0;
        int a = 0,b = 1,c;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kac basamak olsun :");
        howMuch = inp.nextInt();

        while (i < howMuch) {
            c = a + b;
            a=b;
            b=c;
            System.out.println(c);
            i++;
        }
    }
}

