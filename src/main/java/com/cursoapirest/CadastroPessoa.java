package com.cursoapirest;


import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {
    private List<Pessoa> pessoa;

    public CadastroPessoa() {
        this.pessoa = new ArrayList<>();
    }

    public List<Pessoa> getPessoas() {
        return this.pessoa;
    }

    public void adicionar(Pessoa pessoa) {
        if(pessoa.getNome() == null){
            throw new PessoaSemNomeException();
        }
        this.pessoa.add(pessoa);
    }

    public void remover(Pessoa pessoa) {
        if(!this.pessoa.isEmpty()){
            throw new CadastroVazioException();
        }
        this.pessoa.remove(pessoa);
    }
}
