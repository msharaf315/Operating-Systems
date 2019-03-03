import memory.Memory;

import process.Process;
public class Main {
public static void main(String[]args) {
	Memory m=new Memory(80);
	Process p=new Process(5,5,5,5,5);
	Process p2=new Process(2,3,2,5,5);
	
	System.out.println(m.toString());
}
}
