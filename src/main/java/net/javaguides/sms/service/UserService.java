package net.javaguides.sms.service;


import net.javaguides.sms.dto.UserRegistrationDto;
import net.javaguides.sms.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
