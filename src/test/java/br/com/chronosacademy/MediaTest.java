package br.com.chronosacademy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTest {
    @Test
    public void validaAprovad(){
         Media media = new Media();
         String resultado = media.calculaMedia(5.0,5.0);
     assertEquals("Aprovado", resultado);
}
    @Test
    public void validaAprovad(){
        Media media = new Media();
        String resultado = media.calculaMedia(4.9,5.0);
        assertEquals("Reprovado", resultado);
    }