package entidades;

public class Produto {
	private String nome;
	private double preco;
	private int qtdEstoque;
	
	/**
	 * Esse seria um construtor  padrão em que eu manteria 
	 * e sua chamada no programa  faria ter acesso a todos os objetos
	 * */
	public Produto() {
	}
	
	/**Isso é um construtor
	 * */
	public Produto(String nome, double preco, int qtdEstoque) {//Esse é o Construtor que executa no momento da instanciação do objeto */
		this.nome = nome;//this significa uma referência para o próprio objeto
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	/**
	 * //por padrão o valor de objetos e arrays é zero,
	 *  ou seja, essa declaração é opcional, nesse caso 
	 *  de SOBRECARGA vc disponibiliza mais de uma versão da mesma operação e sua
	 *  diferença será a lista de parâmetros.A palavra this é opcional
	 * */
	public Produto(String nome, double preco) {//Esse é o Construtor que executa no momento da instanciação do objeto */
		this.nome = nome;//this significa uma referência para o próprio objeto
		this.preco = preco;
	}
	
	
	
	/*
	 *nesse caso dó se cria o método get, para proteger
	 *a quantidade de produto, que só pode ser atualizada mediante 
	 *retirada ou entrada de novos produtos
	 * **/
	public int getQtdEstoque () {
		return qtdEstoque;
	}
	
	
	/**
	 * Isso é uma função se eu desejar que ela 
	 * não tenha retorno coloco void
	 * */
	public double valorTotalEmEstoque() {
		return preco * qtdEstoque;
		
	}
	
	public void adicionaProduto(int qtdEstoque) {
		this.qtdEstoque += qtdEstoque;
	}
	
	public void removerProduto(int qtdEstoque) {
		this.qtdEstoque -= qtdEstoque;
	}
	
	public String toString() {
		return nome
		+ ", $ "
		+ String.format("%.2f", preco)
		+ ", "
		+ qtdEstoque
		+ " units, Total: $ "
		+ String.format("%.2f", valorTotalEmEstoque());
		
	}
}
