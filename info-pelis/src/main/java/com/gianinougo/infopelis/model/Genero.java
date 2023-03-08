package com.gianinougo.infopelis.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Genero {
	
	@Id
	@Column(name = "idgenero")
	private Integer id;
	private String titulo;
}
