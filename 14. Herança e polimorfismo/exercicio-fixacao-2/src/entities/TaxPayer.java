package entities;

public abstract class TaxPayer { // herança total
	
	private String name;
	private Double anualIncome;
	
	public TaxPayer() {
	}
	
	public TaxPayer(String nome, Double rendaAnual) {
		this.name = nome;
		this.anualIncome = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract double tax(); // a implementação da regra do imposto só faz sentido nas classes filhas neste caso

}
