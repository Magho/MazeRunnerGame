package undoAndRedo;

public class Test {
	
	//just for test
    public static void main(String[] args) {

    StateOfTheGame state = new StateOfTheGame ();
    Gametaker caretaker = new Gametaker();
    Originator originator = new Originator();
    originator.setState(state);
    originator.setState(state);
    caretaker.addRedoMemento( originator.save() );
    originator.setState(state);
    caretaker.addRedoMemento( originator.save() );
    originator.setState(state);
    originator.restore( caretaker.getRedoMemento());
    
    }
}
