package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarUtilsTest {
	@Test
	void 문자열입력_자동차그룹_생성() {
		String names = "abc,def,ghi";
		CarGroup racingGroup = CarUtils.createCar(names);
		assertThat(racingGroup.getCars().size()).isEqualTo(3);
	}
}
