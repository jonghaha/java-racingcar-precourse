package racinggame;

import java.util.ArrayList;
import java.util.List;

import nextstep.utils.Randoms;

public class CarUtils {
	private static final int START_INCLUSIVE = 0;
	private static final int END_INCLUSIVE = 9;

	public static CarGroup createCar(String names) {
		String[] carNames = names.split(",");
		List<Car> cars = new ArrayList<>();
		for (String name : carNames) {
			Car car = new Car(name);
			cars.add(car);
		}

		return new CarGroup(cars);
	}

	public static int getNumber() {
		return Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE);
	}
}
