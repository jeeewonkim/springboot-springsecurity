package Snacks.jsoupWebCrawling.User.Service;

import Snacks.jsoupWebCrawling.User.Dto.FindUserIdDto;
import Snacks.jsoupWebCrawling.User.Dto.MailDto;
import Snacks.jsoupWebCrawling.User.Dto.MailUserDto;
import Snacks.jsoupWebCrawling.User.Dto.UserSignUpDto;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional //로직을 처리하다가 에러가 발생하면, 변경된 데이터를 로직을 수행하기 이전 상태로 콜백
@Service
public interface UserService {
    void signUp(UserSignUpDto userSignUpDto) throws Exception;
   // void checkDuplicated(String userId) throws Exception;
   void checkDuplicated(UserSignUpDto userSignUpDto) throws Exception;

    MailDto createMailAndChangePassword(MailUserDto mailUserDto) throws Exception;

    void mailSend(MailDto mailDto);

    String findUserId(FindUserIdDto findUserIdDto) throws Exception;


    }