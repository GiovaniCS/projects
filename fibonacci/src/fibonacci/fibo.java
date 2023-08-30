package fibonacci;

public class fibo {

	public static void main(String[] args) {
		
		
				int numero1 = 1; 
				int numero2 = 1;
				int numero3 = 0;  
			
				while( numero1 < 100 ) {
				
				numero3 = numero1+numero2;
				numero1 = numero2;
				numero2 = numero3;
				System.out.println(numero1);
				}
				
				
				
				
		}

	}


