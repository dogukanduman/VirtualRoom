package com.vr.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

public class UserRoom {
	

	private Long userId;
	private Long roomId;
	
	public UserRoom(){}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public UserRoom(Long userId, Long roomId) {
		super();
		this.userId = userId;
		this.roomId = roomId;
	}
	
	

	
}
