package com.test.bootsecurity.service;

import com.test.bootsecurity.dto.CustomUserDetails;
import com.test.bootsecurity.entity.Member;
import com.test.bootsecurity.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final MemberRepository memberRepository;
    private static final Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);


    //사용자 로그인 > username, password > loadUserByUsername 호출
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //select * from member where username = ?
        Member member = memberRepository.findByUsername(username);

        if (member != null) {
            logger.info("데이터베이스에서 조회된 사용자 정보: {}", member);
            return new CustomUserDetails(member); //로그인 성공
        }
        logger.info("사용자 정보가 존재하지 않습니다.");
        return null; //로그인 실패
    }
}







