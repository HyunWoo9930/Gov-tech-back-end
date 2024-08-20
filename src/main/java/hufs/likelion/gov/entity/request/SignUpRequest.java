package hufs.likelion.gov.entity.request;

import hufs.likelion.gov.entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequest {
	private String userId;
	private String password;
	private String email;
	private String profilePhoto;
	private Role role;

	public SignUpRequest(String userId, String password, String email, String profilePhoto, Role role) {
		this.userId = userId;
		this.password = password;
		this.email = email;
		this.profilePhoto = profilePhoto;
		this.role = role;
	}
}
