package com.vr.services.imp;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.vr.dao.UserDataDao;
import com.vr.models.User;
import com.vr.services.IUser;
import com.vr.templates.ServiceTemplate;




@Service
@Transactional
@Qualifier("service")
public class UserServiceImp extends ServiceTemplate<UserDataDao,User> implements IUser {
	

	@Override
	public User add(User user) {
	
		return  getBaseDao().save(user);
	}
	@Override
	public void deleteById(Long id) {
		User user=getBaseDao().findOne(id);
		 getBaseDao().delete(user);
	}
	@Override
	public User getById(Long id) {
		return  getBaseDao().findOne(id);
	}
	@Override
	public List<User> list() {
		Iterable<User> iterable= getBaseDao().findAll();
		List<User> userList=iterableToList(iterable);	
		return userList;
	}
	@Override
	public void save(User entity) {
		getBaseDao().save(entity);
	}
	
}
