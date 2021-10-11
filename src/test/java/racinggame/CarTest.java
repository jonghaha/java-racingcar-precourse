package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {
	@Test
	void 자동차_이름은_다섯글자까지() {
		Car testCar = new Car("test1");

		assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
			Car testCar1 = new Car("test12");
		}).withMessageContaining("[ERROR] 자동차 이름은 5자이하만 가능합니다.");
	}

	@Test
	void 자동차_전진() {
		Car car = new Car("move");
		car.move();
		assertThat(car.getPosition()).isEqualTo(1);
	}
}
