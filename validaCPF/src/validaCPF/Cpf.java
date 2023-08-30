package validaCPF;

public class Cpf {

	public static void main(String[] args) {
		
		String cpf = "1234567891011";
		
		
		
		
	
		//Integer cpf = Integer.valueOf("16279329763");
		
		Integer A = Integer.valueOf(cpf.substring(0, 1));
		Integer B = Integer.valueOf(cpf.substring(1, 2));
		Integer C = Integer.valueOf(cpf.substring(2, 3));
		Integer D = Integer.valueOf(cpf.substring(3, 4));
		Integer E = Integer.valueOf(cpf.substring(4, 5));
		Integer F = Integer.valueOf(cpf.substring(5, 6));								
		Integer G = Integer.valueOf(cpf.substring(6, 7));
		Integer H = Integer.valueOf(cpf.substring(7, 8));
		Integer I = Integer.valueOf(cpf.substring(8, 9));
		Integer J = Integer.valueOf(cpf.substring(9, 10));
		Integer K = Integer.valueOf(cpf.substring(10, 11));
		
		//System.out.println(A);
		//System.out.println(B);

		
		Integer Ax = Integer.valueOf(cpf.substring(0, 1));
		Integer Bx = Integer.valueOf(cpf.substring(1, 2));
		Integer Cx = Integer.valueOf(cpf.substring(2, 3));
		Integer Dx = Integer.valueOf(cpf.substring(3, 4));
		Integer Ex = Integer.valueOf(cpf.substring(4, 5));
		Integer Fx = Integer.valueOf(cpf.substring(5, 6));
		Integer Gx = Integer.valueOf(cpf.substring(6, 7));
		Integer Hx = Integer.valueOf(cpf.substring(7, 8));
		Integer Ix = Integer.valueOf(cpf.substring(8, 9));
		//Integer Jx = Integer.valueOf(null);
		
		int resultadox = 0;
		
		Ax = A*10;
		Bx = B*9;
		Cx = C*8;
		Dx = D*7;
		Ex = E*6;
		Fx = F*5;
		Gx = G*4;
		Hx = H*3;
		Ix = I*2;
		
		resultadox = Ax+Bx+Cx+Dx+Ex+Fx+Gx+Hx+Ix;
		resultadox = resultadox%11;
		
		if (resultadox < 2) {
			resultadox = 0;
		}
		if (resultadox >= 2){
			resultadox = 11 - resultadox;
		}
		
		Integer Ay = Integer.valueOf(cpf.substring(0, 1));
		Integer By = Integer.valueOf(cpf.substring(1, 2));
		Integer Cy = Integer.valueOf(cpf.substring(2, 3));
		Integer Dy = Integer.valueOf(cpf.substring(3, 4));
		Integer Ey = Integer.valueOf(cpf.substring(4, 5));
		Integer Fy = Integer.valueOf(cpf.substring(5, 6));
		Integer Gy = Integer.valueOf(cpf.substring(6, 7));
		Integer Hy = Integer.valueOf(cpf.substring(7, 8));
		Integer Iy = Integer.valueOf(cpf.substring(8, 9));
		Integer Jy = Integer.valueOf(cpf.substring(9, 10));
		//Integer Ky = Integer.valueOf(cpf.substring(1, 2));
		
		int resultadoy = 0;
		
		Ay = A*11;
		By = B*10;
		Cy = C*9;
		Dy = D*8;
		Ey = E*7;
		Fy = F*6;
		Gy = G*5;
		Hy = H*4;
		Iy = I*3;
		Jy = J*2;
		
		resultadoy = Ay+By+Cy+Dy+Ey+Fy+Gy+Hy+Iy+Jy;
		resultadoy = resultadoy%11;
		
		if (resultadoy < 2) {
			resultadoy = 0;
		}
		if (resultadoy >= 2){
			resultadoy = 11 - resultadoy;
		}
		
		if (J == resultadox && K == resultadoy) {
			System.out.println("o cpf é valido");
		}
		
		if (J != resultadox || K != resultadoy) {
			System.out.println(" o cpf é invalido");
		}
		
		//System.out.println();
		System.out.println(resultadoy);
	}
		
	

}
