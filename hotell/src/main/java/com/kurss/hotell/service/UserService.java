package com.kurss.hotell.service;


import com.kurss.hotell.models.UserDto;
import com.kurss.hotell.models.UserEntity;
import com.kurss.hotell.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserDetailsService, UserManager {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<UserEntity> userOptional = userRepository.findById(username);

        if (userOptional.isEmpty()) {
            throw new UsernameNotFoundException("User not found in DataBase");
        }

        UserEntity userEntity = userOptional.get();
        UserDetails userDetails = User.builder()
                .username(userEntity.getName())
                .password(userEntity.getPassword())
                .roles(userEntity.getRole())
                .build();
        return userDetails;
    }

    @Override
    public UserEntity createUser(UserDto userDto) {
        UserEntity user = new UserEntity(
                userDto.getPhone(),
                userDto.getName(),
                userDto.getMail(),
                passwordEncoder.encode(userDto.getPassword()),
                "USER"
        );
        userRepository.save(user);
        return user;
    }

    @Override
    public boolean userExists(String username) {
        return userRepository.findById(username).isPresent();
    }
}
