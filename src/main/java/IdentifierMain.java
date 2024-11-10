public class IdentifierMain {

    public static void main(String[] args) {
        String identificador = "Z";
        Identifier id = new Identifier();
        if(id.validateIdentifier(identificador)){
            System.out.print("Valido");
        } else {
            System.out.print("Invalido");
        }
    }

}

