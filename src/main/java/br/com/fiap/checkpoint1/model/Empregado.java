package br.com.fiap.checkpoint1.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empregado")
public class Empregado {
	@Id
	private Long codigoEmpregado;
	private String nome;
	private String endereco;
	
	public Long getCodigoEmpregado() {
		return codigoEmpregado;
	}
	public void setCodigoEmpregado(Long codigoEmpregado) {
		this.codigoEmpregado = codigoEmpregado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
