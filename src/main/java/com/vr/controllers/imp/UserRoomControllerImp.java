package com.vr.controllers.imp;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vr.models.Room;
import com.vr.models.User;
import com.vr.models.UserRoom;
import com.vr.services.IUserRoom;
import com.vr.services.imp.UserRoomServiceImp;
import com.vr.templates.ControllerTemplate;


@RestController
@RequestMapping("/userroom")
public class UserRoomControllerImp  extends ControllerTemplate<UserRoomServiceImp> implements IUserRoom{

	

	@Override
	@RequestMapping(value ="/addUser",method=RequestMethod.POST,consumes="application/json")	
	public void addUserToRoom(@RequestBody UserRoom userRoom) {
		getService().addUserToRoom(userRoom);
		
	}


	@Override
	@RequestMapping(value ="/listByUserId/{id}",method=RequestMethod.GET,produces="application/json")	
	public List<Room> listByUserId(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return getService().listByUserId(id);
	}

	@Override
	@RequestMapping(value ="/listByRoomId/{id}",method=RequestMethod.GET,produces="application/json")	
	public List<User> listByRoomId(@PathVariable Long id) {
		// TODO Auto-generated method stub
		return getService().listByRoomId(id);
	}
}


