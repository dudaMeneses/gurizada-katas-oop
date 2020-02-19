package com.duda.kata.gurizada;

import com.google.common.reflect.ClassPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Testes para criacao de classes")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Tests {

    @Test
    @Order(1)
    @DisplayName("1. Criar classe")
    public void criarClasseTest() throws IOException {
        ClassLoader loader = this.getClass().getClassLoader();
        ClassPath path = ClassPath.from(loader);

        assertTrue(
                path.getTopLevelClasses("com.duda.kata.gurizada")
                        .stream()
                        .anyMatch(clazz -> clazz.getSimpleName().equals("Guri")),
                "Crie uma classe chamada 'Guri' dentro do package 'com.duda.kata.gurizada'. Em caso de duvidas, siga para a Dica #1"
        );
    }

    @Test
    @Order(2)
    @DisplayName("2. Criar atributo")
    public void criaAtributoTest() {
        assertTrue(
                true,
                "Crie um atributo chamado 'camisa' do tipo 'Integer' na classe 'Guri'. Em caso de duvidas, siga para a Dica #2");
    }
}
