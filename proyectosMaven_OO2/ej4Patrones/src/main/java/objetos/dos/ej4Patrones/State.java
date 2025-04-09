package objetos.dos.ej4Patrones;

import java.time.Duration;
import java.time.LocalDate;

public interface State {
	
	public State handleStart();
	public State handleTogglePause();
	public State handleFinish();
	
	public Duration handleWorkedTime(LocalDate inicio);
	
	public String handleComment(String c);
}
