package racinggame;

import java.util.List;
import java.util.NoSuchElementException;

import nextstep.utils.Console;

public class RacingGame {
	public void start() {
		CarGroup racingGroup;
		int turnCount;

		try {
			System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
			String attendNames = Console.readLine();
			racingGroup = CarUtils.createCar(attendNames);
			System.out.println("시도할 회수는 몇회인가요?");
			turnCount = Integer.parseInt(Console.readLine());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			throw new NoSuchElementException();
		}

		try {
			processGame(racingGroup, turnCount);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			throw new IllegalArgumentException();
		}
	}

	public static void printResult(List<Car> cars) {
		System.out.println("실행 결과");
		for (Car car : cars) {
			System.out.print(car.getName() + " : ");
			printPosition(car.getPosition());
		}
	}

	private static void printPosition(int position) {
		for (int i = 0; i < position; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	private void processGame(CarGroup racingGroup, int turnCount) {
		if (turnCount < 1) {
			throw new IllegalArgumentException("[ERROR] 시도할 횟수는 1이상 입력해주세요.");
		}
		for (int i = 0; i < turnCount; i++) {
			racingGroup.startTurn();
		}
		printWinner(racingGroup.winner());
	}

	private void printWinner(String winner) {
		System.out.println("최종 우승자는 " + winner + " 입니다.");
	}
}
