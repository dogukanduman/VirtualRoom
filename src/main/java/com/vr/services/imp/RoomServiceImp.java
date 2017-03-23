package com.vr.services.imp;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vr.dao.RoomDataDao;
import com.vr.models.Room;
import com.vr.services.IRoom;
import com.vr.templates.ServiceTemplate;

@Service
@Transactional
public class RoomServiceImp  extends ServiceTemplate<RoomDataDao,Room> implements IRoom{

	@Override
	public Room add(Room entity) {
		
		 return getBaseDao().save(entity);
	}

	@Override
	public void deleteById(Long id) {
		Room room=getBaseDao().findOne(id);
		getBaseDao().delete(room);
		
	}

	@Override 
	public Room getById(Long id) {

		return getBaseDao().findOne(id);
	}

	@Override
	public List<Room> list() {
		Iterable<Room> iterable=getBaseDao().findAll();
		List<Room> roomList = iterableToList(iterable);	
		return roomList;
	}

	@Override
	public void save(Room entity) {
		getBaseDao().save(entity);
		
	}


}