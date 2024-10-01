package domain.entities;

import jakarta.persistence.*;
import lombok.*;
import utils.enums.RoleUser;

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
    private RoleUser rol;

}
