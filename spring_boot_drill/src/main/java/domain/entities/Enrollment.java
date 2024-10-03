package domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Userentity userId;

    @ManyToOne(fetch = FetchType.LAZY)
    private Course courseId;

    @Builder.Default
    private LocalDate date = LocalDate.now();

}
