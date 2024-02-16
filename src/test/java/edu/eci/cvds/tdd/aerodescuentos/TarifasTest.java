package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.Assert;
import org.junit.Test;
public class TarifasTest {
    @Test
    public void tarifaNegativa(){
        double tarifa = CalculadorDescuentos.calculoTarifa(-1000,20, 20);
        Assert.assertFalse("la tarifa no puede ser negativa",tarifa > 0);
    }
    @Test
    public void verificarTarifaMenorEdadYAntelacion(){
        double Tarifa = CalculadorDescuentos.calculoTarifa(1000,21, 17);
        Assert.assertEquals(Tarifa, 800 );
    }

    @Test
    public void verificarTarifaMenorEdad(){
        double Tarifa = CalculadorDescuentos.calculoTarifa(1000,18, 17);
        Assert.assertEquals(Tarifa, 950 );
    }

    @Test
    public void verificarTarifaAntelacion(){
        double Tarifa = CalculadorDescuentos.calculoTarifa(1000,21, 18);
        Assert.assertEquals(Tarifa, 850 );
    }

    @Test
    public void verificarTarifaMayorEdadYAntelacion(){
        double Tarifa = CalculadorDescuentos.calculoTarifa(1000,21, 66);
        Assert.assertEquals(Tarifa, 770 );
    }

    @Test
    public void verificarTarifaMayorEdad(){
        double Tarifa = CalculadorDescuentos.calculoTarifa(1000,21, 17);
        Assert.assertEquals(Tarifa, 930 );
    }
}
