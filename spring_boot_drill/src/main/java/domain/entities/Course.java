package domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private Userentity instructorId;

    @OneToMany(
            mappedBy = "courseId",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = false

    )
    private List<Enrollment> enrollments;

    @OneToMany(
            mappedBy = "lessonId",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = false

    )
    private List<Lesson> lessons;

    @OneToMany(
            mappedBy = "assignmentId",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    private List<Assignment> assignments;


}
