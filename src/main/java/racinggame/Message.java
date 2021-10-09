package racinggame;

enum Message {
	INPUT_RACING_CAR_NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
	INPUT_NUM_OF_ATTEMPTS("시도할 회수는 몇회인가요?"),
	RUNNING_RESULT("실행 결과"),
	WINNING_CARS("최종 우승자는 %s 입니다."),
	ERROR("[ERROR] %s"),
	ERROR_INVALID_NUM_OF_ATTEMPTS(String.format("the number of attempts must be at least greater than %d", Racing.ATTEMPTS_MIN)),
	ERROR_INVALID_CAR_NAME(String.format("car name length must be %d or less", Car.NAME_LENGTH_MAX));

	private final String content;

	Message(String content) { this.content = content; }

	public String getContent() { return content; }
}
