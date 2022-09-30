package com.cursoapirest;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class CadastroPessoaTest {

    @Test
    public void deveCriarCadastrodePessoas(){
        CadastroPessoa cadastroPessoa = new CadastroPessoa();

        Assertions.assertThat(cadastroPessoa.getPessoas()).isEmpty();
    }

    @Test
    public void deveAdicionarUmaPessoa(){
        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Roberto");

        cadastroPessoa.adicionar(pessoa);

        Assertions.assertThat(cadastroPessoa.getPessoas())
                .isNotEmpty()
                .hasSize(1)
                .contains(pessoa);
    }

//    @Test(expected = PessoaSemNomeException.class)
//    public void naoDeveCadastrarPessoaSemNome(){
//        CadastroPessoa cadastroPessoa = new CadastroPessoa();
//        Pessoa pessoa = new Pessoa();
//
//        cadastroPessoa.adicionar(pessoa);
//    }

    @Test
    public void deveRemoverUmaPessoa(){
        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Roberto");

        cadastroPessoa.adicionar(pessoa);

        cadastroPessoa.remover(pessoa);

        Assertions.assertThat(cadastroPessoa.getPessoas())
                .isEmpty();
    }

    @Test(expected = CadastroVazioException.class)
    public void deveExibirAoTentarRemoverPessoaInexistente(){
        Pessoa pessoa = new Pessoa();
        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        cadastroPessoa.remover(pessoa);

    }
}
