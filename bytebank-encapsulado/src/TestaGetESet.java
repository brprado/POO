
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(123123,213123);
		//conta.numero = 12312; nao compila por ser atributo privado. deve-se usar um setter
		conta.setNumero(3210);//usamos o setter para modificar o atributo :)
		
		//System.out.println(conta.numero); nao compila por ser atrib priv. precisa do getter
		System.out.println(conta.getNumero());
		
		Cliente bruno = new Cliente();
		
		//conta.titular = bruno; ERRADO!
		conta.setTitular(bruno);
		
		//bruno.nome = "Bruno"; ERRADO
		bruno.setNome("bruno");
		
		System.out.println(conta.getTitular().getNome());
		
		
		conta.getTitular().setProfissao("programador");

	}

}
