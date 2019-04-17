package entidades;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;

	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	/*construtor gen�rico*/
	public Funcionario() {
	}
	
	public Double aumentoSalarial() {
		return salario += salario * 1.1;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
