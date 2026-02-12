package com.example.store.services;

import com.example.store.entities.User;
import com.example.store.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final EntityManager entityManager;

    @Transactional
    public void showEntityStates() {
        var user = User.builder()
                .name("John")
                .email("john@example.com")
                .password("john123")
                .build();

        if (entityManager.contains(user)) System.out.println("In Persistance Context");
        else System.out.println("Transient / Detached");

        userRepository.save(user);

        if (entityManager.contains(user)) System.out.println("In Persistance Context");
        else System.out.println("Transient / Detached");
    }


}
