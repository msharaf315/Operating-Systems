package memory;

public class Memory {
	int size;//size of the memory
	static Word[] memory;//a memory of words

	public Memory(int size) {
		this.size = size;
		memory = new Word[size];
		for (int i = 0; i < memory.length; i++) {
			memory[i] = new Word();
		}
	}

	public Word getword(int location) {
		return memory[location];
	}

	public void delete(int location) {
		memory[location].delete();
	}

	public static void delete(int processid, int userid) {
		for (Word w : memory) {
			if (!w.isEmpty()&&w.getProcess_id()==processid&&w.getUserid()==userid) {
				w.delete();
				w.setEmpty(true);
			}
		}
	}

	public static void create(int numOfLocations, int userid, int processid) {
		int i = 0;
		for (int j = 0; j < numOfLocations; j++) {

			while (i < memory.length) {
				Word word = memory[i];
				i++;
				if (word.isEmpty()) {
					word.create(processid, userid);
					break;	
				}

				
			}
		}
	}

	public void insert(int userid, int processid, int value) {
		for (int i = 0; i < memory.length; i++) {
			Word word = memory[i];
			if (word.getUserid() == 0) {
				word.insert(processid, userid, value);
				break;
			} else if (word.getUserid() == userid && word.getProcess_id() == processid) {
				word.insert(processid, userid, value);
				break;
			}
		}

	}

	public void insert(int location, int userid, int processid, int value) {
		if (memory[location].isEmpty()) {
			memory[location].insert(processid, userid, value);
		} else {

		}
	}

	public void clear() {
		for (Word w : memory) {
			w.delete();
		}
	}

	public void sort() {
		
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < memory.length; i++) {
			s += i+": " +memory[i].toString() + "\n";
		}
		return s;

	}

	public static void main(String[] args) {
		Memory m = new Memory(30);
		m.create(10, 5, 5);
		m.create(10, 2, 1);
		System.out.println(m.toString());
		m.clear();
		System.out.println(m.toString());
		

	}
}