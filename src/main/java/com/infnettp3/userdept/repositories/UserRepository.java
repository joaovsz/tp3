package com.infnettp3.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infnettp3.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{ // Long é o tipo do ID do usuário
    
}
