package com.hackathon.avengers.controller;

import java.util.Optional;

import com.hackathon.avengers.ProducerApplication;
import com.hackathon.avengers.entity.User;
import com.hackathon.avengers.repository.UserRepository;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProducerApplication.class)
public abstract class UserControllerBase {

  @Autowired
  private UserController userController;

  @MockBean
  private UserRepository userRepository;

  @Before
  public void setup() {
    User savedUser = new User();
    savedUser.setFirstName("Arthur");
    savedUser.setLastName("Dent");
    savedUser.setId(42L);
    when(userRepository.save(any(User.class))).thenReturn(savedUser);

    RestAssuredMockMvc.standaloneSetup(userController);

    when(userRepository.findById(42L)).thenReturn(Optional.of(savedUser));
  }

}