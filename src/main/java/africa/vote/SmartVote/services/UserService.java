package africa.vote.SmartVote.services;

import africa.vote.SmartVote.datas.dtos.requests.OTPVerificationRequest;
import africa.vote.SmartVote.datas.dtos.requests.SendotpRequest;
import africa.vote.SmartVote.datas.models.Users;
import org.apache.catalina.User;

public interface UserService {
    Users saveUser(Users user);
    String createAccount(OTPVerificationRequest otpVerificationRequest);
    String sendOTP(SendotpRequest sendotpRequest);
    String otpTokenGeneration(SendotpRequest sendotpRequest, User user);

}
