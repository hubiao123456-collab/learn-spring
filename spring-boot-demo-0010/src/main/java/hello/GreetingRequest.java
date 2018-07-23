package hello;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GreetingRequest {

    private String msg;

}
