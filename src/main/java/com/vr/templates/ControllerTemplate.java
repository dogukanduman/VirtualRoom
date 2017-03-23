package com.vr.templates;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class ControllerTemplate<E>{
		

   private E service;
   @Autowired
   public void setService(E service) {
		this.service = service;
	}
	public E getService() {
		return service;
	}	
}
