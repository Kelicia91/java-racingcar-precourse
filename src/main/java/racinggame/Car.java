package racinggame;

import java.util.Objects;

import nextstep.utils.Randoms;

class Car {

	private static final int RANDOM_RANGE_MIN = 0;
	private static final int RANDOM_RANGE_MAX = 9;
	private static final int CAN_MOVE_FORWARD = 4;
	private static final int HOW_MANY_DISTANCE_MOVE_FORWARD = 1;

	private final String name;
	private int movingDistance;

	public Car(String name) {
		this.name = name;
		this.movingDistance = 0;
	}

	public void act() {
		if (canMoveForward()) {
			moveForward();
		}
	}

	private boolean canMoveForward() {
		int random = Randoms.pickNumberInRange(RANDOM_RANGE_MIN, RANDOM_RANGE_MAX);
		return random >= CAN_MOVE_FORWARD;
	}

	public void moveForward() {
		this.movingDistance += HOW_MANY_DISTANCE_MOVE_FORWARD;
	}

	public String getName() {
		return name;
	}

	public int getMovingDistance() {
		return movingDistance;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Car))
			return false;
		Car car = (Car)o;
		return movingDistance == car.movingDistance && name.equals(car.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, movingDistance);
	}
}
