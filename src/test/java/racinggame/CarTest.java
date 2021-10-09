package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import nextstep.test.NSTest;

class CarTest extends NSTest {

	private static final int MOVING_DISTANCE_MIN = 0;
	private static final int CAN_MOVE_FORWARD = 4;
	private static final int HOW_MANY_DISTANCE_MOVE_FORWARD = 1;

	@Test
	void move() {
		Car car = new Car("name");
		assertThat(car.getMovingDistance()).isEqualTo(MOVING_DISTANCE_MIN);
		assertRandomTest(() -> {
			assertThat(car.move()).isEqualTo(HOW_MANY_DISTANCE_MOVE_FORWARD);
		}, CAN_MOVE_FORWARD);
	}

	@Override
	protected void runMain() {
	}
}
