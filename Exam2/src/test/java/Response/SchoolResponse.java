package Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@Data
public class SchoolResponse {


    private String message;

}
