package objetos.dos.ej4Patrones;

public class InProgressState extends State{
	
	public State handleStart() {
		return this;
	}
	
	public State handleTogglePause() {
		return new PausedState();
	}
	
	public State handleFinish() {
		return new FinishedState();
	}

}
