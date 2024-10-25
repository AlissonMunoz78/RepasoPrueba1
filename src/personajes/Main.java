package personajes;

public class Main {
    public static void main(String[] args) {
        System.out.printf("------INFORMACION----");
        Personaje per1 = new Personaje("Joao",2003,"0983641194");

        System.out.println("Nombre:" + per1.getNombre() );

        System.out.println("Año: " + per1.getAnioNacimiento() );
        System.out.println("Telef: " + per1.getTelefono());

        System.out.println("-------------");
        per1.setTelefono("0984761003");
        System.out.println("Telef actualizado: " + per1.getTelefono());
    }

    }
