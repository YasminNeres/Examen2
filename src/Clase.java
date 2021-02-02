import java.util.ArrayList;
import java.util.List;

public class Clase {

    // Los metodos

    double to2dec(double valor) {
        return Math.floor(valor * 100) / 100d;
    }
// devuelve un numero quando pasa una string
public int numero(String p) {

    String palabra = p.trim().toLowerCase();
     int numero = 0;
     palabra = palabra.replaceAll("(.)\1", "$1");

     
     if (palabra.equals("uno")) numero = 1;
     if (palabra.equals("dos")) numero = 1;
     if (palabra.equals("tres"))numero = 1;
     if (palabra.equals("cuatro")) numero = 1;
     if (palabra.equals("cinco")) numero = 1;
     if (palabra.equals("seis")) numero = 1;
     if (palabra.equals("siete")) numero = 1;
     if (palabra.equals("ocho")) numero = 1;
     if (palabra.equals("nueve")) numero =9 ;
    

       return numero ;
    }

    public List<Integer> valores ( String str ){
        
        List<Integer> valores1 = new ArrayList<Integer>();;

        // Normalizacion de las palabras
        String [] palabra = str .trim().split("\s+ ");

        // Por cada palabra se invoca al metodo

        for ( int i = 0 ; i <palabra.length; i++){

        // El valor se añade a una lista
        valores1.add(numero(palabra[i]));
    }
        return valores1;
       
    

}

public List<Double> proporcional(int[]s,double valor){
    ArrayList<Double> proporcion = new ArrayList<Double>();
    double suma=0;
    for(int i=0;i<s.length;i++) suma+=s[i];
    for (int i=0;i<s.length;i++){
        double nuevoValor=(s[i]*valor)/suma;
        proporcion.add(nuevoValor);
    }
    return proporcion;
}

public List<Double> Final(String fin,double max){
    List<Integer> valores = new ArrayList<>();
    fin=fin.replaceAll("(.)\\1", "$1");
    String[] palabras = fin.trim().split("\s+");
    // Por cada palabra se invoca al metodo
    for(int i=0;i<palabras.length;i++){
       // y el valor se añade a una Lista
       valores.add(numero(palabras[i]));
    }
    ArrayList<Double> solucion = new ArrayList<Double>();
    double suma=0;
    for(int i=0;i<valores.size();i++) suma+=valores.get(i);
    for (int i=0;i<valores.size();i++){
        double nuevoValor=(valores.get(i)*max)/suma;
        solucion.add(to2dec(nuevoValor));
    }

    return solucion;
}
}
    

