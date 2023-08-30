
public class Gerente extends Usuario{
		
	public Gerente(int codigo, String nome, int idade, String senha, double salario) {
		setCodigo(codigo);
		setNome(nome);
		setIdade(idade);
		setSenha(senha);
		this.setSalario(salario);
	}
	
	public void aumento(Gerente g) {
		System.out.println(g.getSalario() + 200);
	}
	
	public void setSalario(double salario) {
		super.setSalario(salario + 200.0);
	}
	
}
