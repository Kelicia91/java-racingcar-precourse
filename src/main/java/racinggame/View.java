package racinggame;

import nextstep.utils.Console;

class View {

	private static final char CAR_MOVING_DISTANCE_UNIT_VIEW = '-';

	public void space() {
		System.out.println();
	}

	public void outError(String message) {
		println(String.format(Message.ERROR.getContent(), message));
	}

	public void outInputRacingCarNames() {
		println(Message.INPUT_RACING_CAR_NAMES.getContent());
	}

	public void outInputNumOfAttempts() {
		println(Message.INPUT_NUM_OF_ATTEMPTS.getContent());
	}

	public void outRunningResult() {
		println(Message.RUNNING_RESULT.getContent());
	}

	public void outWinningCars(WinningCars winningCars) {
		final String winningCarNames = String.join(CarFactory.CAR_NAMES_DELIMITER, winningCars.getNames());
		println(String.format(Message.WINNING_CARS.getContent(), winningCarNames));
	}

	public void outMovingCar(Car car) {
		println(String.format(Message.CAR_NAME_MOVING_DISTANCE.getContent(), car.getName(), formatMovingDistance(car)));
	}

	private String formatMovingDistance(Car car) {
		final int movingDistance = car.getMovingDistance();
		final StringBuilder stringBuilder = new StringBuilder();
		for (int i = Car.MOVING_DISTANCE_MIN; i < movingDistance; ++i) {
			stringBuilder.append(CAR_MOVING_DISTANCE_UNIT_VIEW);
		}
		return stringBuilder.toString();
	}

	public String inSafeInput() {
		String input;
		do {
			input = input();
		} while (null == input);
		return input;
	}

	private String input() {
		try {
			return Console.readLine();
		} catch (IllegalStateException e) {
			// @note: NoSuchElementException 까지 잡았더니 ApplicationTest.낫싱() 테스트가 종료되지 않음
			outError(e.getMessage());
			return null;
		}
	}

	private void println(String s) {
		System.out.println(s);
	}
}
