package africa.vote.SmartVote.datas.dtos.requests;

import lombok.Data;


@Data
public class OTPVerificationRequest {
    private String token;
    private String email;
}
