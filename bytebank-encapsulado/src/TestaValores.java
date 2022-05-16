
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(333,213);
		System.out.println(conta.getAgencia());
		
		@SuppressWarnings("unused")
		Conta conta2 = new Conta(23,213);
		
		//output: o total de contas é 1
		//output: o total de contas é 1
		
		System.out.println(Conta.getTotal());
		//output: 2
	}

}
