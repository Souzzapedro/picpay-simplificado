package com.picpay.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Table(name = "transacao")
@Entity
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Transacao {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name = "remetente_id")
	private Usuario remetente;
	
	@ManyToOne
	@JoinColumn(name = "receptor_id")
	private Usuario receptor;
	
	@Column(name = "timestamp")
	private LocalDateTime timestamp;
}
