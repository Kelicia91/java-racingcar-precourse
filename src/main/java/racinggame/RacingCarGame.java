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
		view.outWinningCars(racing.run(createCars()));
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
}
