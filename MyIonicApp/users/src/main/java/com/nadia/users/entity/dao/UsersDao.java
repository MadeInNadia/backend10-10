package com.nadia.users.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.nadia.users.entity.models.Users;

public interface UsersDao extends CrudRepository<Users, Long>{

}
