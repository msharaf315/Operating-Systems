package memory;

public class Word {
	int userid;
	int processid;
	int value;
	int isEmpty = 1;

	public boolean isEmpty() {
		if (userid == 0 && processid == 0)
			return true;
		else
			return false;

	}

	public void setEmpty(boolean isEmpty) {
		if (isEmpty)
			this.isEmpty = 1;
		else
			this.isEmpty = 0;
	}

	public Word() {
		this.processid = 0;
		this.userid = 0;
		this.value = 0;
		this.isEmpty = 1;
	}

	public void create(int processid, int userid) {
		this.userid = userid;
		this.processid = processid;
		setEmpty(false);

	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getProcess_id() {
		return processid;
	}

	public void setProcess_id(int process_id) {
		this.processid = process_id;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void insert(int processid, int userid, int value) {
		this.processid = processid;
		this.userid = userid;
		this.value = value;
		setEmpty(false);
	}

	public void delete() {
		processid = 0;
		userid = 0;
		value = 0;
		setEmpty(true);
	}

	public String toString() {
		String s = "[";
		s += "|" + Integer.toBinaryString(userid);
		s += "|" + Integer.toBinaryString(processid);
		s += "|" + Integer.toBinaryString(value);
		s += "|" + Integer.toBinaryString(isEmpty);
		s+="]";
		return s;
	}
}