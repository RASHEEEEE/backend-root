package com.nivesana.backend_root.dao;

import com.nivesana.backend_root.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}