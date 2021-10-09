package racinggame;

import nextstep.utils.Randoms;

class Car {

	public static final int NAME_LENGTH_MAX = 5;
	public static final int MOVING_DISTANCE_MIN = 0;

	private static final int RANDOM_RANGE_MIN = 0;
	private static final int RANDOM_RANGE_MAX = 9;
	private static final int CAN_MOVE_FORWARD = 4;
	private static final int HOW_MANY_DISTANCE_MOVE_FORWARD = 1;

	private final String name;
	private int movingDistance;

	public Car(String name) {
		validateCarName(name);
		this.name = name;
		this.movingDistance = MOVING_DISTANCE_MIN;
	}

	public boolean isDistanceSame(int distance) {
		return movingDistance == distance;
	}

	/**
	 * 이동한 거리를 반환
	 */
	public int move() {
		final int lastMovingDistance = getMovingDistance();
		if (canMoveForward()) {
			moveForward();
		}
		return getMovingDistance() - lastMovingDistance;
	}

	private boolean canMoveForward() {
		final int random = Randoms.pickNumberInRange(RANDOM_RANGE_MIN, RANDOM_RANGE_MAX);
		return random >= CAN_MOVE_FORWARD;
	}

	private void moveForward() {
		this.movingDistance += HOW_MANY_DISTANCE_MOVE_FORWARD;
	}

	private void validateCarName(String name) {
		if (name.length() > Car.NAME_LENGTH_MAX) {
			throw new IllegalArgumentException(Message.ERROR_INVALID_CAR_NAME.getContent());
		}
	}

	public String getName() {
		return name;
	}

	public int getMovingDistance() {
		return movingDistance;
	}
}
