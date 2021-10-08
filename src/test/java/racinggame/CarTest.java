package racinggame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	void moveForward() {
		Car car = new Car("name");
		assertThat(car.getMovingDistance()).isEqualTo(0);
		car.moveForward();
		assertThat(car.getMovingDistance()).isEqualTo(1);
	}
}
