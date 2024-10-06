package api.dtos.response;

import domain.entities.Assignment;
import domain.entities.Userentity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmissionResponse {

    private Long id;
    private String content;
    private LocalDateTime date;
    private BigDecimal grade;
    private UserResponse userId;
    private AssignmetResponse assignmentId;


}
