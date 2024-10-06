package api.dtos.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseRequest {
    @NotBlank(message = "name is required")
    private String name;

    private String description;

    @NotNull(message = "instructor is required")
    private Long instructorId;

}
