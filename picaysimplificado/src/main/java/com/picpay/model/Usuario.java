package com.picpay.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Table(name = "usuario")
@Entity
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Usuario {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String primeiroNome;
	
	@Column(name = "nome")
	private String segundoNome;
	
	@Column(name = "cpf", unique = true)
	private String cpf;
	
	@Column(name = "email", unique = true)
	private String email;
		
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "saldo")
	private BigDecimal saldo;
	
	@Enumerated(EnumType.STRING)
	private TipoUsuario tipo;
	
}
