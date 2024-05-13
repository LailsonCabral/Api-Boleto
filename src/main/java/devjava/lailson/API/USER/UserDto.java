package devjava.lailson.API.USER;

import devjava.lailson.API.Conta.Conta;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {

    private String nome;
    private String cpf;
    private String email;

    private Conta conta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
