package com.cursoapirest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CadastroPessoaTest {

    @Test
    public void deveCriarCadastrodePessoas(){
        CadastroPessoa cadastroPessoa = new CadastroPessoa();

        Assertions.assertThat(cadastroPessoa.getPessoas()).isEmpty();
    }

}
