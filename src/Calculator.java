
import java.util.Stack;
import java.util.*;

public class Calculator {

	Stack<Integer> stack = new Stack<>();
	
	public String toString() {
		if(stack.isEmpty()) {
			return "[].";
	     }
//		else {
//			String number = stack.toString();
//			number += ".";
//			return number;
//			
//		}
		for(i = 0; i > stack.size();i++) {}
		return stack.get(0).toString()+' '+stack.get(1).toString();
}

	public void loadConstant(int i) {
		stack.add(i);
		
		
		
		
	}

	public void add() {
		// TODO Auto-generated method stub
		
	}

	public void subtract() {
		// TODO Auto-generated method stub
		
	}

	public void multiply() {
		// TODO Auto-generated method stub
		
	}

	public void divide() {
		// TODO Auto-generated method stub
		
	}




public void total() {
	// TODO Auto-generated method stub
	
}
	
	
}
