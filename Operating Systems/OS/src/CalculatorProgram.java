
public class CalculatorProgram extends Process {

int locationa,locationb,Result;



	public CalculatorProgram(int userId, int parentId, int processId, int numOfLocations, int priority) {
		super(userId, parentId, processId, 3, 0);
		
	}
	
	public void create(){
		
	}	
	
 public int calculate(int a,int b,calculationOperation operation) throws Exception{
	//set memory location a with value a and location b with value b and location result with value result
	 try{
		switch( operation ){
		 case ADD:
			 Result=a+b;
			 
		 case SUBTRACT:
			 Result =a-b;
		 case MULTIPLY:
			 Result= a*b;
		 case DIVIDE:
			 Result= a/b;
		 }	
	}
	catch(Exception e){
       System.out.print("wrong operant");		
	}
	return Result;
 }

public int getLocationa() {
	return locationa;
}

public int getLocationb() {
	return locationb;
}

// delete memory location and the instance thread of the app
public void terminate(){
	
}
 
}
