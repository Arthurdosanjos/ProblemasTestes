import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class BuscaBinariaTeste {



    @Test
    public void casoDeMeioPar() {

        int[] array = {0,2,4,6,8,10};
        int chave = 6;

        BuscaBinaria b = new BuscaBinaria();

        assertEquals(3, b.busca(array, chave));


        
    }

    @Test
    public void casoDeMeioImpar(){

        int[] array = {0,2,4,6,8,10,12};
        int chave = 6;

        BuscaBinaria b = new BuscaBinaria();

        assertEquals(3, b.busca(array, chave));
        
    }

    @Test
    public void casodenumeroinexistente(){
        int[] array = {0,2,4,6,8,10,12};
        int chave = 5;

        BuscaBinaria b = new BuscaBinaria();

        assertEquals(-1, b.busca(array, chave));
    }

    @Test
    public void casodenumeroforadealcance(){
        int[] array = {0,2,4,6,8,10,12};
        int chave = 18;

        BuscaBinaria b = new BuscaBinaria();

        assertEquals(-1, b.busca(array, chave));

    }

    @Test
    public void casodenumeronoinicio(){
        int[] array = {0,2,4,6,8,10,12};
        int chave = 0;

        BuscaBinaria b = new BuscaBinaria();

        assertEquals(0, b.busca(array, chave));

    }
    
    
}



