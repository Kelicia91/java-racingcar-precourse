package racinggame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nextstep.test.NSTest;

class RacingTest extends NSTest {

	@BeforeEach
	void beforeEach() {
		setUp();
	}

	@Test
	void invalidNumOfAttempts() {
		assertSimpleTest(() -> {
			runNoLineFound("alice,bob", Integer.toString(Racing.ATTEMPTS_MIN - 1));
			verify(Message.ERROR_INVALID_NUM_OF_ATTEMPTS.getContent());
		});
	}

	@AfterEach
	void tearDown() {
		outputStandard();
	}

	@Override
	public void runMain() {
		Application.main(new String[] {});
	}
}
