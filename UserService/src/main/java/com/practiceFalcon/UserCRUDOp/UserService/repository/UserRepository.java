package com.practiceFalcon.UserCRUDOp.UserService.repository;
import com.practiceFalcon.UserCRUDOp.UserService.model.Marks;
import com.practiceFalcon.UserCRUDOp.UserService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
