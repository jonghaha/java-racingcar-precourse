package racinggame;

import nextstep.utils.Console;

public class Application {
    public static void main(String[] args) {
        try {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String attendNames = Console.readLine();
            System.out.println("시도할 회수는 몇회인가요?");
            int turnCount = Integer.parseInt(Console.readLine());
            String winner = RacingGame.start(attendNames, turnCount);
            System.out.println("최종 우승자는 " + winner + "입니다.");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
