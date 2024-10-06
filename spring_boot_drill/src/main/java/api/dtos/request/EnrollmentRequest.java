package api.dtos.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnrollmentRequest {
    @NotNull(message = "User is required")
    private Long userId;
    @NotNull(message = "Course is required")
    private Long courseId;
}
