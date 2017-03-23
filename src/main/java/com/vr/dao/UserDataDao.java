package com.vr.dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vr.models.User;
@Transactional
@Repository
public interface UserDataDao extends JpaRepository<User, Serializable> {

}
