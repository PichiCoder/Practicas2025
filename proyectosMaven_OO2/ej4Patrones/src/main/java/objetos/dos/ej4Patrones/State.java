package objetos.dos.ej4Patrones;

import java.time.Duration;
import java.time.LocalDate;

public abstract class State{
	
	public abstract State handleStart();
	public abstract State handleTogglePause();
	public abstract State handleFinish();
	
	public Duration handleWorkedTime(LocalDate inicio, LocalDate fin) {
		if (fin == null) fin = LocalDate.now();
		
		return Duration.between(inicio, fin);
	}
	
	public String handleComment(String c) {
		return c;
	}
}
