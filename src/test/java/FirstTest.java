import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstTest {

    @Test
    void t1(){
        int rst = 1;
        assertThat(rst).isEqualTo(1);
    }

    @Test
    void t2(){
        TestApp app = new TestApp();
        app.run();
    }

    @Test
    void t3(){

    }

    @Test
    @DisplayName("앱 시작시 '== 명언 앱 ==' 출력")
    void t4(){
        // 테스트봇 선입력
        Scanner sc = new Scanner("종료\n");

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        TestApp app = new TestApp();
        app.run();

        assertThat(out.toString()) // 문자열 비교할때는 isEqualTo 보단 contains 사용
                .contains("== 명언 앱 ==")
                .contains("명언앱을 종료합니다.");

        // 출력값을 체크
    }
}
