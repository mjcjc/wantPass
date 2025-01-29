package com.akito.board.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.akito.board.Entity.UserEntity;
import com.akito.board.dto.UserDTO;
import com.akito.board.repository.registerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class userService {
    private final registerRepository uRepository;

    public void save(UserDTO userDTO){
        UserEntity uEntity = UserEntity.toUpdateUserEntity(userDTO); 
        uRepository.save(uEntity);
    }
    public UserDTO login(UserDTO uDto){
        Optional<UserEntity> byUserId = uRepository.findById(uDto.getUser_id());
        if(byUserId.isPresent()){
            UserEntity uEntity = byUserId.get();
            if(uEntity.getUserPw().equals(uDto.getUser_pw())){
                UserDTO dto = UserDTO.toUserDTO(uEntity);
                return dto;
            }else{
                return null;
            }
        }else{ 
            return null;
        }
    }
    
}
