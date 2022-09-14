package com.example.backenddemo.repostory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backenddemo.model.User;

@Repository //yazmasak ta ayağa kalkar.
public interface UserRepository extends JpaRepository<User, Long> {


}
