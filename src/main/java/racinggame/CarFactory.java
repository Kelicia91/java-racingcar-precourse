package racinggame;

import java.util.ArrayList;
import java.util.List;

class CarFactory {

	public static final String CAR_NAMES_DELIMITER = ",";

	public static List<Car> build(String names) {
		final String[] carNames = names.split(CAR_NAMES_DELIMITER);
		final List<Car> cars = new ArrayList<>();
		for (String name : carNames) {
			cars.add(new Car(name));
		}
		return cars;
	}
}
