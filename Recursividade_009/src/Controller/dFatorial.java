package Controller;

public class dFatorial {

	public dFatorial() {
		
		super();
		
		
	}
	
	
	public int dFatorial (int N) {
		
		if (N == 1) {
			
			return 1;
			
		}
		
		
		return N * dFatorial(N - 2);
		
		
		
	}
	
	
}
