import java.awt.color.*;

public class MainClass {

	public static void main(String[] args) {
					
		//Gerente g = new Gerente(1, "Renato", 37, "123", 1900.0);
		//Vendedor v = new Vendedor();
		
		String cpf = "11111111111";
		//asdasdsadasdasd
		//System.out.println(cpf.length());		
		//System.out.println(cpf.substring(0, 3));
		//System.out.println(cpf.substring(10, 11));
		
		//Integer cpfinteiro = 123456789;
		
		Long conversao;
		
		try {
			conversao = Long.valueOf(cpf);
			System.out.println(conversao);
		} catch (Exception e) {
			System.out.println("O valor do campo CPF é inválido: " + cpf + " Mensagem de erro do java: " + e.getMessage());			
		}
		
		//System.out.println(cpfinteiro);
		
		Aumento a = new Aumento();
		String resultado;
		resultado = String.valueOf(a.validaCpf(cpf));
		a.validaCpf(cpf);
		System.out.println(resultado);
		
		/*int i = 0;
		while (i < 100) {			
			if(i % 3 == 0) {
				System.out.println(i);
			}	
			i++;
		}	*/	
				
		//g.setSalario(1000);
		//v.setSalario(500);
		
		
		/*Date data = new Date();
		System.out.println(data);*/
		
		
		
		//System.out.println(pascoa(2022));
		
		//int n1 = 0;
		//int n2 = 5;
		
		//nteger[] testeStrings = new Integer[5];
		/*testeStrings[0] = 1;
		testeStrings[1] = 2;
		testeStrings[2] = 3;
		testeStrings[3] = 4;
		testeStrings[4] = 5;*/
		
		
		/*while(n1 < n2) {
			testeStrings[n1] = testeStrings[n1] + 1;
			System.out.println(testeStrings[n1]);			
			n1 = n1 + 1;			
		}*/
		
		
				
		/*while (numero < final1) {
			System.out.println(testeStrings[numero]);
			if(testeStrings[numero] == "cde")
				break;
			numero = numero + 1;
			
		}*/
		

		
		
		//List<Integer> lista = Arrays.asList(10, 20, 30, 40, 50);
		//System.out.println(lista.get(2));
		
		
		
		//System.out.println(lista.get(4));
		
		//Cliente c = new Cliente();
		//Lugar l = new Lugar();
		
		//Constantes abc = new Constantes();
		
		
		/*Integer numero1 = 1;
		Integer numero2 = 1;
		Integer resultado = 0;
		
		while (resultado <= 100) {
			resultado = numero1 + numero2;
			numero2 = resultado;
			numero1 = resultado - numero1;
			System.out.println(resultado);
		}*/
		
		/*
		 * Para calcular o dia da Páscoa (Domingo), usa-se a fórmula abaixo, onde o ANO deve ser introduzido com 4 dígitos. O Operador MOD é o resto da divisão. A fórmula vale para anos entre 1901 e 2099. A fórmula pode ser estendida para outros anos, alterando X e Y conforme a tabela a seguir:

		Para anos entre 1901 e 2099:
		
		X=24
		Y=5
		
		Os demais valores são os seguintes independente do ano:
		
		A = ANO MOD 19
		B= ANO MOD 4
		C = ANO MOD 7
		D = (19 * a + X) MOD 30
		E = (2 * b + 4 * c + 6 * d + Y) MOD 7
		Se (d + e) > 9 então DIA = (d + e - 9) e MES = Abril
		Senão DIA = (d + e + 22) e MES = Março
		Segue tabela dos valores de X e Y para cada ano:
		 
		Há dois casos particulares que ocorrem duas vezes por século:
		
		Quando o domingo de Páscoa cair em Abril e o dia for 26, corrige-se para uma semana antes, ou seja, vai para dia 19.
		
		Quando o domingo de Páscoa cair em Abril e o dia for 25 e o termo "d" for igual a 28, simultaneamente com "a" maior que 10, então o dia é corrigido para 18.
		
		Neste século estes dois casos particulares só acontecerão em 2049 e 2076.

		 * */
		
		
		
		
		// TODO Auto-generated method stub
		//Integer numero = 0;
		//int final1 = 5;
		
		//String teste = Constantes.PARAMETRO3;
		//System.out.println(teste);		
		
		
		/*
		 * 
		 * CÓDIGO DA PRIMEIRA CONTA
		 * 
		 */
		
		/*Cliente cliente1 = new Cliente();
		cliente1.setId(9);
		cliente1.setNome("Renato");
		
		Conta conta1 = new Conta();		
		conta1.setId(1);
		conta1.setSaldo(500.0);
		conta1.setCliente(cliente1);		
		System.out.println("Conta Corrente: " + conta1.getId() + " Saldo: " + conta1.getSaldo() + " Cliente: " + conta1.getCliente().getNome());
		
		conta1.numerosImpares(2, 50);*/
		
		
		/*String cpf = "11667288709";
		System.out.println(cpf.length());
		
		
		
		System.out.println(cpf.substring(0, 3));
		
		int numero = 5 % 3;
		
		System.out.println(numero);*/
		
		
		
		/*
		 * 
		 * TERMINA AQUI
		 * 
		 */
		
		/*
		 * 
		 * CÓDIGO DA SEGUNDA CONTA
		 * 
		 */
		
		
		//Conta conta2 = new Conta(1, 100.0, 7, "Giovani");
		//System.out.println(conta2.toString());
			
		/*
		 * 
		 * TERMINA AQUI
		 * 
		 */
		
		
		/*int numero1 = 19;
		//int numero2 = 0;
		
		try {
			int resultado = numero1 / 2;
			System.out.println(resultado);
		} catch (Exception e) {
			System.out.println("Houve um erro de lógica no seu código, contate o administrador do sistema e informe o código 97 para ele");
		} finally {
			
		}*/
				
		/*
		
		MeuNome usuario1 = new MeuNome("1166728870", "Renato", 'M', 37);	
		usuario1.setSalario(1000.0);
		
		MeuNome usuario2 = new MeuNome("123456", "Giovani", 'M', 27, 2000.0);
			
		System.out.println(usuario1.toString());
		
		
		String resultado = numero.toString();
		
		*/
		
	//OVERRIDE	
	
		//MeuNome usuario2; 
		
		//System.out.println(usuario2);
		
		//usuario2 = new MeuNome();
		
		//System.out.println(usuario2);
		
			
		/*System.out.println(usuario1.getCpf());
		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getIdade());
		System.out.println(usuario1.getSexo());
		System.out.println(usuario1.getSalario());
		
		System.out.println(usuario2.getCpf());
		System.out.println(usuario2.getNome());
		System.out.println(usuario2.getIdade());
		System.out.println(usuario2.getSexo());
		System.out.println(usuario2.getSalario());*/
		
		
		
		
		/*String[] testeStrings = new String[5];
		testeStrings[0] = "abc";
		testeStrings[1] = "cde";
		testeStrings[2] = "fgh";
		testeStrings[3] = "ijk";
		testeStrings[4] = "lmn";
				
		while (numero < final1) {
			System.out.println(testeStrings[numero]);
			if(testeStrings[numero] == "cde")
				break;
			numero = numero + 1;
			
		}*/
		
		//System.out.println(testeStrings[4]);
		
		
		//System.out.println(numero2.equals(numero));
		
		//.out.println(numero + numero2);
	}
	
