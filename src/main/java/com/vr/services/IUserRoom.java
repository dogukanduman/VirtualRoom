package com.vr.services;



import java.util.List;

import com.vr.models.Room;
import com.vr.models.User;
import com.vr.models.UserRoom;

public interface IUserRoom {
	public List<Room> listByUserId(Long id);
	public List<User> listByRoomId(Long id);
	public void addUserToRoom(UserRoom relationEntity);
}
