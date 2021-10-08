package racinggame;

class Car {

	private final String name;
	private int position;

	public Car(String name) {
		this.name = name;
		this.position = 0;
	}

	public void moveForward() {
		this.position += 1;
	}

	public String getName() { return name; }
	public int getPosition() { return position; }
}
