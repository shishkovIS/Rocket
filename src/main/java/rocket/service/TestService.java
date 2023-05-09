package rocket.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import rocket.entity.Session;
import rocket.entity.TestEntity;
@RestController
public class TestService {
    @GetMapping("/test")
    TestEntity all() {
        return new TestEntity(1, 1);
    }

    @GetMapping("/session")
    Session getSession(String token,String sign)
    {
        return new Session(
                "123456789",
                "EUR",
                "endorphina_Geisha@ENDORPHINA"
        );
    }
}
