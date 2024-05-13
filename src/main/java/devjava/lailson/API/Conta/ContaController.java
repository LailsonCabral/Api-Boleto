package devjava.lailson.API.Conta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ContaController {

    @Autowired
    private ContaRepository contaRepository;

    @PostMapping("/conta")
    public ResponseEntity conta(@RequestBody ContaDto contaDto){
        Conta conta = new Conta();
        conta.setUsuario(contaDto.getUser());
        conta.setSaldo(contaDto.getSaldo());
        Conta contaCreated = contaRepository.save(conta);
        return ResponseEntity.ok().body(contaCreated);
    }
}
