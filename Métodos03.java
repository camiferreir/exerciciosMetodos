package métodos03;

public class Métodos03 {

    public static void iguais() {
        String nome1 = "carlos";
        String nome2 = "juliane";

        boolean iguais = nome1.equals(nome2);

        if (iguais == true) {
            System.out.println("sao iguais");
        } else {
            System.out.println("Nao sao iguais");
        }
    }

    public static void main(String[] args) {
        iguais();
    }
}
