package racinggame;

import java.util.Arrays;
import java.util.List;

public class RacingCarGame {

	private final Racing racing;
	private final View view;

	public RacingCarGame() {
		this.racing = new Racing();
		this.view = new View();
	}

	public void run() {
		List<String> carNames = inputCarNames();
		int numOfAttempts = inputNumOfAttempts();
		view.space();

		List<Car> cars = createCars(carNames);
		WinningCars winningCars = racing.run(cars, numOfAttempts);

		view.outWinningCars(winningCars);
	}

	private List<String> inputCarNames() {
		view.outInputRacingCars();
		List<String> carNames;
		do {
			carNames = parseCarNames(view.inSafeInput());
		} while (null == carNames);
		return carNames;
	}

	private List<String> parseCarNames(String input) {
		try {
			List<String> names = Arrays.asList(input.split(View.CAR_NAMES_DELIMITER));
			validateCarNames(names);
			return names;
		} catch (IllegalArgumentException e) {
			view.outError(e.getMessage());
			return null;
		}
	}

	private void validateCarNames(List<String> carNames) {
		for (String name : carNames) {
			validateCarName(name);
		}
	}

	private void validateCarName(String name) {
		if (name.length() > Car.NAME_LENGTH_MAX) {
			throw new IllegalArgumentException(Message.ERROR_INVALID_CAR_NAME.getContent());
		}
	}

	private List<Car> createCars(List<String> names) {
		return CarFactory.build(names);
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
