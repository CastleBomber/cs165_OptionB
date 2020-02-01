package packedGoods;

/**
 * Of course! Interfaces are like the skeletons our MainWindow class (observer/
 * listener)(child) will implement this class (Parent)
 */
public interface CountChangedListener {

	public void countChanged(MyCounter paramMyCounter); // needs to be in implementers class
}
