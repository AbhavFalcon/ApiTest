package com.practiceFalcon.UserCRUDOp.UserService.repository;
import com.practiceFalcon.UserCRUDOp.UserService.model.Marks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarksRepository extends JpaRepository<Marks,Integer> {
}
