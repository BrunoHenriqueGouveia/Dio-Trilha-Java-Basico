package BancoDigital;

public class Conta implements IConta {
	
	private static final String agenciaAtual = "2096";
	private static int ctd=0;
	
	private String agencia;
	private int conta;
	private double saldo=0;
	
	public Conta() {
		this.agencia = agenciaAtual;
		this.conta  = ctd++;
	}

	public String getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	@Override
	public void depositar(double valor) {
		this.saldo = saldo+valor;
	}

	@Override
	public void sacar(double valor) {
		this.saldo = saldo-valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println(String.format("Agencia: %s", agencia));
		System.out.println(String.format("Conta: %d", conta));
		System.out.println(String.format("Saldo: %.2f", saldo));
		
	}

	public double getSaldo() {
		return saldo;
	}

	
	
	
	
	

}
