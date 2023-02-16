public class Conta {
	private double saldo;
	private int agencia;
	private int numeroDaConta;
	private Cliente titular;
	private static int total = 0;
	
	
	public Conta(int agencia, int numero){
		Conta.total++;
		System.out.println("O total de contas é" + Conta.total);
		this.agencia = agencia;
		this.numeroDaConta = numero;
		System.out.println("Estou criando a conta");
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numeroDaConta;
	}
	
	public void setNumero(int numero) {
		if(numero <=0) {
			System.out.println("Não pode valor menor ou igual a 0");
		}
		this.numeroDaConta = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia >= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}