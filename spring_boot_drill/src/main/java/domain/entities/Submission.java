package domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String content;
    @Builder.Default
    private LocalDateTime date = LocalDateTime.now();
    @Column(columnDefinition = "DECIMAL(5,2)")
    private BigDecimal  grade;
    private Long userId;
    private Long assigmentId;

}
