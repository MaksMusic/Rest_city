package com.maksud.spring_boot.project.city.service;

import com.maksud.spring_boot.project.city.model.Citizen;
import com.maksud.spring_boot.project.city.repozitory.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;



    @Override
    public List<Citizen> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public Citizen createUser(Citizen citysen) {
        return userRepository.save(citysen);
    }
}
