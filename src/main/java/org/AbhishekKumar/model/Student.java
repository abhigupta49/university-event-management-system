package org.AbhishekKumar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.asm.Type;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @NotNull
    private Integer studentId;
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$")
    private String studentFirstName;
    @NotBlank
    private String studentLastName;
    @Min(value = 18) @Max(value = 25)
    private Integer studentAge;
    @Enumerated(EnumType.STRING)
    private Department studentDepartment;
}
