package com.hacka.rouze.model;

public enum TipoInvestimento {
	
	ALUGAR("Alugar"),
	COMPRAR("Comprar");
	
	public String tipoInvestimento;
	
	private TipoInvestimento(String tipoInvestimento) {
		this.tipoInvestimento = tipoInvestimento;
	}

}
