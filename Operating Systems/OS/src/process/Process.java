package process;

public class Process {
static int process_id;
int parent_id;
int user_id;
static Process_State ps;
int priority;
static int Program_Counter;
Thread[] threads;


public Process(int user_id,int priority) {
	Process_State p= Process_State.START;
	process_id++;
	this.user_id=user_id;
	this.priority=priority;
	
}
}
