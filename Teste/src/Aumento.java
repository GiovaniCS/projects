
public class Aumento {
	public void aumento(Usuario g) {
		System.out.println(g.getSalario() + 100);
	}
	
	/*public void aumento(Vendedor v) {
		System.out.println(v.getSalario() + 50);
	}*/
	
	public Boolean validaCpf(String cpf) {
		Integer p1 = Integer.valueOf(cpf.substring(0, 1));
		Integer p2 = Integer.valueOf(cpf.substring(1, 2));
		Integer p3 = Integer.valueOf(cpf.substring(2, 3));
		Integer p4 = Integer.valueOf(cpf.substring(3, 4));
		Integer p5 = Integer.valueOf(cpf.substring(4, 5));
		Integer p6 = Integer.valueOf(cpf.substring(5, 6));
		Integer p7 = Integer.valueOf(cpf.substring(6, 7));
		Integer p8 = Integer.valueOf(cpf.substring(7, 8));
		Integer p9 = Integer.valueOf(cpf.substring(8, 9));
		Integer p10 = Integer.valueOf(cpf.substring(9, 10));
		Integer p11 = Integer.valueOf(cpf.substring(10, 11));
		
		Integer y1 = Integer.valueOf(cpf.substring(0, 1));
		Integer y2 = Integer.valueOf(cpf.substring(1, 2));
		Integer y3 = Integer.valueOf(cpf.substring(2, 3));
		Integer y4 = Integer.valueOf(cpf.substring(3, 4));
		Integer y5 = Integer.valueOf(cpf.substring(4, 5));
		Integer y6 = Integer.valueOf(cpf.substring(5, 6));
		Integer y7 = Integer.valueOf(cpf.substring(6, 7));
		Integer y8 = Integer.valueOf(cpf.substring(7, 8));
		Integer y9 = Integer.valueOf(cpf.substring(8, 9));
		
		Integer z1 = Integer.valueOf(cpf.substring(0, 1));
		Integer z2 = Integer.valueOf(cpf.substring(1, 2));
		Integer z3 = Integer.valueOf(cpf.substring(2, 3));
		Integer z4 = Integer.valueOf(cpf.substring(3, 4));
		Integer z5 = Integer.valueOf(cpf.substring(4, 5));
		Integer z6 = Integer.valueOf(cpf.substring(5, 6));
		Integer z7 = Integer.valueOf(cpf.substring(6, 7));
		Integer z8 = Integer.valueOf(cpf.substring(7, 8));
		Integer z9 = Integer.valueOf(cpf.substring(8, 9));
		
		Integer resultadoz = 0;
		Integer divisaoz = 0;
		Integer resultadoy = 0;
		Integer divisaoy = 0;
		Integer controle1 = 0;
		Integer digito1 = 0;
		Integer digito2 = 0;
		
		z9 = p9 * 2;
		z8 = p8 * 3;
		z7 = p7 * 4;
		z6 = p6 * 5;
		z5 = p5 * 6;
		z4 = p4 * 7;
		z3 = p3 * 8;
		z2 = p2 * 9;
		z1 = p1 * 10;
		
		resultadoz = z1 + z2 + z3 + z4 + z5 + z6 + z7 + z8 + z9;
		divisaoz = resultadoz % 11;
		
		if (divisaoz < 2) {
			digito1 = 0;
		} else if (divisaoz >= 2) {
			digito1 = 11 - divisaoz;
		}
		
		controle1 = digito1 * 2;
		y9 = p9 * 3;
		y8 = p8 * 4;
		y7 = p7 * 5;
		y6 = p6 * 6;
		y5 = p5 * 7;
		y4 = p4 * 8;
		y3 = p3 * 9;
		y2 = p2 * 10;
		y1 = p1 * 11;
		
		resultadoy = y1 + y2 + y3 + y4 + y5 + y6 + y7 + y8 + y9 + controle1;
		divisaoy = resultadoy % 11;
		
		if (divisaoy < 2) {
			digito2 = 0;
		} else if (divisaoy >= 2) {
			digito2 = 11 - divisaoy;
		}
		
		if(digito1 == p10 && digito2 == p11) {
			System.out.println("CPF Válido");
			System.out.println("O valor do dígito 1 é: " + digito1 + " e o valor do dígito 2 é: " + digito2);
			return true;
		}			
		else {
			System.out.println("CPF Inválido");
			System.out.println("O valor do dígito 1 é: " + digito1 + " e o valor do dígito 2 é: " + digito2);
			return false;
		}
			
		
	}
}
