package StringAdder.view;

import StringAdder.util.Spliter;

import java.util.List;
import java.util.Scanner;

/**
 * 입력 예시
 * (“” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
 * 커스텀 구분자 예시
 * (//;\n1;2;3 => 6)
 * */
public class Input {
    private static final String INPUT_MESSAGE = "문자를 입력해주세요. 커스텀 구분자 입력 형식: '//;\\n1;2;3'";
    private static final Scanner sc = new Scanner(System.in);

    public static List<Integer> input() {
        System.out.println(INPUT_MESSAGE);
        return Spliter.split(sc.nextLine());
    }
}
