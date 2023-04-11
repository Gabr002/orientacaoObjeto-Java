package Heranca.Classes;

import java.util.Date;

public class Motorista extends Funcionario {

    // Constructor
    public Motorista(String nome, Date dataNascimento, String cpf, Double salario) {
        /*
         * Note que chamado o constructor da classe pai(FUNCIONARIO),
         * para isso foi feito o uso do recurso "super" que chama o constructor da classe pai.
         */
        super(nome, dataNascimento, cpf, salario);
    }
}
