package com.tns.certificateservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class Certificate_service_Controller {
	@Autowired(required=true)
	private Certificate_Service service;
	
	@GetMapping("/Certificateservice")
	public java.util.List<Certificate> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/Certificateservice/{C_id}")
	public ResponseEntity<Certificate> get(@PathVariable Integer C_id)
	{
		try
		{
			Certificate C=service.get(C_id);
			return new ResponseEntity<Certificate>(C,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/Certificateservice")
	public void add(@RequestBody Certificate C)
	{
		service.save(C);
	}
	
	@PutMapping("/Certificateservice/{C_id}")
	public ResponseEntity<?> update(@RequestBody Certificate C, @PathVariable Integer C_id)
	{
		Certificate existC=service.get(C_id);
		service.save(existC);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/Certificateservice/{C_id}")
	public void delete(@PathVariable Integer C_id)
	{
		service.delete(C_id);
	}
}
