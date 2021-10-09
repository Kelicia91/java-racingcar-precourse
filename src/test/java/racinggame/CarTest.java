package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import nextstep.test.NSTest;

class CarTest extends NSTest {

	@Test
	void tooLongName() {
		final String longName = "too much long name";
		assertThat(longName.length()).isGreaterThan(Car.NAME_LENGTH_MAX);
		assertThatExceptionOfType(IllegalArgumentException.class)
			.isThrownBy(() -> new Car(longName));
	}

	@ParameterizedTest
	@CsvSource(value = {
		"4:1", // CAN_MOVE:HOW_MANY_DISTANCE_MOVE
		"0:0"  // NOT_MOVE:MOVING_DISTANCE_MIN
	}, delimiter = ':')
	void move(int random, int movingDistance) {
		final Car car = new Car("name");
		assertThat(car.getMovingDistance()).isEqualTo(Car.MOVING_DISTANCE_MIN);
		assertRandomTest(() -> assertThat(car.move()).isEqualTo(movingDistance), random);
	}

	@Override
	protected void runMain() {
	}
}
