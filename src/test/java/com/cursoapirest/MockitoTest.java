package com.cursoapirest;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class MockitoTest {

    @Test
    public void primeiroTesteMock(){
        List<String> list = Mockito.mock(ArrayList.class);

        Mockito.when(list.size()).thenReturn(20);

        int size = list.size();

        Assertions.assertThat(size).isEqualTo(20);
    }
}
