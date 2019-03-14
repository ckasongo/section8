
public class SumSquare { 
public static void main(String[] args) {
	int x = 3;
	int n = 0;
	while (x <= 33) {
		n += Math.pow(x, 2);
		System.out.printf("Cumulation result: %-8d :     %-8d *   %-8d%n", n , x , x);
		x += 3;
		}
	
		System.out.print("The SUM of Square of multiples is " + n );
	

  
 
  } 
} 


