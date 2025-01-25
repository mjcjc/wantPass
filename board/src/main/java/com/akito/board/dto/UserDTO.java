package com.akito.board.dto;

import com.akito.board.Entity.UserEntity;

import lombok.Data;

@Data
public class UserDTO {
    private Long user_uniqeId;
    private Long user_id;
    private String user_pw;
    private String user_email;
    private String user_PhoneNum;
    private String user_Name;

    public static UserDTO toUserDTO(UserEntity memberEntity) {
        UserDTO memberDTO = new UserDTO();
        memberDTO.setUser_id(memberEntity.getId());
        memberDTO.setUser_pw(memberEntity.getUserPw());
        memberDTO.setUser_email(memberEntity.getUserEmail());
        memberDTO.setUser_PhoneNum(memberEntity.getUserPhone());
        memberDTO.setUser_Name(memberEntity.getUserName());
        return memberDTO;
    }
}
