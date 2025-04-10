package DesafioControleFluxo;

public class ParametrosInvalidosException extends Exception{
    private String messagem;
    public ParametrosInvalidosException(){
        super("parametro invalido");
    }

}
