package com.hiddu.gym.enterprise.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiddu.gym.enterprise.entities.GymBranch;
import com.hiddu.gym.enterprise.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	List<User> findByGymBranch(GymBranch gymBranch);
}