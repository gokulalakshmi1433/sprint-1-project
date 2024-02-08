package com.tns.certificateservice;

import java.util.List;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Certificate_Service {
	@Autowired
	private Certificate_Service_Repository repo;
	
	public List<Certificate> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Certificate C)
	{
		repo.save(C);
	}
	
	public Certificate get(Integer C_id)
	{
		return repo.findById(C_id).get();
	}
	public void delete(Integer C_id)
	{
		repo.deleteById(C_id);
	}


}
