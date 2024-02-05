package br.jus.tream.controller;

import java.util.List;

import br.jus.tream.domain.Test;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/test")
public class TestController {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Test> findAll(){
		return Test.listAll();
	}

}
