package devjava.lailson.API.Conta;

import devjava.lailson.API.USER.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaDto {

    private User user;

    private Double saldo;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
