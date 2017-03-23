package com.vr.services.imp;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.vr.models.Room;
import com.vr.models.User;
import com.vr.models.UserRoom;
import com.vr.services.IRoom;
import com.vr.services.IUserRoom;
import com.vr.services.IUser;


@Service
@Transactional
public class UserRoomServiceImp implements IUserRoom{

	@Autowired
	@Resource(name = "userServiceImp")
	IUser userService;
	
	 
	@Autowired
	@Resource(name = "roomServiceImp")
	IRoom roomService;
	
	@Override
	public void addUserToRoom(UserRoom userRoom) {
		User user=userService.getById(userRoom.getUserId());
		Room room=roomService.getById(userRoom.getRoomId());
		room.getUsers().add(user);
		roomService.save(room);
	} 

	@Override
	public List<Room> listByUserId(Long id) {
		User user=userService.getById(id);
	    List<Room> list = new ArrayList<Room>(user.getRooms());
		return list;
	}

	@Override
	public List<User> listByRoomId(Long id) {
		Room room=roomService.getById(id);
	    List<User> list = new ArrayList<User>(room.getUsers());
		return list;
	}
}
