import java.time.Duration;
import java.util.Scanner;

public class IntervalosTempo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro intervalo de tempo (horas minutos segundos):");
        Duration intervalo1 = lerIntervalo(scanner);

        System.out.println("Digite o segundo intervalo de tempo (horas minutos segundos):");
        Duration intervalo2 = lerIntervalo(scanner);

        Duration soma = intervalo1.plus(intervalo2);
        Duration diferenca = intervalo1.minus(intervalo2).abs(); 

        System.out.println("\nResultados:");
        System.out.println("Soma dos intervalos: " + formatarDuracao(soma));
        System.out.println("Diferença dos intervalos: " + formatarDuracao(diferenca));

        scanner.close();
    }

    private static Duration lerIntervalo(Scanner scanner) {
        int horas = scanner.nextInt();
        int minutos = scanner.nextInt();
        int segundos = scanner.nextInt();


        return Duration.ofHours(horas).plusMinutes(minutos).plusSeconds(segundos);
    }

    private static String formatarDuracao(Duration duracao) {
        long horas = duracao.toHours();
        long minutos = duracao.toMinutesPart(); 
        long segundos = duracao.toSecondsPart();

        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}