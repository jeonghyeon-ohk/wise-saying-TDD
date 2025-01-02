import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        test2();
    }
    public static void test2(){
        PrintStream origin = System.out;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        System.out.println("hello"); // 출력 안됨. 왜?
        // -> hello 는 out에 들어있기 때문

        System.setOut(origin);

        String str = out.toString();
        System.out.println(str);
    }

    public static void test1(){
        Scanner scan = new Scanner("등록\n현재를 사랑하라.\n작자미상\n");
        String val1 = scan.nextLine();
        System.out.println(val1);

        String val2 = scan.nextLine();
        System.out.println(val2);

        String val3 = scan.nextLine();
        System.out.println(val3);

        TestApp testApp = new TestApp();
        testApp.run();
    }
}
