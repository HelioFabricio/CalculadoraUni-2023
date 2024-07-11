import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int OperacaoEntrada, precisao, ContadorResultados = 0;
        double entrada1, entrada2, resultado;
        String formatada, formatadaResto;
        double[] HistoricoResultados = new double[5];

        do {
            System.out.println("-----Escolha a uma operação matemática-----\n" +
                    "1 - Adição. \n" +
                    "2 - Subtração. \n" +
                    "3 - Multiplicação. \n" +
                    "4 - Divisão. \n" +
                    "5 - Potência. \n" +
                    "6 - Raiz. \n" +
                    "7 - Logaritimo. \n" +
                    "8 - 10 elevado a número X. \n" +
                    "9 - Histórico dos últimos 5 resultados. \n" +
                    "0 - Fechar Calculadora. \n" +
                    "-------------------------------------------");
            OperacaoEntrada = scan.nextInt();

            switch (OperacaoEntrada) {
                case 1: // Adição
                    System.out.println("Entre o primeiro número da soma: ");
                    entrada1 = scan.nextDouble();
                    System.out.println("Entre o segundo número da soma: ");
                    entrada2 = scan.nextDouble();
                    System.out.println("Entre a precisão do resultado: ");
                    precisao = scan.nextInt();

                    resultado = entrada1 + entrada2;

                    formatada = String.format("%." + precisao + "f", resultado);
                    System.out.println("Resposta: " + formatada);

                    HistoricoResultados[ContadorResultados] = resultado;
                    ContadorResultados++;
                    break;
                case 2: // Subtração
                    System.out.println("Entre o primeiro número que deseja subtrair: ");
                    entrada1 = scan.nextDouble();
                    System.out.println("Entre o segundo número que deseja subtrair: ");
                    entrada2 = scan.nextDouble();
                    System.out.println("Entre a precisão do resultado: ");
                    precisao = scan.nextInt();

                    resultado = (entrada1) - (entrada2);

                    formatada = String.format("%." + precisao + "f", resultado);
                    System.out.println("Resposta: " + formatada);

                    HistoricoResultados[ContadorResultados] = resultado;
                    ContadorResultados++;
                    break;
                case 3: // Multiplicação
                    System.out.println("Entre o primeiro número da multiplicação: ");
                    entrada1 = scan.nextDouble();
                    System.out.println("Entre o segundo número da multiplicação: ");
                    entrada2 = scan.nextDouble();
                    System.out.println("Entre a precisão do resultado: ");
                    precisao = scan.nextInt();

                    resultado = entrada1 * entrada2;

                    formatada = String.format("%." + precisao + "f", resultado);
                    System.out.println("Resposta: " + formatada);

                    HistoricoResultados[ContadorResultados] = resultado;
                    ContadorResultados++;
                    break;
                case 4: // Divisão
                    System.out.println("Entre o dividendo da divisão: ");
                    entrada1 = scan.nextDouble();
                    System.out.println("Entre o divisor da divisão: ");
                    entrada2 = scan.nextDouble();
                    System.out.println("Entre a precisão do resultado: ");
                    precisao = scan.nextInt();
                    double resto = 0;

                    if (entrada2 == 0) {
                        System.out.println("Operação inválida");
                        break;
                    } else {
                        resultado = entrada1 / entrada2;
                        resto = entrada1 % entrada2;

                        formatada = String.format("%." + precisao + "f", resultado);
                        formatadaResto = String.format("%." + precisao + "f", resto);
                        System.out.println("Resposta da divisão: " + formatada);
                        System.out.println("Resto da divisão: " + formatadaResto);

                        HistoricoResultados[0] = resultado;
                        ContadorResultados++;
                    }
                    break;
                case 5: // Potencia
                    System.out.println("Entre a BASE da potência: ");
                    entrada1 = scan.nextDouble();
                    System.out.println("Entre seu EXPOENTE: ");
                    entrada2 = scan.nextDouble();
                    System.out.println("Entre a precisão do resultado: ");
                    precisao = scan.nextInt();

                    resultado = 1;

                    for (int i = 1; i <= entrada2; i++) {
                        resultado = resultado * entrada1;
                    }

                    formatada = String.format("%." + precisao + "f", resultado);
                    System.out.println("Resposta: " + formatada);

                    HistoricoResultados[0] = resultado;
                    ContadorResultados++;
                    break;
                case 6: // Raiz
                    double ResultadoDouble, EntradaDouble;

                    System.out.println("Entre o número em que deseja saber a raiz: ");
                    EntradaDouble = scan.nextDouble();
                    System.out.println("Entre a precisão do resultado: ");
                    precisao = scan.nextInt();

                    if (EntradaDouble <= 0) {
                        System.out.println("Operação Inválida... ");
                        break;
                    } else {
                        ResultadoDouble = Math.sqrt(EntradaDouble);

                        formatada = String.format("%." + precisao + "f", ResultadoDouble);
                        System.out.println("Resposta: " + formatada);

                        HistoricoResultados[ContadorResultados] = ResultadoDouble;
                        ContadorResultados++;
                        break;
                    }
                case 7: // Logaritimo
                    System.out.println("Entre a Base: ");
                    entrada2 = scan.nextDouble();
                    System.out.println("Entre um número POSITIVO: ");
                    entrada1 = scan.nextDouble();
                    System.out.println("Entre a precisão do resultado: ");
                    precisao = scan.nextInt();

                    if (entrada1 <= 0) {
                        System.out.println("Operação Inválida.");
                        break;
                    } else {
                        resultado = Math.log(entrada1) / Math.log(entrada2);

                        formatada = String.format("%." + precisao + "f", resultado);
                        System.out.println("Resposta: " + formatada);

                        HistoricoResultados[ContadorResultados] = resultado;
                        ContadorResultados++;
                        break;
                    }
                case 8: // 10 elevado a X
                    System.out.println("Entre o expoente de 10: ");
                    entrada1 = scan.nextDouble();

                    resultado = Math.pow(10, entrada1);
                    System.out.printf("Resposta: " + resultado + " \n");

                    HistoricoResultados[ContadorResultados] = resultado;
                    ContadorResultados++;
                    break;
                case 9: // Histórico de Resultados
                    System.out.println("Os resultados das últimas 10 operações foram: ");
                    for (int i = 0; i < HistoricoResultados.length; i++) {
                        if (HistoricoResultados[i] == 0) {
                            // elimina os zeros dos Index que não foram preenchidos
                        } else {
                            System.out.println(HistoricoResultados[i] + " ");
                        }
                    }
                    break;
                default:
                    if (OperacaoEntrada >= 10) {
                        System.out.println("Operação Inválida. \n");
                    }
                    break;
            }
        }
        while (OperacaoEntrada != 0);
        System.out.println("Fechando calculadora.");
    }
}
