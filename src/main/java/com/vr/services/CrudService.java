package com.vr.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;



public interface CrudService<E> {
	
	public E add(E entity);
	public void deleteById(Long id);
	public E getById( Long id);
	public List<E> list();
	public void save(E entity);
}
