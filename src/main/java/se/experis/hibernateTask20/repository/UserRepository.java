package se.experis.hibernateTask20.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.experis.hibernateTask20.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findUsersById(int id);
}
