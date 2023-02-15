package net.codejava.repo;

import net.codejava.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
//    User findByUsername(String username);
    @Query("select u from users u where u.username = ?1 AND u.password = ?2")
    User getUserByUsernameAndPassword(String username,String password);

}
