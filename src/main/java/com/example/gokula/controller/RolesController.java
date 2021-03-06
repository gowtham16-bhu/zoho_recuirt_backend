package com.example.gokula.controller;

import com.example.gokula.Repo.RoleRepository;
import com.example.gokula.models.ERole;
import com.example.gokula.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service

public class RolesController {
    @Autowired
    RoleRepository roleRepository;
    public Role saveuser(Role role){
        return (roleRepository.findByName(ERole.ROLE_USER)).isPresent()?role:roleRepository.save(role);




    }
    public Role savemod(Role role){
        return (roleRepository.findByName(ERole.ROLE_MODERATOR)).isPresent()?role:roleRepository.save(role);




    }
    public Role saveadmin(Role role){
        return (roleRepository.findByName(ERole.ROLE_ADMIN)).isPresent()?role:roleRepository.save(role);




    }
    
    
//    @Autowired
//    RoleRepository roleRepository;
//    public Void save(Role role){
//       Optional<Role> roles=roleRepository.findById(role.getId());
//       if(roles.isPresent()){
//           roleRepository.save(role);
//
//       }
//
//
//        return null;
//    }

}
