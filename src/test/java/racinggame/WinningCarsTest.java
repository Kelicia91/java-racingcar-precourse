package racinggame;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class WinningCarsTest {

	@Test
	void of() {
		List<String> carNames = Arrays.asList("alice", "bob");
		List<Car> cars = CarFactory.build(carNames);
		WinningCars winningCars = WinningCars.of(cars);
		assertThat(winningCars.getNames()).containsExactlyElementsOf(carNames);
	}
}
