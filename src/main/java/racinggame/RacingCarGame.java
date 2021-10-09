package racinggame;

import java.util.List;

public class RacingCarGame {

	private final Racing racing;
	private final View view;

	public RacingCarGame() {
		this.racing = new Racing();
		this.view = new View();
	}

	public void run() {
		List<Car> cars = createCars();
		int numOfAttempts = inputNumOfAttempts();
		view.space();

		WinningCars winningCars = racing.run(cars, numOfAttempts);

		view.outWinningCars(winningCars);
	}

	private List<Car> createCars() {
		List<Car> cars;
		do {
			view.outInputRacingCarNames();
			cars = createCars(view.inSafeInput());
		} while (null == cars || cars.isEmpty());
		return cars;
	}

	private List<Car> createCars(String input) {
		try {
			return CarFactory.build(input);
		} catch (IllegalArgumentException e) {
			view.outError(e.getMessage());
			return null;
		}
	}

	private int inputNumOfAttempts() {
		view.outInputNumOfAttempts();
		Integer numOfAttempts;
		do {
			numOfAttempts = parseNumOfAttempts(view.inSafeInput());
		} while (null == numOfAttempts);
		return numOfAttempts;
	}

	private Integer parseNumOfAttempts(String s) {
		try {
			int numOfAttempts = Integer.parseInt(s);
			validateNumOfAttempts(numOfAttempts);
			return numOfAttempts;
		} catch (IllegalArgumentException e) {
			view.outError(e.getMessage());
			return null;
		}
	}

	private void validateNumOfAttempts(int numOfAttempts) {
		if (numOfAttempts < Racing.ATTEMPTS_MIN) {
			throw new IllegalArgumentException(Message.ERROR_INVALID_NUM_OF_ATTEMPTS.getContent());
		}
	}
}
