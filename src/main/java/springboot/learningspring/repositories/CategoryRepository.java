package springboot.learningspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.learningspring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
