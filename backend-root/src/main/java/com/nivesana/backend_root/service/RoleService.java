package com.nivesana.backend_root.service;

import com.nivesana.backend_root.dao.RoleDao;
import com.nivesana.backend_root.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;
    public Role createNewRole(Role role){
        return roleDao.save(role);

    }
}
