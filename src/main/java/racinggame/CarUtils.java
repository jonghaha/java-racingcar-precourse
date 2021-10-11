package racinggame;

import java.util.ArrayList;
import java.util.List;

public class CarUtils {
	public static CarGroup createCar(String names) {
		String[] carNames = names.split(",");
		List<Car> cars = new ArrayList<>();
		for (String name : carNames) {
			Car car = new Car(name);
			cars.add(car);
		}

		return new CarGroup(cars);
	}
}
