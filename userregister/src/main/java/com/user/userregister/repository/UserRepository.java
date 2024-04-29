package com.user.userregister.repository;

import com.user.userregister.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
     public User findById(int userId);
}
