package com.mattlangsenkamp.colbertmsmarco.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mattlangsenkamp.colbertmsmarco.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
