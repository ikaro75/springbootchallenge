package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="RULES")
public class Rule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
	private String Rulename;

}
