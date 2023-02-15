package net.codejava.repo;

import net.codejava.models.Order;
import net.codejava.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    @Query(value = "SELECT * FROM orders e where e.userId = ?1",nativeQuery = true)
    List<Order>getUserOrders(Long id);
}
