package api.dtos.request;

import api.dtos.response.LessonResponse;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class AssignmentRequest {
    @NotBlank(message = "titleis required")
   private String title;

    private String Description;

    @NotNull(message = "Lesson is required")
    private Long lessonId;

}
