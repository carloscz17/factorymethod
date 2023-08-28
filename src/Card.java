import java.util.Scanner;
public class Card {
    public static void cardFunction() {

        Scanner scannerObj = new Scanner(System.in);
        System.out.println("===================================================================");
        System.out.printf("Boa noite, digite qual o cartão que deseja ver o boleto da fatura: \n=== 1- VISA;\n=== 2- MASTER;\n===================================================================\nQual você deseja? ");
        Integer escolha = scannerObj.nextInt();

        switch (escolha) {
            case 1:
                cardA();
                break;
            case 2:
                cardB();
                break;
        }
    }
    public static void cardA(){

        System.out.println("Você selecionou o CARD A, prossiga com pergunta;");

        double valor = 1000.0;
        double juros,multa;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos dias já atrasou o pagamento? ");
        Integer dias = scanner.nextInt();

        if (dias >= 10 && dias <= 30) {
            juros = valor * 0.02;
            multa = valor * 0.05;
            System.out.println("=============================BOLETO=============================");
            System.out.println("========== Valor do boleto: " + valor);
            System.out.println("========== Valor do juros: " + (juros + valor));
            System.out.println("========== Valor da multa:" + multa);
            System.out.println("=============================BOLETO=============================");
        }
        if (dias > 30 && dias <= 60) {
            juros = valor * 0.05;
            multa = valor * 0.1;
            System.out.println("=============================BOLETO=============================");
            System.out.println("========== Valor do boleto: " + valor);
            System.out.println("========== Valor do juros: " + juros);
            System.out.println("========== Valor da multa:" + multa);
            System.out.println("=============================BOLETO=============================");
        }
        if (dias > 60) {
            juros = valor * 0.1;
            multa = valor * 0.2;
            System.out.println("=============================BOLETO=============================");
            System.out.println("========== Valor do boleto: " + valor);
            System.out.println("========== Valor do juros: " + juros);
            System.out.println("========== Valor da multa:" + multa);
            System.out.println("=============================BOLETO=============================");
        }
    }
    public static void cardB(){

        System.out.println("Você selecionou o CARD B, prossiga com a pergunta;");

        double valor = 1000.0;
        double juros,multa;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos dias já atrasou o pagamento? ");
        Integer dias = scanner.nextInt();

        if (dias >= 10 && dias <= 30) {
            juros = valor * 0.02;
            multa = valor * 0.05;
            System.out.println("=============================BOLETO=============================");
            System.out.println("========== Valor do boleto: " + valor);
            System.out.println("========== Valor do juros : " + juros);
            System.out.println("========== Valor da multa:" + multa);
            System.out.println("=============================BOLETO=============================");
        }
        if (dias > 30 && dias <= 60) {
            juros = valor * 0.05;
            multa = valor * 0.1;
            System.out.println("=============================BOLETO=============================");
            System.out.println("========== Valor do boleto: " + valor);
            System.out.println("========== Valor do juros: " + juros);
            System.out.println("========== Valor da multa:" + multa);
            System.out.println("=============================BOLETO=============================");
        }
        if (dias > 60) {
            juros = valor * 0.1;
            multa = valor * 0.2;
            System.out.println("=============================BOLETO=============================");
            System.out.println("========== Valor do boleto: " + valor);
            System.out.println("========== Valor do juros: " + juros);
            System.out.println("========== Valor da multa:" + multa);
            System.out.println("=============================BOLETO=============================");
        }
    }
}
