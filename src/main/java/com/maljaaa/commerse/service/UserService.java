package com.maljaaa.commerse.service;

import com.maljaaa.commerse.model.User;
import com.maljaaa.commerse.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.maljaaa.commerse.utils.Message.*;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    /**
     * 회원 가입
     */
    @Transactional
    public User signUp(User user) {
        validateDuplicateUser(user);
        userRepository.save(user);

        return user;
    }

    private void validateDuplicateUser(User user) {
        List<User> findUsers = userRepository.findByEmail(user.getEmail());

        if(!findUsers.isEmpty()) {
            throw new IllegalStateException(DUPLICATE_EMAIL.getMessage());
        }
    }
}
