package boomball;

import static boomball.solution.Solution3.solution3;
import static boomball.view.InputView.readInput;
import static boomball.view.OutView.print;

public class Application {

    public static void main(String[] args) {
        String input = readInput();
        String result = solution3(input);
        print(result);
    }
}
