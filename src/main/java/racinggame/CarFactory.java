package racinggame;

import java.util.ArrayList;
import java.util.List;

class CarFactory {

	public static List<Car> build(List<String> names) {
		final List<Car> cars = new ArrayList<>();
		for (String name : names) {
			cars.add(new Car(name));
		}
		return cars;
	}
}
