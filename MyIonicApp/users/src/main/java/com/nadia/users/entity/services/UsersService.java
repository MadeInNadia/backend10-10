package com.nadia.users.entity.services;

import java.util.List;

import com.nadia.users.entity.models.Users;

public interface UsersService {
	public Users get(long id);
	public List<Users> getAll();
	public void post(Users users);
	public void put(Users user, long id);
	public void delete(long id);
}
