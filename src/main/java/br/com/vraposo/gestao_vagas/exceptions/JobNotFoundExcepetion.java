package br.com.vraposo.gestao_vagas.exceptions;

public class JobNotFoundExcepetion extends RuntimeException{
    public JobNotFoundExcepetion(){
        super("Job not found");
    }
}
