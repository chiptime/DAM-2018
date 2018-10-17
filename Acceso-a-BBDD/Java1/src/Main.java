public class Main {


    public static void main(String[] args) {
        NIF nif = new NIF(2765391, 'H');
        Persona persona = new Persona("Bruno", "Silva", new Fecha(12,01,1995),new NIF(2765391,'D'));
        System.out.println(persona.toString());
    }
}
