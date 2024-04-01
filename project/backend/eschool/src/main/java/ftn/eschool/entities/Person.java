package ftn.eschool.entities;

import ftn.eschool.entities.enums.Gender;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Person {
    private UUID ID;
    private Gender gender;
    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;
    private String phoneNumber;
    private String UCN;

}
