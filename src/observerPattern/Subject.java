package observerPattern;

import java.util.ArrayList;
import java.util.List;


public class Subject {
	
	private List<Obsever> obsevers = new ArrayList<>();
	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		notifyAllObsevers();
	}
	
	public void attach(Obsever obsever) {
		obsevers.add(obsever);
	}
	
	public void notifyAllObsevers() {
		for (Obsever obsever : obsevers) {
			obsever.update();
		}
	}
}
