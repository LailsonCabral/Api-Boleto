package devjava.lailson.API.Boleto;

import devjava.lailson.API.Conta.Conta;
import devjava.lailson.API.USER.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "boleto")
public class Boleto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Integer codigo;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "contarecebedor")
    private Conta contarecebedor;

    @Column(name = "pago")
    private Boolean pago;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Conta getContaRecebedor() {
        return contarecebedor;
    }

    public void setContaRecebedor(Conta contarecebedor) {
        this.contarecebedor = contarecebedor;
    }

    public Boolean getPago() {
        return pago;
    }

    public void setPago(Boolean pago) {
        this.pago = pago;
    }
}