	public static String pascoa (Integer ano) {		
		Integer X = 0;
		Integer Y = 0;
		
		Integer mes = 0;
		Integer dia = 0;
		
		if(ano >= 1901 && ano <= 2099) {
			X = 24;
			Y = 5;
		} else if(ano >= 1582 && ano <= 1699) {
			X = 22;
			Y = 2;
		} else if(ano >= 1700 && ano <= 1799) {
			X = 23;
			Y = 3;
		} else if(ano >= 1800 && ano <= 1899) {
			X = 24;
			Y = 4;
		} else if(ano >= 2100 && ano <= 2199) {
			X = 24;
			Y = 6;
		} else if(ano >= 2200 && ano <= 2299) {
			X = 25;
			Y = 7;
		}
		
		Integer A = ano % 19;
		Integer B = ano % 4;
		Integer C = ano % 7;
		Integer D = (19 * A + X) % 30;
		Integer E = (2 * B + 4 * C + 6 * D + Y) % 7;
		
		if((D + E) > 9) {
			dia = D + E - 9;
			mes = 4;
		} else {
			dia = D + E + 22;
			mes = 3;
		}
		
		
		
		if(mes == 4 && dia == 26) {
			dia = dia -7;
		}
		
		if(mes == 4 && dia == 25 && D == 28 && A > 10) {
			dia = dia - 7;
		}
		
		
		return "No ano de: " + ano + " a páscoa caiu em " + dia + " de " + mes;
	}
};
