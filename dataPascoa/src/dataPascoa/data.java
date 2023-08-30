package dataPascoa;

public class data {

	public static void main(String[] args) {
		
		int X = 24;
		int Y = 5;
		int ano = 1997;
		int A = ano % 19;
		int B = ano % 4;
		int C = ano % 7;
		int D = (19*A+X) % 30;
		int E = (2*B+4*C+6*D+Y) % 7;
		int dia = 0;
		int mes = 0;
		
		
		if ((D+E)>9 ) {
			dia = (D+E-9);
			mes = 4;
		}
		else dia = (D+E+22);
				mes = 3;
		
		if (mes == 4 && dia == 26 ) {
			dia = dia-7;
		}
		if (mes == 4 && dia == 25 && (D == 28 && A > 10)) {
			dia = 18;
		}
System.out.println("o domingo de pascoa e" + " " + dia + "/" + mes +"/" + ano);
	}

}
