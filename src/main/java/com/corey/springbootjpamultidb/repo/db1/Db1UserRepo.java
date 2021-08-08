package com.corey.springbootjpamultidb.repo.db1;

import com.corey.springbootjpamultidb.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Db1UserRepo extends JpaRepository<User, Long> {
    
}
