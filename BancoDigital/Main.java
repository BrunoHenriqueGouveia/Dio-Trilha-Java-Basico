package BancoDigital;

public class Main {
	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.imprimirExtrato();
		cc.depositar(1000);
		cc.imprimirExtrato();
		
		cp.imprimirExtrato();
		cp.depositar(1000);
		cp.imprimirExtrato();
		
	}

}
