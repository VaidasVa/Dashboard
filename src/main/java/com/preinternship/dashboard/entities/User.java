package com.preinternship.dashboard.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

// @Builder
@Data  // @AllArgsConstructor ateina su data
@Entity // maps to DB table
//@RequiredArgsConstructor // generates a constructor with 1 parameter for each field that requires special handling. All non-initialized final fields get a parameter, as well as any fields that are marked as @NonNull that aren't initialized where they are declared. For those fields marked with @NonNull, an explicit null check is also generated.
@Table(name="users")
public class User {

    @Id // Primary key
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name="id")
    private int id;

    @Column (name="userName", nullable = false)
    private String userName;

    @Column (name="email", nullable = false)
    private String email;

    @Column (name="password", nullable = false)
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

    @Column (name="token")
    private String token;

    // Empty constructor - this is a must if there are auxiliary constructors
    public User() {}


    // Auxiliary constructor
    public User (String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
