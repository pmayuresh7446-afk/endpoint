package com.example.endpoint.endpoints.Service;

import com.example.endpoint.endpoints.Entity.User;
import com.example.endpoint.endpoints.Repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void getUserById_shouldReturnUser(){
        User user = new User();

        user.setId(1l);
        user.setName("Mayu");
        user.setEmail("Mayu@gmail.com");
        user.setSalary(1500000);

        when(userRepository.findById(1l))
                .thenReturn(Optional.of(user));

        //act

        User user1 = userService.getUser(1l);

        //assert

        assertNotNull(user1);
        assertEquals("Mayu",user1.getName());
        assertEquals("Mayu@gmail.com",user1.getEmail());
        assertEquals(1500000,user1.getSalary());

        //verify

        verify(userRepository).findById(1l);
    }
}
