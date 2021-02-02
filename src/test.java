import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class test {

    @Test
    @DisplayName("Pasar una string y devulve un numero")

    public void Test1() {
        // Llamamos a la clase
        Clase c = new Clase();
        // Ejecutar
        int res = c.numero("uno");
        // Resultado
        assertEquals(1, res);
    }

    @Test
    @DisplayName("Pasar una string y devulve una lista")

    public void Test2(){
        //Llamamos a la clase 
        Clase  c = new Clase();
        // Ejecutar
        List<Integer> res= new ArrayList<Integer>();
        res = c.valores("UnnoO Doss");
        List<Integer> solucion = new ArrayList<Integer>(List.of(1,2));
        //Resultado

        assertEquals(solucion, res);

} 

@Test
    @DisplayName("Valores proporcionales")
    public void Test3(){
        //Llamamos a la clase Calculadora
        Clase  c = new Clase();
        //resultado varia segun el tipo de método
        List<Double> result= new ArrayList<Double>();
        result=c.proporcional(new int[]{1,2,3}, 60);
        List<Double> sol= new ArrayList<Double>(List.of(10.00, 20.00,30.00));
        assertEquals(sol, result);
    }

    @Test
    @DisplayName("Proporción")
    public void Test4(){
        //Llamamos a la clase Calculadora
        Clase c = new Clase();
        //resultado varia segun el tipo de método
        List<Double> result= new ArrayList<Double>();
        result=c.proporcional(new int[]{1,2,3}, 60);
        List<Double> sol= new ArrayList<Double>(List.of(10.00, 20.00,30.00));
        assertEquals(sol, result);
    }

    @Test
    @DisplayName("Digitos")
    public void Test5(){
        //Llamamos a la clase Calculadora
        Clase c = new Clase();
        //resultado varia segun el tipo de método
        List<Integer> result= new ArrayList<Integer>();
        result=c.valores("  hoOla   UnnOs");
        List<Integer> sol= new ArrayList<Integer>(List.of(0, 3));
        assertEquals(sol, result);
    }

}

