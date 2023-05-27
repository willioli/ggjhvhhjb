package com.generation.plantanamesa.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// @NotBlank(message = "O campo é Obrigatório!")
	@Size(min = 1, max = 50, message = "O atributo Titulo deve conter no mínimo 05 e no máximo 50 caracteres")
	private String nome;

	private Date validade;

	// @NotBlank(message = "O atributo Descriçao é Obrigatório!")
	@Size(min = 1, max = 2000, message = "O atributo descrição deve conter no mínimo 10 e no máximo 1000 caracteres")
	private String descricao;

	// @NotBlank(message = "O campo é Obrigatório!")
	private int quantidade;

	@Size(max = 5000, message = "O link da foto não pode ser maior do que 5000 caracteres")
	private String foto;

	// @NotBlank(message = "O campo é Obrigatório!")
	private BigDecimal valor;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categorias categorias;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;
	
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

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

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Categorias getCategorias() {
		return categorias;
	}

	public void setCategorias(Categorias categorias) {
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

}
