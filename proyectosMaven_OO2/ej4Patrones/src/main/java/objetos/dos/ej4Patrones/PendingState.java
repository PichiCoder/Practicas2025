package objetos.dos.ej4Patrones;

import java.time.Duration;
import java.time.LocalDate;

public class PendingState implements State{
	
	public State handleStart() {
		return new InProgressState();
	}
	
	public State handleTogglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public State handleFinish() {
		return this;
	}
	
	public Duration handleWorkedTime(LocalDate inicio) {
		throw new RuntimeException("ToDoItem no iniciado");
	}
	
	public String handleComment(String c) {
		return c;
	}

}
