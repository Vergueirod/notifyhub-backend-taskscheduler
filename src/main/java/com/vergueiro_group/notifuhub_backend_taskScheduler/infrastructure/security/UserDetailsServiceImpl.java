package com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.security;


import com.vergueiro_group.notifuhub_backend_taskScheduler.business.dto.UserDTO;
import com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl {

    @Autowired
    private UserClient client;

    public UserDetails carregaDadosUser(String email, String token) {
        UserDTO userDTO = client.searchUserForEmail(email, token);
        return User
                .withUsername(userDTO.getEmail()) // Define o nome de usuário como o e-mail
                .password(userDTO.getPassword()) // Define a senha do usuário
                .build(); // Constrói o objeto UserDetails
    }
}
