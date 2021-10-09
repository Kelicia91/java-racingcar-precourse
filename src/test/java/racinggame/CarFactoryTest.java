package racinggame;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class CarFactoryTest {

	@Test
	void build() {
		final List<String> names = Arrays.asList("alice", "bob", "eve");
		final List<Car> cars = CarFactory.build(String.join(CarFactory.CAR_NAMES_DELIMITER, names));
		final List<String> carNames = new ArrayList<>();
		for (Car car : cars) {
			carNames.add(car.getName());
		}
		assertThat(carNames).containsExactlyElementsOf(names);
	}
}
