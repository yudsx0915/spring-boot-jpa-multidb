package com.corey.springbootjpamultidb.repo.db2;

import com.corey.springbootjpamultidb.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Db2UserRepo extends JpaRepository<User, Long> {
    
}
