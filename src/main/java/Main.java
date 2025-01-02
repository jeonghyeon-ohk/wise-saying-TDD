import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner("aaa\nbbb\n");
        String val1 = scan.nextLine();
        System.out.println(val1);
        String val2 = scan.nextLine();
        System.out.println(val2);
    }
}
