package entidades;

public class Produto {
	private String nome;
	private double preco;
	private int qtdEstoque;
	
	/**
	 * Esse seria um construtor  padr�o em que eu manteria 
	 * e sua chamada no programa  faria ter acesso a todos os objetos
	 * */
	public Produto() {
	}
	
	/**Isso � um construtor
	 * */
	public Produto(String nome, double preco, int qtdEstoque) {//Esse � o Construtor que executa no momento da instancia��o do objeto */
		this.nome = nome;//this significa uma refer�ncia para o pr�prio objeto
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
	 * //por padr�o o valor de objetos e arrays � zero,
	 *  ou seja, essa declara��o � opcional, nesse caso 
	 *  de SOBRECARGA vc disponibiliza mais de uma vers�o da mesma opera��o e sua
	 *  diferen�a ser� a lista de par�metros.A palavra this � opcional
	 * */
	public Produto(String nome, double preco) {//Esse � o Construtor que executa no momento da instancia��o do objeto */
		this.nome = nome;//this significa uma refer�ncia para o pr�prio objeto
		this.preco = preco;
	}
	
	
	
	/*
	 *nesse caso d� se cria o m�todo get, para proteger
	 *a quantidade de produto, que s� pode ser atualizada mediante 
	 *retirada ou entrada de novos produtos
	 * **/
	public int getQtdEstoque () {
		return qtdEstoque;
	}
	
	
	/**
	 * Isso � uma fun��o se eu desejar que ela 
	 * n�o tenha retorno coloco void
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
