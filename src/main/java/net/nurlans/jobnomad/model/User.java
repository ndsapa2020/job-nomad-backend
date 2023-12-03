package net.nurlans.jobnomad.model;

import jakarta.persistence.*;
import lombok.Data;
import net.nurlans.jobnomad.model.status.*;

import java.time.LocalDate;
import java.time.Year;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String nickname;

    private Year birthYear;
    private String avatar;
    private UserStatus userStatus;
    private int reputation;
    private ExpertiseLevel expertiseLevel;
    private LocalDate registrationDate;
    private MaritalStatus maritalStatus;
    private Gender gender;
    private LocalDate lastLoggedDate;
    private Role role;
    private Country countryOfBirth;
    private Country countryTo;
    private String telegram;
    private String phone;
    private int engagementLevel;
    private String reservedField;

}
