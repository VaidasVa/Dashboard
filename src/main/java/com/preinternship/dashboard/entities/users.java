package com.preinternship.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Setter
@Getter
@RequiredArgsConstructor // generates a constructor with 1 parameter for each field that requires special handling. All non-initialized final fields get a parameter, as well as any fields that are marked as @NonNull that aren't initialized where they are declared. For those fields marked with @NonNull, an explicit null check is also generated.
@AllArgsConstructor // generates a constructor with 1 parameter for each field in your class. Fields marked with @NonNull result in null checks on those parameters.
@Table(name="users")
public class users {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name="id")
    private int id;

    @Column (name="userName")
    private String userName;

    @Column (name="email", unique=true)
    private String email;

    @Column (name="password")
    private String password;

    @Column (name="userBOD")
    @Temporal(TemporalType.DATE)
    private Date bod;

    @Column (name="userCreated")
    @Temporal(TemporalType.DATE)
    private Date userCreated;

    @Column (name="lastLogin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
}
