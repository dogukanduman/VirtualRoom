package com.vr.templates;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public abstract class  ServiceTemplate <E,T> {
	

    private E baseDao;
	
	
	public E getBaseDao() {
		return baseDao;
	}
	
	@Autowired
	public void setBaseDao( E baseDao) {
		this.baseDao = baseDao;
	}

	public List<T> iterableToList(Iterable<T> iterable)
	{
		Iterator<T> it=iterable.iterator();
		List<T> entityList = new ArrayList<T>();
		while(it.hasNext())
		{  
		entityList.add(it.next());

		}		
		return entityList;
	}

  

	
}
