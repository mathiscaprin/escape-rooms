package org.sebsy.demo.escaperooms.bll;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Primary
@Profile("passage")
@Component
public class Room1Service implements RoomService {

    public String entreeSalle() {
        return "Bravo, vous avez trouvé la deuxième salle !";
    }

}
