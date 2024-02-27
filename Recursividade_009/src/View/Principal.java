package View;

import Controller.dFatorial;
import java.util.*;


public class Principal {
	public static void main (String[] args ) {
		
		Scanner scan = new Scanner(System.in);
		
		dFatorial dfatorial = new dFatorial();
		
		
		boolean var = false;
		int N = 0;
		
		while (var == false) {
			
			System.out.print("Insira um número natural ímpar: ");
			
			N = scan.nextInt();
			
			
			if (N % 2 == 0) {
								
				System.out.println("O valor não é ímpar");
					
				
			}
			
			else {
				
				
				var = true;
				
			}
							
		}
		
		System.out.println("Resultado: " + dfatorial.dFatorial(N));
		
		
		
	}
	
	
	
}
