package observerPattern;

public abstract class Obsever {

	//被观察的对象
	protected Subject subject;
	public abstract void update();
	
}
