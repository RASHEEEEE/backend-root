package com.nivesana.backend_root.dao;

import com.nivesana.backend_root.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {
}
