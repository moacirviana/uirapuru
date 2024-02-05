package br.jus.tream.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;



@Entity
public class Test extends PanacheEntity{

	public String nome;
	public String email;
	  
    

}