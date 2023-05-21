package Model;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {

    @NotEmpty(message = "id is empty")
    private String id;

    @NotEmpty(message = "name is empty")
    private String name;

    @NotEmpty(message = "age is empty")
    @Min(value = 10, message = "age must greater than 10")
    @Max(value = 20, message = "Age must be less than 20")
    private String age;

    @NotEmpty(message = "major is empty")
    private String major;
}
