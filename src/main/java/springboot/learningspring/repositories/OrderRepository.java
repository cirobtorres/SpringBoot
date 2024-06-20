package springboot.learningspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.learningspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
