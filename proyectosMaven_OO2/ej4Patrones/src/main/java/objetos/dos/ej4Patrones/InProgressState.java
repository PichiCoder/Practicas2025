package objetos.dos.ej4Patrones;

import java.time.Duration;
import java.time.LocalDate;


public class InProgressState implements State {
	
	public State handleStart() {
		return this;
	}
	
	public State handleTogglePause() {
		return new PausedState();
	}
	
	public State handleFinish() {
		return new FinishedState();
	}
	
	public Duration handleWorkedTime(LocalDate inicio) {
		return Duration.between(inicio, LocalDate.now());
	}
	
	public String handleComment(String c) {
		return c;
	}
}
