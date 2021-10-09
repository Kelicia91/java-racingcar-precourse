package racinggame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CarFactory {

	public static final String CAR_NAMES_DELIMITER = ",";

	public static List<Car> build(String names) {
		List<String> carNames = Arrays.asList(names.split(CAR_NAMES_DELIMITER));
		final List<Car> cars = new ArrayList<>();
		for (String name : carNames) {
			cars.add(new Car(name));
		}
		return cars;
	}
}
