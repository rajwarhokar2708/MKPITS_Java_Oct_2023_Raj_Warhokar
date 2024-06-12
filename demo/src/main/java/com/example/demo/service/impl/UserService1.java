package com.example.demo.service.impl;

import com.example.demo.dto.request.UserRequestDto;
import com.example.demo.dto.response.UserResponseDto;
import com.example.demo.mysql.model.User;
import com.example.demo.mysql.model.UserCredential;
import com.example.demo.repository.UserCredentailsRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.IUserService;
import com.google.common.hash.Hashing;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService1 implements IUserService {

    @Autowired
    UserCredentailsRepository userCredentailsRepository;

    @Autowired
    UserRepository userRepository;



    @Override
    public List<UserRequestDto> getAllUsers() {
        List<User> userModelsList=(List<User>) userRepository.findAll();
        List<UserRequestDto> dtoArrayList=new ArrayList<>();
        for (User user :userModelsList){
            UserRequestDto managementDto=convertUserModelToUserDto(user);
            dtoArrayList.add(managementDto);
        }
        return dtoArrayList;
    }

    @Override
    public UserRequestDto getUserById(Integer id) {
        Optional<User> userModel = userRepository.findById(id);
        UserRequestDto userDto = new UserRequestDto();
        if (userModel.isPresent()) {
            userDto = convertUserModelToUserDto(userModel.get());
        }
        return userDto;
    }



    private UserRequestDto convertUserModelToUserDto(User user){
        UserRequestDto userDto = new UserRequestDto();

//        userDto.setId(user.getId());
//        userDto.setFirstName(user.getFirstName());
//        userDto.setLastName(user.getLastName());
//        userDto.setMobile(user.getMobile());
//        userDto.setEmail(user.getEmail());
//        return userDto;

        userDto= UserRequestDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .mobile(user.getMobile())
                .email(user.getEmail())
                .dateOfBirth(user.getDate_Of_Birth())
                .build();

        return userDto;

    }



    @Override
    @Transactional
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user =new User();

        // Below code saves data in users table
        user =convertUserDtoToModel(userRequestDto, user);
        user.setCreatedBy(1);
        user.setCreatedAt(LocalDateTime.now());
        user =userRepository.save(user);

        // Below code saves data in user_credentials table
        UserCredential userCredential=new UserCredential();
        String uuid= UUID.randomUUID().toString();
        System.out.println("UUID: " + uuid);
        final String computedPassword = Hashing.sha256()
                .hashString(userRequestDto.getPassword(), StandardCharsets.UTF_8).toString() + uuid;

        userCredential.setUserId(user.getId());
        userCredential.setUsername(userRequestDto.getUsername());
        userCredential.setPassword(computedPassword);
        userCredential.setPasswordSalt(uuid);
        userCredential.setCreatedBy(1);
        userCredential.setCreatedAt(LocalDateTime.now());
        userCredential.setUpdatedBy(1);
        userCredential.setUpdatedAt(LocalDateTime.now());
        userCredentailsRepository.save(userCredential);

        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setId(user.getId());
        userResponseDto.setFirstName(user.getFirstName());
        return userResponseDto;
    }

    private User convertUserDtoToModel(UserRequestDto userRequestDto, User user) {
//        user.setFirstName(userRequestDto.getFirstName());
//        user.setLastName(userRequestDto.getLastName());
//        user.setMobile(userRequestDto.getMobile());
//        user.setEmail(userRequestDto.getEmail());
//        user.setUpdatedBy(1);
//        user.setUpdatedAt(LocalDateTime.now());

        user = User.builder()
                .firstName(userRequestDto.getFirstName())
                .lastName(userRequestDto.getLastName())
                .mobile(userRequestDto.getMobile())
                .email(userRequestDto.getEmail())
                .date_Of_Birth(userRequestDto.getDateOfBirth())
                .updatedAt(LocalDateTime.now())
                .updatedBy(1)
                .build();
        return user;
    }

    public UserRequestDto updateUser(UserRequestDto managementDto){
        Optional<User> userModelOptional = userRepository.findById(managementDto.getId());
        if(userModelOptional.isEmpty()){
            System.out.println("User data with id: " + managementDto.getId() + " not found");
        }else {
            User user =convertUserDtoToModel(managementDto,userModelOptional.get());
            user.setId(managementDto.getId());
            user = userRepository.save(user);
            return convertUserModelToUserDto(user);
        }
        return managementDto;
    }

    @Override
    public UserRequestDto updatePartialUser(UserRequestDto userRequestDto) {
    Optional<User> userModelOptional = userRepository.findById(userRequestDto.getId());
    if (userModelOptional.isEmpty()){
        System.out.println("User data with id: " + userRequestDto.getId() + " not found");
    }else {
        User user=userModelOptional.get();
        user.setFirstName(userRequestDto.getFirstName() != null && !userRequestDto.getFirstName().equals(user.getFirstName()) ? userRequestDto.getFirstName() : user.getFirstName());
        user.setLastName(userRequestDto.getLastName() != null && !userRequestDto.getLastName().equals(user.getLastName()) ? userRequestDto.getLastName() : user.getLastName());
        user.setEmail(userRequestDto.getEmail() != null && !userRequestDto.getEmail().equals(user.getEmail()) ? userRequestDto.getEmail() : user.getEmail());
        user.setMobile(userRequestDto.getMobile() != null && !userRequestDto.getMobile().equals(user.getMobile()) ? userRequestDto.getMobile() : user.getMobile());
        user.setUpdatedBy(2);
        user.setUpdatedAt(LocalDateTime.now());
        userRepository.save(user);
        return convertUserModelToUserDto(user);

    }
        return userRequestDto;
    }

    @Override
    public UserRequestDto deleteUser(Integer id) {
        Optional<User> userOptional=userRepository.findById(id);
        if(userOptional.isEmpty()){
            System.out.println("User data with id : "+id+" not found");
            return null;
        }else{
            userRepository.deleteById(id);
            System.out.println("User data with id "+id+" deleted successfully");
            return convertUserModelToUserDto(userOptional.get());
        }
    }


}
