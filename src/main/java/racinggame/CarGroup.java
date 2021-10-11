package racinggame;

import java.util.List;

public class CarGroup {
	private final List<Car> cars;

	public CarGroup(List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> getCars() {
		return cars;
	}
}
