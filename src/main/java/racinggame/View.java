package racinggame;

public class View {

	public static final String CAR_NAMES_DELIMITER = ",";

	private static final char CAR_MOVING_DISTANCE_UNIT_VIEW = '-';

	public void space() {
		System.out.println();
	}

	public void outError(String message) {
		println(String.format(Message.ERROR.getContent(), message));
	}

	public void outInputRacingCars() {
		println(Message.INPUT_RACING_CARS.getContent());
	}

	public void outInputNumOfAttempts() {
		println(Message.INPUT_NUM_OF_ATTEMPTS.getContent());
	}

	public void outRunningResult() {
		println(Message.RUNNING_RESULT.getContent());
	}

	public void outWinningCars(WinningCars winningCars) {
		String winningCarNames = String.join(CAR_NAMES_DELIMITER, winningCars.getNames());
		println(String.format(Message.WINNING_CARS.getContent(), winningCarNames));
	}

	public void outMovingCar(Car car) {
		println(String.format("%s : %s", car.getName(), formatMovingDistance(car)));
	}

	private String formatMovingDistance(Car car) {
		final int movingDistance = car.getMovingDistance();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < movingDistance; ++i) {
			stringBuilder.append(CAR_MOVING_DISTANCE_UNIT_VIEW);
		}
		return stringBuilder.toString();
	}

	private void println(String s) {
		System.out.println(s);
	}
}
