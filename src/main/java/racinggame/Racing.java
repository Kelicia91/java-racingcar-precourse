package racinggame;

import java.util.List;

class Racing {

	public static final int ATTEMPTS_MIN = 1;

	private final View view;

	public Racing() {
		this.view = new View();
	}

	public WinningCars run(List<Car> cars, int numOfAttempts) {
		view.outRunningResult();
		for (int attempt = ATTEMPTS_MIN; attempt <= numOfAttempts; ++attempt) {
			race(cars);
		}
		return WinningCars.of(cars);
	}

	private void race(List<Car> cars) {
		for (Car car : cars) {
			car.act();
			view.outMovingCar(car);
		}
		view.space();
	}
}
