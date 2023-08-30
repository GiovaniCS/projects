
public class Conta{
	Integer id;
	Double saldo;
	Cliente cliente;
	
	public Conta () {
		
	}
	
	public Conta (Integer id, Double saldo, Integer idCliente, String nomeCliente) {
		this.id = id;
		this.saldo = saldo;
		Cliente clienteConstrutor = new Cliente();
		//clienteConstrutor.setId(idCliente);
		clienteConstrutor.setNome(nomeCliente);
		this.cliente = clienteConstrutor;
	}
	
	public String numerosImpares(int numero1, int numero2) {		
		while (numero1 <= numero2) {
			int resultado = 0;
			resultado = numero1 % 2;	
			if(resultado > 0) {
				System.out.println(numero1);
			} 
			numero1 = numero1 + 1;
		}
		return "";
	}

	public Boolean validaCpf(String cpf) {		
		return true;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String toString() {
		return ("Conta Corrente: " + this.getId() + " Saldo: " + this.getSaldo() + " Cliente: " + this.getCliente().getNome());
	}
}
