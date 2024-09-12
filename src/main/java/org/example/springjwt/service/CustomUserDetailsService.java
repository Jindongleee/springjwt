package org.example.springjwt.service;


import lombok.AllArgsConstructor;
import org.example.springjwt.dto.CustomUserDetails;
import org.example.springjwt.entity.UserEntity;
import org.example.springjwt.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    //데이터베이스 특정 유저 조회
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //조회
        UserEntity userData = userRepository.findByUsername(username);


        //검증
        if(userData!=null){
            return new CustomUserDetails(userData);
        }

        return null;
    }
}
