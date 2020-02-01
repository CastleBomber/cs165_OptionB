package packedGoods;

import java.util.*;

public class MyCounter {

	int count;
	private ArrayList<CountChangedListener> countChangedListeners = new ArrayList<>();

	public void addCountChangedListerner(CountChangedListener listener) {
		countChangedListeners.add(listener);
	}


	public void removeCountChangedListener(CountChangedListener listener) {
		countChangedListeners.remove(listener);
	}


	private void fireCountChanged() {
		for (CountChangedListener listener : countChangedListeners)
			listener.countChanged(this);
	}


	public void increment() {
		count++;
		fireCountChanged();
	}
}
