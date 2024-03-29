package observerPattern;

public class HexaObserver extends Obsever {

	public HexaObserver(Subject subject){
		this.subject = subject;
	    this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println( "Hex String: " + Integer.toHexString(subject.getState()).toUpperCase()); 
	}

}
