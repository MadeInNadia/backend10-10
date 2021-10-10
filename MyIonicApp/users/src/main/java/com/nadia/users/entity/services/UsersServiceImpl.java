package com.nadia.users.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nadia.users.entity.dao.UsersDao;
import com.nadia.users.entity.models.Users;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDao usersDao;
	
	@Override
	public Users get(long id) {
		return usersDao.findById(id).get();
	}

	@Override
	public List<Users> getAll() {
		return (List<Users>) usersDao.findAll();
	}

	@Override
	public void post(Users users) {
		usersDao.save(users);
	}

	@Override
	public void put(Users users, long id) {
		usersDao.findById(id).ifPresent((x)->{
			users.setId(id);
			usersDao.save(users);
		});
	}

	@Override
	public void delete(long id) {
		usersDao.deleteById(id);
		
	}

}
