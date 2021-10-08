package racinggame;

public class View {

	private static final char CAR_MOVING_DISTANCE_UNIT_VIEW = '-';

	public void space() {
		System.out.println();
	}

	public void print(Car car) {
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
