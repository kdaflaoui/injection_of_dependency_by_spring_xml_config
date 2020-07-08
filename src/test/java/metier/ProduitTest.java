package metier;

import kdevelop.metier.Produit;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class ProduitTest {

    @Test
    public void testProduit(){
        double a = 5;
        double b = 8;

        double expected = 40;

        Produit produit = new Produit();

        double result = produit.produit(a, b);

        assertEquals(expected, result);
    }
}
