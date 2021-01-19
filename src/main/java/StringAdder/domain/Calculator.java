package StringAdder.domain;

import StringAdder.view.Input;
import StringAdder.view.Result;

public class Calculator {

    public static void run() {
        int result = Adder.add(Input.input());
        Result.printResult(result);
    }
}
