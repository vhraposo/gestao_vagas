package br.com.vraposo.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {
    public UserFoundException(){
        super("User already exists");
    }
}
