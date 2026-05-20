
public class StringList {

	private ExampleClass[] data;
	private int nextInsertPosition;

	public StringList(int initialSize) {
		this.data = new ExampleClass[initialSize];
		this.nextInsertPosition = 0;
	}

	public StringList(ExampleClass[] initialArray) {
		this.data = initialArray;
		this.nextInsertPosition = initialArray.length;
	}

	public void add(ExampleClass s) {
		if (data.length <= nextInsertPosition)
			grow();
		data[nextInsertPosition] = s;
		nextInsertPosition++;
	}

	/**
	 * Ersetzt den String an der gewünschten Stelle durch einen anderen
	 * 
	 * @param index Index des zu ersetzenden Elements
	 * @param s     String, durch den ersetzt werden soll
	 */
	public void set(int index, ExampleClass s) {
		data[index] = s;
	}

	public void remove(ExampleClass toRemove) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == toRemove) {
				remove(i);
			}
		}
	}

	/**
	 * Diese Methode entfernt den String an der Stelle "index" aus der Liste. Auch
	 * hier dürfen keine Lücken entstehen!
	 * 
	 * @param index
	 */
	public void remove(int index) {
		if (full())
			for (int i = index; i < nextInsertPosition - 1; i++) {
				this.data[i] = this.data[i + 1];
			}
		else
			// Math.min(nextInsertPosition, data.length);
			for (int i = index; i < nextInsertPosition; i++) {
				this.data[i] = this.data[i + 1];
			}
		nextInsertPosition = nextInsertPosition - 1;
	}

	public int indexOf(ExampleClass s) {
		for (int i = 0; i < data.length; i++) {
			// for (String irgendwas : data) {
			if (s.equals(data[i])) {
				return i;
			}
		}
		return -1;
	}

	public ExampleClass get(int index) {
		if (isIndexValid(index)) {
			return data[index];
		} else {
			return null;
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");

		for (int i = 0; i < nextInsertPosition; i++) {
			sb.append(data[i]);
			if (i < nextInsertPosition - 1)
				sb.append(", ");
		}

		sb.append("]");
		return sb.toString();
	}

	/**
	 * Gibt an, wieviele Elemente diese Liste momentan enthält.
	 * 
	 * @return Anzahl der Elemente dieser Liste
	 */
	public int size() {
		return this.nextInsertPosition;
	}

	private boolean isIndexValid(int index) {
		return index < nextInsertPosition;
	}

	private boolean full() {
		return data.length <= nextInsertPosition;
	}

	private void grow() {
		// neues Array mit bisheriger Länge + 10
		ExampleClass[] temp = new ExampleClass[data.length + 10];

		// alle Elemente ins neue Array kopieren
		for (int i = 0; i < data.length; i++) {
			temp[i] = data[i];
		}

		// neues Array als intern verwendetes Array festlegen
		this.data = temp;
	}

}