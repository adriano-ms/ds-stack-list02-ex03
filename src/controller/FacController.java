package controller;

import br.edu.fateczl.stack.IntStack;

public class FacController {
	
	private IntStack stack;
	
	public FacController() {
		stack = new IntStack();
	}
	
	public int factorial(int n) {
		try {		
			if(n > 1) 
				n = stackValues(n);
			
			if(!stack.isEmpty()) 
				return stack.pop() * factorial(n);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return n;
		
	}
	
	private int stackValues(int n) {
		if(n > 1) {
			stack.push(n);
			return stackValues(n - 1);
		}
		
		return n;
	}

}
