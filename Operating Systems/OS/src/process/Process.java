package process;

public class Process {
// ids for the user,parent process, and the process itself
public int  userId;
public int   parentId;
public int  processId;
// starting memory address & ending memory address
public int numOfLocations;
//the process state
public ProcessState state;
public int priority;

// constructor for the process  (should take program as an input)
public Process(int userId,int parentId,int processId, int numOfLocations, int priority) {
    this.userId = userId;
	this.processId = processId;
    this.parentId =  parentId;
    this.numOfLocations = numOfLocations;
    state = ProcessState.NEW;
    this.priority = priority;

}

public int getUserId() {
	return userId;
}

public int getParentId() {
	return parentId;
}

public int getProcessId() {
	return processId;
}

public ProcessState getState() {
	return state;
}

public void setState(ProcessState state) {
	this.state = state;
}

public int getSize() {
    return numOfLocations;
}

}