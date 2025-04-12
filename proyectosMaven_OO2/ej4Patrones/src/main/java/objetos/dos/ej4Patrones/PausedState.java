package objetos.dos.ej4Patrones;

public class PausedState extends State{
	
	public State handleStart() {
		return this;
	}
	
	public State handleTogglePause() {
		return new InProgressState();
	}
	
	public State handleFinish() {
		return new FinishedState();
	}

}
