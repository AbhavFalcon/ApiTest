package com.practiceFalcon.UserCRUDOp.UserService.AppService;

import com.practiceFalcon.UserCRUDOp.UserService.dto.UserDto;
import com.practiceFalcon.UserCRUDOp.UserService.model.Marks;
import com.practiceFalcon.UserCRUDOp.UserService.model.User;
import com.practiceFalcon.UserCRUDOp.UserService.repository.MarksRepository;
import com.practiceFalcon.UserCRUDOp.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MarksRepository marksRepository;

    public User crearUser(UserDto userDto) {
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setUserEmail(userDto.getUserEmail());

        User savedUser = userRepository.save(user);

        Marks marks = new Marks();
        marks.setId(savedUser.getUserId());

        marks.setSubject1(0);
        marks.setSubject2(0);
        marks.setSubject3(0);
        marks.setSubject4(0);

        marksRepository.save(marks);

        return savedUser;
    }


    public User updateUser(UserDto userDto, int userId){
        User user = userRepository.findById(userId).orElse(null);
        user.setUserName(userDto.getUserName());
        user.setUserEmail(userDto.getUserEmail());
        return userRepository.save(user);
    }

    public void deleteUser(int userId){
        User user = userRepository.findById(userId).orElse(null);
        userRepository.deleteById(userId);
//        marksRepository.deleteById(userId);
    }


}
