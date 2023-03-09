package africa.vote.SmartVote.services.impl;

import africa.vote.SmartVote.datas.dtos.requests.RegistrationRequest;
import africa.vote.SmartVote.datas.dtos.requests.ResendTokenRequest;
import africa.vote.SmartVote.datas.enums.Category;
import africa.vote.SmartVote.datas.enums.Status;
import africa.vote.SmartVote.datas.models.AppUser;
import africa.vote.SmartVote.services.RegistrationService;
import africa.vote.SmartVote.services.UserService;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class RegistrationServiceImplTest {
    @Mock
    private UserService userService;
    @Mock
    private PasswordEncoder passwordEncoder;
    @InjectMocks
    private RegistrationService registrationService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testThatUserRegistrationIsSuccessful() {
       RegistrationRequest registrationRequest = new RegistrationRequest("James", "Aduloju", "adulojujames@gmail.com", "123456789", "pass1234", "COHORT_I", "imageURL");
        AppUser appUser = new AppUser();
        appUser.setFirstName("James");
        appUser.setLastName("Aduloju");
        appUser.setPassword("encoded1234");
        appUser.setCategory(Category.COHORT_I);
        appUser.setStatus(Status.UNVERIFIED);
        appUser.setImageURL("imageURL");
        appUser.setEmail("adulojujames@gmail.com");
        appUser.setPhoneNumber("123456789");
        ResendTokenRequest resendTokenRequest = new ResendTokenRequest("adulojujames@gmail.com");
        when(userService.findByEmailIgnoreCase("adulojujames@gmail.com")).thenReturn(Optional.empty());
    }
}