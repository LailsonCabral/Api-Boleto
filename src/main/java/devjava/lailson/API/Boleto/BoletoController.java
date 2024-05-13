package devjava.lailson.API.Boleto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BoletoController {

    @Autowired
    private BoletoRepository boletoRepository;

    @PostMapping("/boleto")
    public ResponseEntity boleto(@RequestBody BoletoDto boletoDto){
        Boleto boleto = new Boleto();
        boleto.setValor(boletoDto.getValor());
        boleto.setContaRecebedor(boletoDto.getContaRecebedor());
        boleto.setPago(boletoDto.getPago());
        Boleto boletoCreated = boletoRepository.save(boleto);
        return ResponseEntity.ok().body(boletoCreated);
    }
}
