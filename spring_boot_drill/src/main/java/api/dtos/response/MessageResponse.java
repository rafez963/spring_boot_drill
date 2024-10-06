package api.dtos.response;

import domain.entities.Course;
import domain.entities.Userentity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageResponse {
    private Long id;
    private UserResponse senderId;
    private UserResponse receiverId;
    private CourseResponse courseId;
    private LocalDateTime date;
}
