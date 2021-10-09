package racinggame;

import java.util.List;

class Racing {

	public static final int ATTEMPTS_MIN = 1;

	private final View view;

	public Racing() {
		this.view = new View();
	}

	public WinningCars run(List<Car> cars) {
		int numOfAttempts = inputNumOfAttempts();
		view.space();
		view.outRunningResult();
		for (int attempt = ATTEMPTS_MIN; attempt <= numOfAttempts; ++attempt) {
			race(cars);
		}
		return WinningCars.of(cars);
	}

	private int inputNumOfAttempts() {
		view.outInputNumOfAttempts();
		int numOfAttempts;
		do {
			numOfAttempts = parseNumOfAttempts(view.inSafeInput());
		} while (Integer.MIN_VALUE == numOfAttempts);
		return numOfAttempts;
	}

	private int parseNumOfAttempts(String s) {
		try {
			int numOfAttempts = Integer.parseInt(s);
			validateNumOfAttempts(numOfAttempts);
			return numOfAttempts;
		} catch (IllegalArgumentException e) {
			view.outError(e.getMessage());
			return Integer.MIN_VALUE;
		}
	}

	private void validateNumOfAttempts(int numOfAttempts) {
		if (numOfAttempts < Racing.ATTEMPTS_MIN) {
			throw new IllegalArgumentException(Message.ERROR_INVALID_NUM_OF_ATTEMPTS.getContent());
		}
	}

	private void race(List<Car> cars) {
		for (Car car : cars) {
			car.move();
			view.outMovingCar(car);
		}
		view.space();
	}
}
