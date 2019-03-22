package br.com.etechoracio.sihas.biblioteca.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_AUTOR")
public class Autor {
	@Id
	@GeneratedValue
	
	@Column(name="ID_AUTOR")
	private Long id;
	
	@Column(name="TX_NOME")
	private String nome;
	
	@Column(name="DT_INICIO_VIGENCIA")
	private Date dataInicio;
	
	@Column(name="DT_FIM_VIGENCIA")
	private Date dataFim;
	
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
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
}
