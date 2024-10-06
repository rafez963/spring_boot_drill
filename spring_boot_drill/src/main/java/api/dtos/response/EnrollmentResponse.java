package api.dtos.response;

import java.time.LocalDateTime;

public class EnrollmentResponse {

    private Long id;
    private UserResponse userId;
    private CourseResponse courseId;
    private LocalDateTime date;
}
