package Model;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Teacher {
@NotEmpty
    private String id;
@NotEmpty
    private String name;
@NotEmpty
    private int salary;


}
