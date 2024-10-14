package br.com.alura.conversor.principal;

import br.com.alura.conversor.modelos.Moeda;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalAPI {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner capturar = new Scanner(System.in);
        capturar.useLocale(Locale.US);
        Moeda moeda = new Moeda();

        String conversor = """
                ***************************************************************
                                Seja bem-vindo/a ao Conversor de Moedas :)
                
                1) Dólar para Peso argentino
                2) Peso argentino para Dólar
                3) Dólar para Real brasileiro
                4) Real brasileiro para Dólar
                5) Dólar para Peso colombiano
                6) Peso colombiano para Dólar
                7) Sair
                
                Escolha uma opção válida:
                ***************************************************************
                """;

        int capturarEscolha = 0;
        var urlBaseCode = "";
        var urlTargetCode = "";
        double urlAmount = 0;

        while (capturarEscolha != 7) {
            try {
                System.out.println(conversor);
                capturarEscolha = capturar.nextInt();

                switch (capturarEscolha) {
                    case 1:
                        urlBaseCode = "USD";
                        urlTargetCode = "ARS";
                        System.out.println("Escolha um valor:");
                        urlAmount = capturar.nextDouble();

                        moeda.converterMoeda(urlBaseCode, urlTargetCode, urlAmount);
                        break;
                    case 2:
                        urlBaseCode = "ARS";
                        urlTargetCode = "USD";
                        System.out.println("Escolha um valor:");
                        urlAmount = capturar.nextDouble();

                        moeda.converterMoeda(urlBaseCode, urlTargetCode, urlAmount);
                        break;
                    case 3:
                        urlBaseCode = "USD";
                        urlTargetCode = "BRL";
                        System.out.println("Escolha um valor:");
                        urlAmount = capturar.nextDouble();

                        moeda.converterMoeda(urlBaseCode, urlTargetCode, urlAmount);
                        break;
                    case 4:
                        urlBaseCode = "BRL";
                        urlTargetCode = "USD";
                        System.out.println("Escolha um valor:");
                        urlAmount = capturar.nextDouble();

                        moeda.converterMoeda(urlBaseCode, urlTargetCode, urlAmount);
                        break;
                    case 5:
                        urlBaseCode = "USD";
                        urlTargetCode = "COP";
                        System.out.println("Escolha um valor:");
                        urlAmount = capturar.nextDouble();

                        moeda.converterMoeda(urlBaseCode, urlTargetCode, urlAmount);
                        break;
                    case 6:
                        urlBaseCode = "COP";
                        urlTargetCode = "USD";
                        System.out.println("Escolha um valor:");
                        urlAmount = capturar.nextDouble();

                        moeda.converterMoeda(urlBaseCode, urlTargetCode, urlAmount);
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("\nInsira uma opção válido!\n");
                }
            } catch (NullPointerException | IllegalArgumentException | InputMismatchException e) {
                System.out.println("\n\n*** Formato inválido! Por favor, insira um número com ponto flutuante. ***\n\n");
                capturar.nextLine();
            } catch (FileNotFoundException er) {
                System.out.println("\n\n*** Formato aceitável de no máximo 7 caracteres. ***\n\n");
            }
        }
    }
}
