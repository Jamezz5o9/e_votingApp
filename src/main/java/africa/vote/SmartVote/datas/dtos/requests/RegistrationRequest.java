package africa.vote.SmartVote.datas.dtos.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequest {
    @NotBlank(message = "This Field cannot be blank")
    private String firstName;
    private String lastName;
    @Email(message = "This field requires a valid email address")
    @NotBlank(message = "This Field cannot be blank")
    private String email;
    private String phoneNumber;
    @NotBlank(message = "This Field cannot be blank")
    private String password;
    @NotBlank(message = "This Field cannot be blank")
    private String category;
    private String imageUrl;
}