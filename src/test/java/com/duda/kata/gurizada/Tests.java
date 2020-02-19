package com.duda.kata.gurizada;

import org.junit.jupiter.api.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Validacoes para licoes de Programacao Orientada a Objetos")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Tests {

    @Test
    @Order(1)
    @DisplayName("1. Criar classe")
    public void criarClasseTest() {
        try {
            Class.forName("com.duda.kata.gurizada.Guri");
        } catch (ClassNotFoundException e) {
            fail("Crie uma classe chamada 'Guri' dentro do package 'com.duda.kata.gurizada'. Em caso de duvidas, siga para a Dica #1");
        }
    }

    @Test
    @Order(2)
    @DisplayName("2. Criar atributo")
    public void criaAtributoTest() {
        try {
            Class<?> clazz = Class.forName("com.duda.kata.gurizada.Guri");

            Field[] fields = clazz.getDeclaredFields();

            assertTrue(
                    fields.length > 0,
                    "Crie um atributo qualquer na classe 'Guri'. Em caso de duvidas, siga para a Dica #2"
            );
        } catch (ClassNotFoundException e) {
            fail("Crie uma classe chamada 'Guri' dentro do package 'com.duda.kata.gurizada'. Em caso de duvidas, siga para a Dica #1");
        }
    }

    @Test
    @Order(3)
    @DisplayName("2.1. Criar atributo nome")
    public void criaNomeTest(){
        try {
            Class<?> clazz = Class.forName("com.duda.kata.gurizada.Guri");

            Field field = clazz.getDeclaredField("nome");

            assertEquals(
                    String.class,
                    field.getType(),
                    "Crie um atributo chamado 'nome' do tipo 'String' na classe 'Guri'. Em caso de duvidas, siga para a Dica #2"
            );
        } catch (ClassNotFoundException | NoSuchFieldException e) {
            fail("Crie uma classe chamada 'Guri' dentro do package 'com.duda.kata.gurizada'. Em caso de duvidas, siga para a Dica #1");
        }
    }

    @Test
    @Order(4)
    @DisplayName("2.2. Criar atributo idade")
    public void criaIdadeTest(){
        try {
            Class<?> clazz = Class.forName("com.duda.kata.gurizada.Guri");

            Field field = clazz.getDeclaredField("idade");

            assertEquals(
                    Integer.class,
                    field.getType(),
                    "Crie um atributo chamado 'idade' do tipo 'Integer' na classe 'Guri'. Em caso de duvidas, siga para a Dica #2"
            );
        } catch (ClassNotFoundException | NoSuchFieldException e) {
            fail("Crie uma classe chamada 'Guri' dentro do package 'com.duda.kata.gurizada'. Em caso de duvidas, siga para a Dica #1");
        }
    }

    @Test
    @Order(5)
    @DisplayName("3. Criar objeto")
    public void criaObjetoTest(){
        try {
            Class<?> clazz = Class.forName("com.duda.kata.gurizada.Guri");

            clazz.getDeclaredConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            fail("Crie um construtor SEM PARAMETROS na classe 'Guri' dentro do package 'com.duda.kata.gurizada'. Em caso de duvidas, siga para a Dica #3");
        }
    }

    @Test
    @Order(6)
    @DisplayName("4. Criar metodo")
    public void criaMetodoTest() {
        try {
            Class<?> clazz = Class.forName("com.duda.kata.gurizada.Guri");
            Method[] methods = clazz.getDeclaredMethods();

            assertTrue(
                    methods.length > 0,
                    "Crie um metodo 'fala' na classe 'Guri' dentro do package 'com.duda.kata.gurizada'. Em caso de duvidas, siga para a Dica #4"
            );
        } catch (ReflectiveOperationException e) {
            fail("Crie um construtor SEM PARAMETROS na classe 'Guri' dentro do package 'com.duda.kata.gurizada'. Em caso de duvidas, siga para a Dica #3");
        }
    }

    @Test
    @Order(7)
    @DisplayName("4.1. Criar retorno pro metodo fala")
    public void criaRetornoMetodoTest() {
        try {
            Class<?> clazz = Class.forName("com.duda.kata.gurizada.Guri");

            Object obj = clazz.getDeclaredConstructor().newInstance();

            Method method = clazz.getDeclaredMethod("fala");

            assertEquals(
                    "Dotinha gurizada?",
                    method.invoke(obj),
                    "Crie um metodo 'fala' que retorne um 'String' na classe 'Guri' dentro do package 'com.duda.kata.gurizada'. Em caso de duvidas, siga para a Dica #4"
            );
        } catch (ReflectiveOperationException e) {
            fail("Crie um construtor SEM PARAMETROS na classe 'Guri' dentro do package 'com.duda.kata.gurizada'. Em caso de duvidas, siga para a Dica #3");
        }
    }

}
