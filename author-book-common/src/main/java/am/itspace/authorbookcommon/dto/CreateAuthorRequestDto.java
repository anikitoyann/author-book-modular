package am.itspace.authorbookcommon.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAuthorRequestDto {
    private String name;
    private String surname;
    private String email;


}
