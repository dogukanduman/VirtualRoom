package com.vr.dao;


import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.vr.models.Room;
@Transactional
@Repository
public interface RoomDataDao extends JpaRepository<Room, Serializable>
{

}
