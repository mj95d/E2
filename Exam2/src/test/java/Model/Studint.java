package Model;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Studint {

    @NotEmpty
    private String id;
    @NotEmpty

    private String name;
@NotEmpty
    private int age;
@NotEmpty
    private int major;
}
