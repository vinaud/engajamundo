package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Postagem;

public class TestePostagem {

        @Test
        public void test() {
                Postagem post = new Postagem("titulo","oiComoVai","instaPostagem","Mister");
                assertEquals("titulo", post.getTitulo());
                 assertEquals("oiComoVai", post.getTexto());
                  assertEquals("instaPostagem", post.getTags());
                   assertEquals("Mister", post.getLogin());
                
                
        }

}
