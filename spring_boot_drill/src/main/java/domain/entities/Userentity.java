package domain.entities;

import jakarta.persistence.*;
import lombok.*;
import utils.enums.RoleUser;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "user")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Userentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(length = 100)
    private String fullName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleUser rol;

    @OneToMany(
            mappedBy = "userId",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    @Builder.Default
    private List<Enrollment> enrollments = new ArrayList<>();

    @OneToMany(
            mappedBy = "instructorId",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    @Builder.Default
    private List<Course> courses = new ArrayList<>();

    @OneToMany(
            mappedBy = "userId",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    @Builder.Default
    private List<Submission> submissions = new ArrayList<>();

    @OneToMany(
            mappedBy = "senderId",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    @Builder.Default
    private List<Message> messagesSender = new ArrayList<>();

    @OneToMany(
            mappedBy = "receiverId",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = false
    )
    @Builder.Default
    private List<Message> messagesReceiver = new ArrayList<>();


}
