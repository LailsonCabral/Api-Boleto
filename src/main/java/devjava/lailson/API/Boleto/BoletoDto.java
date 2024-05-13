package devjava.lailson.API.Boleto;

import devjava.lailson.API.Conta.Conta;
import devjava.lailson.API.USER.User;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoletoDto {

    private Double valor;

    private Conta contarecebedor;

    private Boolean pago;

    public Double getValor() {
        return valor;
    }

    public Conta getContaRecebedor() {
        return contarecebedor;
    }

    public Boolean getPago() {
        return pago;
    }
}
