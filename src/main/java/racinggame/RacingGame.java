package racinggame;

import java.util.List;

public class RacingGame {
	public static String start(String attendNames, int turnCount) {
		CarGroup racingGroup = CarUtils.createCar(attendNames);
		for (int i = 0; i < turnCount; i++) {
			racingGroup.startTurn();
		}
		return racingGroup.winner();
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
}
