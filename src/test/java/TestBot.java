import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestBot {

    // 자바 시간에 객체는 static 지양.

    public static String run(String input) {
        Scanner sc = new Scanner(input + "종료\n");

        ByteArrayOutputStream out = new ByteArrayOutputStream(); // 공 스트림을 만든다
        System.setOut(new PrintStream(out)); // 공스트림을 가리키도록 system out을 변경한다

        App app = new App(sc); // 해당 입력값을 프로그램에 넘긴다.
        app.run(); // 프로그램이 실행되면서 사용자가 입력한 값들은 sc에 저장되게 된다.

        return out.toString();
    }
}
