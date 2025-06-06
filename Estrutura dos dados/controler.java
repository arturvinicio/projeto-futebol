import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Arrays;

@Controller
public class FutebolController {

    @GetMapping("/")
    public String index(Model model) {
        Jogador j1 = new Jogador("João", "Atacante", 12);
        Jogador j2 = new Jogador("Carlos", "Meio-campo", 5);
        List<Jogador> jogadores = Arrays.asList(j1, j2);

        model.addAttribute("jogadores", jogadores);
        return "index"; // vai procurar por /templates/index.html
    }
}
