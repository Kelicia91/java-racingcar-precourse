package racinggame;

import java.util.ArrayList;
import java.util.List;

class WinningCars {

	private final List<Car> winningCars;

	private WinningCars(List<Car> cars) {
		this.winningCars = new ArrayList<>();
		judge(cars);
	}

	public static WinningCars of(List<Car> cars) {
		return new WinningCars(cars);
	}

	public List<String> getNames() {
		final List<String> names = new ArrayList<>();
		for (Car car : winningCars) {
			names.add(car.getName());
		}
		return names;
	}

	private void judge(List<Car> cars) {
		final int maxMovingDistance = getMaxMovingDistance(cars);
		for (Car car : cars) {
			addWinningCars(car, maxMovingDistance);
		}
	}

	private void addWinningCars(Car car, int distance) {
		if (car.isDistanceSame(distance)) {
			winningCars.add(car);
		}
	}

	private int getMaxMovingDistance(List<Car> cars) {
		int max = Car.MOVING_DISTANCE_MIN;
		for (Car car : cars) {
			max = Math.max(car.getMovingDistance(), max);
		}
		return max;
	}
}
