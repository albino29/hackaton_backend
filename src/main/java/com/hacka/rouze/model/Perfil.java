package com.hacka.rouze.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perfil implements Serializable{

	private static final long serialVersionUID = -787686034874321467L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@Enumerated
	private TipoInvestimento tipoInvestimento;
	
	private String cidade;
	
	private String cpf;
	
	private String bairro;
	
	@Enumerated
	private TipoImovel tipoImovel;
	
	private int tempoMudanca;
	
	private float gastoPrevisto;
	
	private float rendaDeclarada;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoInvestimento getTipoInvestimento() {
		return tipoInvestimento;
	}

	public void setTipoInvestimento(TipoInvestimento tipoInvestimento) {
		this.tipoInvestimento = tipoInvestimento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}

	public void setTipoImovel(TipoImovel tipoImovel) {
		this.tipoImovel = tipoImovel;
	}

	public int getTempoMudanca() {
		return tempoMudanca;
	}

	public void setTempoMudanca(int tempoMudanca) {
		this.tempoMudanca = tempoMudanca;
	}

	public float getGastoPrevisto() {
		return gastoPrevisto;
	}

	public void setGastoPrevisto(float gastoPrevisto) {
		this.gastoPrevisto = gastoPrevisto;
	}

	public float getRendaDeclarada() {
		return rendaDeclarada;
	}

	public void setRendaDeclarada(float rendaDeclarada) {
		this.rendaDeclarada = rendaDeclarada;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + Float.floatToIntBits(gastoPrevisto);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + Float.floatToIntBits(rendaDeclarada);
		result = prime * result + tempoMudanca;
		result = prime * result + ((tipoImovel == null) ? 0 : tipoImovel.hashCode());
		result = prime * result + ((tipoInvestimento == null) ? 0 : tipoInvestimento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (Float.floatToIntBits(gastoPrevisto) != Float.floatToIntBits(other.gastoPrevisto))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Float.floatToIntBits(rendaDeclarada) != Float.floatToIntBits(other.rendaDeclarada))
			return false;
		if (tempoMudanca != other.tempoMudanca)
			return false;
		if (tipoImovel != other.tipoImovel)
			return false;
		if (tipoInvestimento != other.tipoInvestimento)
			return false;
		return true;
	}
}
