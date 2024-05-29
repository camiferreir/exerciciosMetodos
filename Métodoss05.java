package métodoss05;

public class Métodoss05 {

    public static void iguais() {
        String nome1 = "pedro";
        String nome2 = "joao";

        boolean iguais = nome1.equals(nome2);

        if (iguais == true) {
            System.out.println("os nomes sao iguais");
        } else {
            System.out.println("os nomes nao sao iguais");
        }
    }

    public static void main(String[] args) {
        iguais();
    }
}
