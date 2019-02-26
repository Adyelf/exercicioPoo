package exercicio;

public class Carros {

	public Boolean novo;
	public String cor;
	public Integer ano;
	public Double preco;

	
	//Getters and Setters
	public Boolean getNovo() {
		return novo;
	}

	public void setNovo(Boolean novo) {
		this.novo = novo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	
	//Metodo ToString com todos os atributos
	@Override
	public String toString() {
		return "[Novo=" + novo + ", Cor=" + cor + ", Ano=" + ano + ", Preco R$ =" + preco + "]";
	}

}