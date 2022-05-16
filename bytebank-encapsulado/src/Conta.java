import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;

	// contrutor padrao
	public Conta(int agencia, int numero) {
		total++;
		System.out.println("O total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return numero;

	}

	public void setNumero(int novoNumero) {
		if (numero >= 0) {
			System.out.println("valor inválido");
			return;
		}
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Numero da agencia inválido");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total; // ou return total
	}

	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Foram depositados R$" + valor + " em sua conta.");
	}

	public boolean saca(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Foram sacados R$" + valor + " em sua conta.");
			return true; 
		}
		System.out.println("Saldo insuficiente");
		return false;

	}

	public boolean transfere(double valor, Conta destino) {
		if (saca(valor)) {
			saldo -= valor;
			destino.deposita(valor);
			System.out.println("Uma transferencia de R$" + valor + " feita para conta do(a) " + destino.titular);
			return true;

		}
		System.out.println("Voce nao tem saldo sufuciente para fazer esta transferência");
		return false;

	}
}
