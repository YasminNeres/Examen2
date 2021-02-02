public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Clase cal = new Clase();  
       
        System.out.println( cal.numero("uno"));
        System.out.println( cal.valores("unno dOs"));
        System.out.println(cal.proporcional(new int[]{1,2,3}, 60));
        System.out.println(cal.Final("Unoo DOS tress", 60));
        
    }
}