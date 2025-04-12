package objetos.dos.ej4Patrones;

public class FinishedState extends State{
	
	public State handleStart() {
		return this;
	}
	
	public State handleTogglePause() {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
	}
	
	public State handleFinish() {
		return this;
	}
	
	@Override
	public String handleComment(String c) {
		return null;
	}
}
