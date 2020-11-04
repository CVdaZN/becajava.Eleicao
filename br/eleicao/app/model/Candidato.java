package br.eleicao.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Candidato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String nome;
	private String Numero;
	private String tipo;
	@ManyToOne
	@JoinColumn(name = "Municipio.id")
	private Municipio municipio;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getnome() {
		return nome;
	}

	public void setnome(String numero) {
		this.nome = numero;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}

	public municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(municipio municipio) {
		this.municipio = municipio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
