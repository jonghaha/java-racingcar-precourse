package racinggame;

import java.util.List;
import java.util.stream.Collectors;

public class CarGroup {
	private final List<Car> cars;

	public CarGroup(List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void startTurn() {
		for (Car car : cars) {
			car.move(CarUtils.getNumber());
		}
		RacingGame.printResult(cars);
	}

	public String winner() {
		int maxPosition = cars.stream().mapToInt(Car::getPosition).max().orElse(0);

		return cars.stream()
			.filter(c -> c.getPosition() == maxPosition)
			.map(Car::getName)
			.collect(Collectors.joining(","));
	}
}
