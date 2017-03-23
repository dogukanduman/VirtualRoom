package com.vr.controllers.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vr.models.Room;
import com.vr.services.IRoom;
import com.vr.templates.ControllerTemplate;



@RestController
@RequestMapping("/room")
public class RoomControllerImp extends ControllerTemplate<IRoom> implements IRoom{

	@Override
	@RequestMapping(value ="/add",method=RequestMethod.POST,consumes="application/json",produces="application/json")	
	public @ResponseBody Room add(@RequestBody Room entity) {
		return 	getService().add(entity);
	}

	@Override
	@RequestMapping(value ="/deleteById/{id}",method=RequestMethod.DELETE)
	public void deleteById(@PathVariable Long id) {
	  getService().deleteById(id);
		
	}

	@Override
	@RequestMapping(value ="/getById/{id}", method=RequestMethod.GET,produces="application/json")
	public @ResponseBody Room getById(@PathVariable Long id) {
		return getService().getById(id);

	}

	@Override
	@RequestMapping(value ="/list",method=RequestMethod.GET,produces="application/json")
	public  @ResponseBody List<Room> list() {
		return getService().list();
	}

	@Override
	public void save(Room entity) {
		// TODO Auto-generated method stub
		
	}




			
}












