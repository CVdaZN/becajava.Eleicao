package br.eleicao.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity 
//criação de tabela
public class Voto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//gerar alto increment
	private Long id;
	private String Descricao;
	
	@ManyToOne
	@JoinColumn(name = "Candidato.id")
	private Candidato canditato; 
	
	@ManyToOne
	@JoinColumn(name = "Eleitor.id")
	private Eleitor eleitor;
	
	private Voto voto;
	public Candidato candidato() {
		return voto;

	public void setVoto(Voto voto) {
		this.voto = voto;
	}
	public Eleitor getEleitor() {
		return eleitor;
	}
	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	@Id
	@ManyToOne
	@JoinColumn(name = "Eleitor.id")
	private Eleitor eleitor;
	@Id
	@ManyToOne
	@JoinColumn(name = "Candidato.id")
	private Candidato candidato;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
}
