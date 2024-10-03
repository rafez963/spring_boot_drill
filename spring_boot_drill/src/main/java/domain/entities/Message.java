package domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Userentity senderId;

    @ManyToOne(fetch = FetchType.EAGER)
    private Userentity receiverId;

    @ManyToOne(fetch = FetchType.EAGER)
    private Course courseId;

    @Column(nullable = false)
    private String content;

    @Builder.Default
    private LocalDateTime date = LocalDateTime.now();
}
