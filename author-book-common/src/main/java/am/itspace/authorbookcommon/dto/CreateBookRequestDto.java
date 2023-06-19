package am.itspace.authorbookcommon.dto;
import am.itspace.authorbookcommon.entity.Language;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBookRequestDto {
    private String title;
    private String description;
    private Language language;
    private int authorId;


}
