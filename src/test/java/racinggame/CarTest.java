package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import nextstep.test.NSTest;

class CarTest extends NSTest {

	private static final int MOVING_DISTANCE_MIN = 0;

	@ParameterizedTest
	@CsvSource(value = {
		"4:1", // CAN_MOVE:HOW_MANY_DISTANCE_MOVE
		"0:0"  // NOT_MOVE:MOVING_DISTANCE_MIN
	}, delimiter = ':')
	void move(int random, int movingDistance) {
		Car car = new Car("name");
		assertThat(car.getMovingDistance()).isEqualTo(MOVING_DISTANCE_MIN);
		assertRandomTest(() -> {
			assertThat(car.move()).isEqualTo(movingDistance);
		}, random);
	}

	@Override
	protected void runMain() {
	}
}
