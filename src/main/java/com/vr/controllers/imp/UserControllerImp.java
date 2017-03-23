package com.vr.controllers.imp;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.vr.models.User;
import com.vr.services.IUser;
import com.vr.templates.ControllerTemplate;


@RestController
@RequestMapping("/user")
public class UserControllerImp   extends ControllerTemplate<IUser> implements IUser{

	@Override
	@RequestMapping(value ="/add",method=RequestMethod.POST,consumes="application/json",produces="application/json")	
	public @ResponseBody User add(@RequestBody User entity) {
		return getService().add(entity);
	}

	@Override
	@RequestMapping(value ="/deleteById/{id}",method=RequestMethod.DELETE)
	public void deleteById(@PathVariable Long id) {
		getService().deleteById(id);
		
	}

	@Override
	@RequestMapping(value ="/getById/{id}", method=RequestMethod.GET,produces="application/json")
	public @ResponseBody User getById(@PathVariable Long id) {
		return 	getService().getById(id);
	}

	@Override
	@RequestMapping(value ="/list",method=RequestMethod.GET,produces="application/json")
	public @ResponseBody List<User> list() {
		return 	getService().list();
	}

	@Override
	public void save(User entity) {
		// TODO Auto-generated method stub
		
	}


}
