package springboot.learningspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.learningspring.entities.OrderItem;
import springboot.learningspring.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {}
