package objetos.dos.ej4Patrones;

import java.time.Duration;
import java.time.LocalDate;

public class FinishedState implements State{
	
	public State handleStart() {
		return this;
	}
	
	public State handleTogglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public State handleFinish() {
		return this;
	}
	
	public Duration handleWorkedTime(LocalDate inicio) {
		return Duration.between(inicio, LocalDate.now());
	}
	
	public String handleComment(String c) {
		return "";
	}

}
