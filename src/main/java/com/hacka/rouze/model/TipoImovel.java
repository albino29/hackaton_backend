package com.hacka.rouze.model;

public enum TipoImovel {

	APTO_PADRAO("Apartamento padrão"),
    STUDIO("Studio"),
    CASA("Casa");
	
    private String descricao;
    
    private TipoImovel(String descricao) {
        this.descricao = descricao;
    }

}
