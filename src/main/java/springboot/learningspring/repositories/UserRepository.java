package springboot.learningspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.learningspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {}
