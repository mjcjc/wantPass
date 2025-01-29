package com.akito.board.Entity;

import lombok.Getter;
import lombok.Setter;

import com.akito.board.dto.UserDTO;

import jakarta.persistence.*;

@Entity
@Getter
@Setter

@Table(name = "userData")

public class UserEntity {
    @Id // pk 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long user_UniqeId;

    @Column
    private Long id;

    @Column(unique = true) 
    private String userEmail;

    @Column
    private String userPw;

    @Column
    private String userName;

    @Column
    private String userPhone;

    public static UserEntity newUserEntity(UserDTO memberDTO) {
        UserEntity memberEntity = new UserEntity();
        memberEntity.setId(memberDTO.getUser_id());
        memberEntity.setUserPhone(memberDTO.getUser_PhoneNum());
        memberEntity.setUserEmail(memberDTO.getUser_email());
        memberEntity.setUserPw(memberDTO.getUser_pw());
        memberEntity.setUserName(memberDTO.getUser_Name());
        return memberEntity;
    }

    public static UserEntity toUpdateUserEntity(UserDTO memberDTO) {
        UserEntity memberEntity = new UserEntity();
        memberEntity.setUser_UniqeId(memberDTO.getUser_uniqeId());
        memberEntity.setUserPhone(memberDTO.getUser_PhoneNum());
        memberEntity.setId(memberDTO.getUser_id());
        memberEntity.setUserEmail(memberDTO.getUser_email());
        memberEntity.setUserPw(memberDTO.getUser_pw());
        memberEntity.setUserName(memberDTO.getUser_Name());
        return memberEntity;
    }
}
