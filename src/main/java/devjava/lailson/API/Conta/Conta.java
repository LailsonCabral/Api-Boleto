package devjava.lailson.API.Conta;

import devjava.lailson.API.Boleto.Boleto;
import devjava.lailson.API.USER.User;
import devjava.lailson.API.Utils;
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
@Table(name = "conta")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Integer numeroConta;

    @Column(name = "user")
    private User usuario;

    @Column(name = "saldo")
    private Double saldo;

    public String Saldo(){
        return Utils.doubleToString(getSaldo());
    }

    public void Depositar(Double valor){
        saldo = getSaldo() + valor;
        setSaldo(saldo);
    }

    public void PagarBoleto(Boleto boleto){
        if (getSaldo() < boleto.getValor()){
            System.out.println("Saldo insuficiente");
        } else {
            setSaldo(getSaldo() - boleto.getValor());
            boleto.setPago(true);
            System.out.println("Boleto pago com sucesso");
            boleto.getContaRecebedor().setSaldo(boleto.getContaRecebedor().getSaldo() + boleto.getValor());
        }
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
