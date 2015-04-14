
import br.edu.utfpr.controller.ModificadoresAcesso;
import br.edu.utfpr.entity.Livro;
import br.edu.utfpr.entity.Quadrado;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

// Primeiro programa em Java
public class Principal {
	
    /**
     * Meu primeiro programa em Java
     */
    public static void main(String[] args) {
        // Formas de apresentar mensagens
//        apresentarMensagens();
        
        // Forma de solicitar ao usuário algum valor utilizando a classe Scanner
//        solicitarValorScanner();
        
        // Forma de solicitar ao usuário algum valor utilizando a classe JOptionPainel
//        solicitarValorJOptionPainel();
        
        // Formas de utilização de operadores aritméticos
//        utilizarOperadoresAritmeticos();
        
        // Formas de utilizar operadores de igualdade e operadores relacionais
//        utilizarOperadoresIgualdadeERelacionais();
        
        // Operadores de incremento e decremento
//        operadoresIncrementoDecremento();
        
        // Formas de efetuar casting de variáveis em Java
//        castingVariavel();
        
        // Utilizando vetores
//        utilizandoArraySimples();
//        utilizandoArrayMultidimencional();
        
        // Utilização de Classes Warappers
//        classesWrappers();
        
        // Manipulando Datas
//        manipulandoData();
        
        // Instruções de controle no Java
//        instrucoesControle();
        
        // Classe carro
//        execucaoClasseCarro();
        
        // Classe livro
//        execucaoClasseLivro();
        
        // Classe quadrado
//        execucaoClasseQuadrado();
        
        // Variaveis de referencia
//        execucaoVariaveisReferencia();
        
        // Modificadores de Acesso
        modificadoresAcesso();
        
    }
    
    private static void apresentarMensagens() {
        // Apresenta a mensagem "Bem vindo a UTFPR!" normal
        System.out.println("Bem vindo na UTFPR!");
        
        // Apresenta a mensagem "Bem vindo a UTFPR!" com enter em cada espaço
        System.out.println("Bem\nvindo\na\nUTFPR!");
        
        // Apresenta a mensagem "Bem vindo a UTFPR!" com tabulação em cada espaço
        System.out.println("Bem\tvindo\ta\tUTFPR!");
        
        // Apresenta a mensagem "Bem vindo a UTFPR!" entre aspas
        System.out.println("\"Bem vindo a UTFPR!\"");
        
        // Apresenta a mensagem "Bem vindo a UTFPR!" entre aspas simples
        System.out.println("\'Bem vindo a UTFPR!\'");
        
        // Apresenta a mensagem "Bem vindo a UTFPR!" com um formatador e com um enter após a letra "a" da mensagem de acordo com a máscara
        System.out.printf("%s\n%s\n", "Bem vindo a", "UTFPR!");
    }
    
    private static void solicitarValorScanner() {
        int primeiroNumero = 0; // Armazena o valor do primeiro número digitado
        int segundoNumero = 0; // Armazena o valor do segundo número digitado
        int soma = 0; // Armazena o valor da soma dos números digitados
        
        // Cria a classe para receber os valores informados pelo usuário
        Scanner entrada = new Scanner( System.in );
        
        // Apresenta a mensagem solicitando ao usuário que informe o primeiro número
        System.out.println("Informe o Primeiro número: ");
        // Recebe o valor informado
        primeiroNumero = entrada.nextInt();
        
        // Apresenta a mensagem solicitando ao usuário que informe o segundo número
        System.out.println("Informe o Segundo número: ");
        // Recebe o valor informado
        segundoNumero = entrada.nextInt();
        
        // Efetua o cálculo da soma dos valores
        soma = primeiroNumero + segundoNumero;
        
        // Apresenta o valor da Soma
        System.out.printf("O valor da soma é: %d\n", soma);
    }
    
    private static void solicitarValorJOptionPainel() {
        String nome = "";
        String mensagem = "";
        
        nome = JOptionPane.showInputDialog("Informe seu nome");
        
        mensagem = "Seu nome é " + nome;
        
        JOptionPane.showMessageDialog(null, mensagem);
    }

    private static void utilizarOperadoresAritmeticos() {
        int primeiroNumero = 10; // Armazena o valor 10 para o primeiro número
        int segundoNumero = 2; // Armazena o valor 10 para o segundo número
        int resultado = 0; // Armazena do resultado da operação
        
        // Forma de adição
        resultado = primeiroNumero + segundoNumero;
        
        //Apresenta o resultado da adição
        System.out.printf("Resultado da adição = %d\n", resultado);
        
        
        // Forma de subtração
        resultado = primeiroNumero - segundoNumero;
        
        //Apresenta o resultado da subtração
        System.out.printf("Resultado da subtração = %d\n", resultado);
        
        
        // Forma de multiplicação
        resultado = primeiroNumero * segundoNumero;
        
        //Apresenta o resultado da multiplicação
        System.out.printf("Resultado da multiplicação = %d\n", resultado);
        
        
        // Forma de divisão
        resultado = primeiroNumero / segundoNumero;
        
        //Apresenta o resultado da divisão
        System.out.printf("Resultado da divisão = %d\n", resultado);
        
        
        // Forma de resto
        resultado = primeiroNumero % segundoNumero;
        
        //Apresenta o resultado do resto da divisão
        System.out.printf("Resultado do resto da divisão = %d\n", resultado);
        
    }

    private static void utilizarOperadoresIgualdadeERelacionais() {
        int primeiroNumero = 0; // Armazena o valor do primeiro número digitado
        int segundoNumero = 0; // Armazena o valor do segundo número digitado
        
        // Cria a classe para receber os valores informados pelo usuário
        Scanner entrada = new Scanner( System.in );
        
        // Apresenta a mensagem solicitando ao usuário que informe o primeiro número
        System.out.println("Informe o Primeiro número: ");
        // Recebe o valor informado
        primeiroNumero = entrada.nextInt();
        
        // Apresenta a mensagem solicitando ao usuário que informe o segundo número
        System.out.println("Informe o Segundo número: ");
        // Recebe o valor informado
        segundoNumero = entrada.nextInt();
        
        // Efetua o teste se o primeiro número é igual ao segundo número
        if (primeiroNumero == segundoNumero) {
            System.out.printf("%d == %d\n", primeiroNumero, segundoNumero);
        }
        
        // Efetua o teste se o primeiro número é diferente do segundo número
        if (primeiroNumero != segundoNumero) {
            System.out.printf("%d != %d\n", primeiroNumero, segundoNumero);
        }
        
        // Efetua o teste se o primeiro número é menor que o segundo número
        if (primeiroNumero < segundoNumero) {
            System.out.printf("%d < %d\n", primeiroNumero, segundoNumero);
        }
        
        // Efetua o teste se o primeiro número é maior que o segundo número
        if (primeiroNumero > segundoNumero) {
            System.out.printf("%d > %d\n", primeiroNumero, segundoNumero);
        }
        
        // Efetua o teste se o primeiro número é menor ou igual ao segundo número
        if (primeiroNumero <= segundoNumero) {
            System.out.printf("%d <= %d\n", primeiroNumero, segundoNumero);
        }
        
        // Efetua o teste se o primeiro número é maior ou igual ao segundo número
        if (primeiroNumero >= segundoNumero) {
            System.out.printf("%d >= %d\n", primeiroNumero, segundoNumero);
        }
    }
    
    private static void operadoresIncrementoDecremento() {
        int i = 10;
        int j = 3;
        int k = 0;
        k = ++j + i; //resultará em k = 4+10 = 14
        
        System.out.println("O valor de j é: " + j);
        System.out.println("O valor de k é: " + k);
        
        k = j++ + i; //resultará em k = 3+10 = 13
        
        System.out.println("O valor de j é: " + j);
        System.out.println("O valor de k é: " + k);
        
        k++;
        System.out.println("O valor de k é: " + k);
    }
    
    private static void castingVariavel() {
        String textoNumerico = "123";
        int numeroConvertido = 0;
        String texto = "";
        double numeroPontoFlutuante = 0;
        int numeroInteroComoPontoFlutuante = 0;
        
        // Transforam o texto numérico para o tipo de variável númerico
        numeroConvertido = Integer.parseInt(textoNumerico);
        
        // Apresenta o valor da variável numeroConvertido
        System.out.println("Valor do número convertido: " + numeroConvertido);
        
        // Transforma o valor numério para o tipo de váriável texto
        texto = String.valueOf(numeroConvertido);
        
        // Apresenta o valor da variável texto
        System.out.println("Valor do texto convertido: " + texto);
        
        // Atribui para a variável numeroPontoFlutuante o valor de 3.14
        numeroPontoFlutuante = 3.14;
        
        // Transforma o valor da variável numeroPontoFlutuante em um número inteiro ficando somente com o valor de 3
        numeroInteroComoPontoFlutuante = (int) numeroPontoFlutuante;
        
        // Apresenta o valor da variável do número inteiro como ponto flutuante
        System.out.println("Valor do número inteiro convertido de um ponto flutuante convertido: " + numeroInteroComoPontoFlutuante);
        
    }
    
    private static void utilizandoArraySimples() {
        // Declara a variável de array 
        int[] arrayInteiros;
        int soma = 0;
        int divisao = 0;
        int[] outroArrayInteiros;
        final int TAMANHO_DO_ARRAY = 10;
        int posicao = 0;
        
        // cria o array e atribui à variável de array de inteiros com o tamanho ou a quantidade de posições
        arrayInteiros = new int[12];
        
        // Atribui para cada posição do array de inteiros um valor;
        arrayInteiros[0] = -45;
        arrayInteiros[1] = 6;
        arrayInteiros[2] = 0;
        arrayInteiros[3] = 72;
        arrayInteiros[4] = 1543;
        arrayInteiros[5] = -89;
        arrayInteiros[6] = 0;
        arrayInteiros[7] = 62;
        arrayInteiros[8] = -3;
        arrayInteiros[9] = 1;
        arrayInteiros[10] = 6453;
        arrayInteiros[11] = 78;
        
        // Efetua o calculo da soma das 3 primeiras posições do array de inteiros
        soma = arrayInteiros[0] + arrayInteiros[1] + arrayInteiros[2];
        
        // Efetua o calculo da divisão da sétima posição do array de inteiros por dois
        divisao = arrayInteiros[7] / 2;
        
        // Apresenta o resultado da soma das 3 primeiras posições do array de inteiros
        System.out.println("Resultado da soma: " + soma);
        
        // Apresenta o resultado da divisão da sétima posição do array de inteiros por dois
        System.out.println("Resultado da divisão: " + divisao);
        
        // Outra forma de criar um array com um inicializador
        String[] arrayTexto = { "posição 0", "posição 1", "posição 2" };
        
        // Apresenta todas as posições do array de inteiros
        for (int posicaoCorrenteArray = 0; posicaoCorrenteArray < arrayInteiros.length; posicaoCorrenteArray++) {
            System.out.println("Forma de apresentação simples sendo o valor na posição " + posicaoCorrenteArray + " recebe o valor = " + arrayInteiros[posicaoCorrenteArray]);
        }
        
        System.out.println("----------------------------------------------------------------");
        
        // Outra forma aprimorada de apresentar todas as posiçõesdo array de inteiros
        for (int valorCorrente : arrayInteiros) {
            System.out.println("Forma de apresentação aprimorada sendo o valor na posição " + posicao + " recebe o valor = " + valorCorrente);
            posicao++;
        }
        
        // Outra forma de boas práticas de programação é usar uma constante para definir o tamanho do array
        outroArrayInteiros = new int[TAMANHO_DO_ARRAY];
    }

    private static void utilizandoArrayMultidimencional() {
        // Declara o array sendo nomeArray[linha][coluna]
        int[][] arrayInteiros;
        
        // Este array vai possuir 2 linhas
        arrayInteiros = new int[2][];
        
        // Define que na linha 0 vai conter 5 colunas
        arrayInteiros[0] = new int[5];
        // Define que na linha 1 vai conter 3 colunas
        arrayInteiros[1] = new int[3];
        
        // Outra forma de declarar um array com inicializadores com 2 linhas sendo a primeira linha com 2 colunas e a segunda com 3 colunas
        int[][] arrayInteirosInicializadores = { { 1, 2 }, { 3, 4, 5 } };
        
        // Outra forma de declaração de array com valores estáticos com 3 linhas e 4 colunas
        int[][] arrayValoresEstaticos = new int[3][4];
        
        // Apresentando os dados de um array 
        // Primeiro for percorre as linhas
        for (int linha = 0; linha < arrayInteirosInicializadores.length; linha++) {
            // Segundo for percorre as colunas
            for (int coluna = 0; coluna < arrayInteirosInicializadores[linha].length; coluna++) {
                System.out.printf("%d ", arrayInteirosInicializadores[linha][coluna]);
            }
            // Pula a linha executa a ação de um enter para continuar a apresentação
            System.out.println("");
        }
    }
    
    private static void classesWrappers() {
        String textoNumeroInteiro = "9822"; // Variável do tipo texto recebendo um valor inteiro
         
        // Representação em Classes Wrappers recebendo valores do tipo texto quando estão sendo inicializadas
        Float floatString = new Float("500.50");
        Integer integerString = new Integer(textoNumeroInteiro);
        Double doubleString = new Double("512.22");
         
        // O argumento somente aceita do tipo char, por isso que é usado aspas simples
        Character characterWrapper = new Character('a');
         
        // Criação do tipo primitivo natural
        Float floatPrimitivo = new Float(500.50);
        Integer integerPrimitivo = new Integer(2800);
        Double doublePrimitivo = new Double(512.22);
        
        // Apresenta a mensagem do valor de uma variável do tipo Float que recebeu o valor string
        System.out.println("Float representado por string: " + floatString);
        
        // Apresenta a mensagem do valor de uma variável do tipo Float que recebeu o valor primitivo
        System.out.println("Float natural: " + floatPrimitivo);
        
        // Apresenta a mensagem do valor de uma variável do tipo inteiro que recebeu o valor de uma string
        System.out.println("Integer representado por string: " + integerString);
        
        // Apresenta a mensagem do valor de uma variável do tipo Character
        System.out.println("Char: " + characterWrapper);

        System.out.println("===================================================================");
        
        // Conversão de valores utilizando as Classes Wrappers
        Integer velocidade = new Integer(587); // Variável que tipo inteiro de uma classe wrapper
         
        // Converte a variável velocidade para tipo primitivo
        int totalInt = velocidade.intValue();
        double totalDouble = velocidade.doubleValue();
        short totalShort = velocidade.shortValue();
        byte totalByte = velocidade.byteValue();
         
        // Conversão de ponto flutuante para inteiro usando a classe wrapper
        Double pontoFlutuante = new Double(3.14); // Variável que armazena o valor de um ponto flutuante do tipo double
        int valorConvertido = pontoFlutuante.intValue(); // Variável do tipo inteiro recebendo o valor da variável de ponto flutuante
        
        // Apresenta a mensagem do valor inteiro convertido do valor do ponto flutuante
        System.out.println("O valor do inteiro do ponto flutuante é: " + valorConvertido);
        
        System.out.println("===================================================================");
        
        // Classe Wrapper Booleana
        Boolean valorBooleanoStringMinusculo = new Boolean("true");
        Boolean valorBooleanoStringMaiusculo = new Boolean("FALSE");
        Boolean valorBooleanoPrimitivo = new Boolean(true);
        String valorBooleano = "true"; // Variável do tipo texto que armazena um valor booleno
        Boolean valorBooleanoVariavelTexto = new Boolean(valorBooleano);
        
        // Apresenta a mensgem do valor da variável booleana com texto em minusculo
        System.out.println("Valor da variável booleana com texto em minusculo: " + valorBooleanoStringMinusculo);
        
        // Apresenta a mensgem do valor da variável booleana com o texto em maiusculo
        System.out.println("Valor da variável booleana com o texto em maiusculo: " + valorBooleanoStringMaiusculo);
        
        // Apresenta a mensgem do valor da variável booleana com valor primitivo
        System.out.println("Valor da variável booleana com valor primitivo: " + valorBooleanoPrimitivo);
        
        // Apresenta a mensgem do valor da variável booleana que recebeu valor de uma variável do tipo texto
        System.out.println("Valor da variável booleana que recebeu valor de uma variável do tipo texto: " + valorBooleanoVariavelTexto);
        
    }
    
    private static void manipulandoData(){
        try {
            Date dataDate = new Date(); // Cria uma variável do tipo Date que armazena os valores contidos em uma determinada data e atribui a ela a data atual
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy"); // Cria um formatador de datas de acordo com a mascara que é passada
            Date minhaDataDate = format.parse("13-06-2017"); // Cria variável do tipo data com um valor definido
             
            // Apresenta a variável data sem formatação
            System.out.println("Data e hora atual sem formatação: " + dataDate.toString());
            
            // Apresenta a variável data com formatação
            System.out.println("Data e hora atual com formatação: " + format.format(dataDate));
            
            // Apresenta a data criada com a formatação
            System.out.println("Minha data e hora atual com formatação: " + format.format(minhaDataDate));

            System.out.println("================================================================");

            Calendar dataCalendar = Calendar.getInstance(); // Cria uma variável do tipo Calendar que armazena os valores contidos em uma determinada data e atribui a ela a data atual

            // Apresenta a variável data sem formatação
            System.out.println("Data e hora atual: " + dataCalendar.getTime());

            Date dataAtual = new Date(); // Cria uma variável do tipo Date armazenando a data atual
            Calendar calendar = Calendar.getInstance(); // Cria uma variaável do tipo Calendar que armazena a data atual

            // Atribui para a variável calendar o valor contido na variável dataAtual
            calendar.setTime(dataAtual);

            DateFormat formatador = DateFormat.getDateInstance(DateFormat.MEDIUM); // Cria um formatador de datas de acordo com o tipo da formatação que é passada
            /*
            Dateformat.SHORT // 03/04/10
            Dateformat.MEDIUM // 03/04/2010
            Dateformat.LONG //3 de Abril de 2010
            Dateformat.FULL //Sábado, 3 de Abril de 2010
            */

            // Apresenta a variável calendar formatada
            System.out.println("Data atual formatada: " + formatador.format(calendar.getTime()) );
            
            // Atribui para a variável calendar o valor definido
            calendar.setTime(formatador.parse("28/04/2015"));
            
            // Apresenta o novo valor da variável calendar formatada
            System.out.println("Novo valor da variável com a data formatada: " + formatador.format(calendar.getTime()) );
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void instrucoesControle() {
        // Instruções de seleções
        System.out.println("==================== Instruções de seleções ====================");
        int notaAluno = 7; // Atribui para a variável o valor da nota do aluno
        
        // Instrução de seleção única if
        System.out.println("Instrução de seleção única \"if\"");
        
        if (notaAluno >= 6) {
            System.out.println("O aluno está aprovado!");
        }
        
        // Instrução de seleção dupla if ... else
        System.out.println("Instrução de seleção dupla \"if\" ... \"else\"");
        
        if (notaAluno >= 6) {
            System.out.println("O aluno está aprovado!");
        } else {
            System.out.println("O aluno está reprovado!");
        }

        // Instrução de seleção dupla if ... else aninhado
        System.out.println("Instrução de seleção dupla \"if\" ... \"else\" aninhado");
        
        if (notaAluno >= 6) {
            System.out.println("O aluno está aprovado!");
        } else if (notaAluno <= 0) {
            System.out.println("O aluno está reprovado!");
        } else {
            System.out.println("O aluno está em recuperação!");
        }
        
        // Instrução de seleção condicional ?:
        System.out.println("Instrução de seleção condicional \"?:\"");
        
        // Também conhecido como if ternário
        String statusAluno = ((notaAluno >= 6) ? "aprovado" : "reprovado");
        
        System.out.println("O valor de está " + statusAluno + "!");
        
        // Instrução de seleção múltipla switch
        System.out.println("Instrução de seleção múltipla \"switch\"");
        
        switch (notaAluno) {
            case 6 : {
                System.out.println("Passou com média 6!");
                break;
            }
            
            case 7 : {
                System.out.println("Passou com média 7!");
                break;
            }
            
            case 8 : {
                System.out.println("Passou com média 8!");
                break;
            }
            
            case 9 : {
                System.out.println("Passou com média 9!");
                break;
            }
            
            case 10 : {
                System.out.println("Passou com média 10!");
                break;
            }
            
            default : {
                System.out.println("Aluno está reprovado ou em recuperação!");
                break;
            }
        }
        
        // Instruções de repetições
        System.out.println("==================== Instruções de repetições ====================");
        
        // Instrução de repetição while
        System.out.println("Instrução de repetição \"while\"");
        int valorCorrente = 0; // Atribui um valor inteiro para a variável que vai percorrer a instrução de repetição
        
        while (valorCorrente <= 10) {
            System.out.println("Valor da variável valorCorrente percorrendo o while: " + valorCorrente);
            valorCorrente++;
        }
        
        // Instrução de repetição do ... while
        System.out.println("Instrução de repetição \"do ... while\"");
        valorCorrente = 0; // Atribui valor 0 novamente para a variável que vai percorrer a instrução de repetição
        
        do {
            System.out.println("Valor da variável valorCorrente percorrendo o do ... while: " + valorCorrente);
            valorCorrente++;
        } while (valorCorrente <= 10);
        
        // Instrução de repetição for
        System.out.println("Instrução de repetição \"for\"");
        
        for (int corrente = 0; corrente <= 10; corrente++) {
            System.out.println("Valor da variável corrente percorrendo o for normal: " + corrente);
        }
        
        // Instrução de repetição foreach
        System.out.println("Instrução de repetição \"foreach\"");
        String[] listaFrutas = { "maçã", "laranja", "uva", "manga", "pera" }; // Cria um array ou vetor do tipo texto e atribui para esta lista algumas frutas
        
        for (String fruta : listaFrutas) {
            System.out.println("O valor da fruta corrente é: " + fruta);
        }
        
        // Instruções de interrupções
        System.out.println("==================== Instruções de interrupções ====================");
        
        // Instrução de interrupção break unlabeled
        System.out.println("Instrução de interrupção \"break unlabeled\"");
        
        for (int contador = 1; contador <= 10; contador++) {
            if (contador == 5) {
                break; // Para a execução da lista
            }
            
            System.out.println("Valor corrente da variável contado: " + contador);
        }
        
        // Instrução de interrupção unlabeled continue
        System.out.println("Instrução de interrupção \"unlabeled continue\"");
        
        for (int contador = 1; contador <= 10; contador++) {
            if (contador == 5) {
                continue; // Pula para o próximo da lista
            }
            
            System.out.println("Valor corrente da variável contado: " + contador);
        }
        
        // Instrução de interrupção labeled break
        System.out.println("Instrução de interrupção \"labeled break\"");
        // Declaração de um array com inicializadores com 2 linhas sendo a primeira linha com 2 colunas e a segunda com 3 colunas
        int[][] arrayInteirosInicializadores = { { 1, 2 }, { 3, 4, 5 } };
        
        // Primeiro for percorre as linhas
        retornaAqui: for (int linha = 0; linha < arrayInteirosInicializadores.length; linha++) {
            // Segundo for percorre as colunas
            for (int coluna = 0; coluna < arrayInteirosInicializadores[linha].length; coluna++) {
                System.out.printf("%d ", arrayInteirosInicializadores[linha][coluna]);
                if (coluna == 1) {
                    break retornaAqui; // Para o for onde está declarada a label
                }
            }
            // Pula a linha executa a ação de um enter para continuar a apresentação
            System.out.println("");
        }
        
        // Instrução de interrupção labeled continue 
        System.out.println("Instrução de interrupção \"labeled continue\"");
        retornaAqui: for (int linha = 0; linha < arrayInteirosInicializadores.length; linha++) {
            // Segundo for percorre as colunas
            for (int coluna = 0; coluna < arrayInteirosInicializadores[linha].length; coluna++) {
                System.out.printf("%d ", arrayInteirosInicializadores[linha][coluna]);
                if (coluna == 1) {
                    continue retornaAqui; // Retorna para a linha onde esta declarada a label
                }
            }
            // Pula a linha executa a ação de um enter para continuar a apresentação
            System.out.println("");
        }
    }

    private static void execucaoClasseCarro() {
        // Cria a instância de classe da classe Carro passando 3 parâmetro para o construtor
        Carro carroExemplo = new Carro("Ford", 2015, "Fusion");
        
        // Apresenta o valor atribuido para o atributo de classe "marca" da classe Carro utilizando o método de acesso do encapsulamento
        System.out.println("Valor do atributo marca: " +
                carroExemplo.getMarca());
        
        // Altera o valor do atributo de classe "marca" da classe Carro utilizando o método de modificação do encapsulamento
        carroExemplo.setMarca("Tesla");
        
        // Apresenta novamente o valor alterado do atribuido de classe "marca" da classe Carro utilizando o método de acesso do encapsulamento
        System.out.println("Valor do atributo alterado marca: " +
                carroExemplo.getMarca());
    }
    
    private static void execucaoClasseLivro() {
        // Cria a instância de classe da classe Livro utilizando um construtor que recebe 1 parâmetro do tipo String
        Livro livroJava = new Livro("C como programar");
        
        // Efetua a chamada para o método que apresenta o valor armazenado no atributo de classe "nome" da classe Livro
        livroJava.apresentaMensagem();
        
        // Altera o valor do atributo de classe "nome" da classe Livro utilizando o método de modificação do encapsulamento
        livroJava.setNome("Java como programar");
        
        // Apresenta novamente o valor alterado do atribuido de classe "nome" da classe Livro utilizando o método de acesso do encapsulamento
        livroJava.apresentaMensagem();
        
        // Outra forma de apresentar o valor do atribuido de classe "nome" da classe Livro utilizando o método de acesso do encapsulamento
        System.out.println("Valor do atributo é: " + livroJava.getNome());
        
        // Instância outro objeto de classe Livro utlizando o contrutor padrão
        Livro livroPython = new Livro();
        
        // Atribui o valor para atributo de classe "nome" da classe Livro utilizando o método de modificação do encapsulamento
        livroPython.setNome("Python como programar");
        
        // Efetua a chamada para o método que apresenta o valor armazenado no atributo de classe "nome" da classe Livro
        livroPython.apresentaMensagem();
        
    }
    
    private static void execucaoClasseQuadrado() {
        // Cria a instância de classe da classe Quadrado
        Quadrado quadrado = new Quadrado();
        
        // Atribui o valor para atributo de classe "ladoA" da classe Quadrado utilizando o método de modificação do encapsulamento
        quadrado.setLadoA(2);
        
        // Atribui o valor para atributo de classe "ladoB" da classe Quadrado utilizando o método de modificação do encapsulamento
        quadrado.setLadoB(2);
        
        // Efetua a execução do método que efetua o cálculo da Area do quadrado e armazena o valor do cálculo em um atributo de classe 
        quadrado.calcularArea();
        
        // Efetua a apresentação do valor armazenado no atributo de classe "area" da classe Quadrado
        quadrado.apresentarArea();
        
        // Efetua a execução do método que efetua o cálculo do Perimetro do quadrado e armazena o valor do cálculo em um atributo de classe 
        quadrado.calcularPerimetro();
        
        // Efetua a apresentação do valor armazenado no atributo de classe "perimetro" da classe Quadrado
        quadrado.apresentarPerimetro();
        
        // Efetua a apresentação do valor armazenado no atributo de classe "area" e "perimetro" da classe Quadrado
        quadrado.apresentarAreaPerimetro();
    }

    private static void execucaoVariaveisReferencia() {
        /********** Execução de tipos primitivos e tipos por referência *********/
        
        // Instância a classe Livro
        Livro l = new Livro();
        
        // Apresenta o valor do atributo de clase "nome" porém como não tem valor ainda retornará nulo
        // Exemplo de referência nula
        System.out.println("valor nome é: " + l.getNome());
        
        // Os tipos primitivos são boolean, byte, char, short, int, long, float, e double
        // Estes tipos de variáveis podem armazenar exatamente um valor de seu tipo declarado por vez
        // Quando outro valor é atribuído para essa variável, seu valor será substituido
        // As variáveis dos tipos byte, char, short, int, long, float e double são inicializadas como 0
        // As variáveis do tipo boolean são inicializadas como false
        // LEMBRETE: As variáveis locais NÃO são inicializadas por padrão
        int valor = 5;
        System.out.println("Antes do método valor=" + valor);
        valor = retornaInteiro(10);
        System.out.println("Depois do método valor=" + valor);
        
        
        // Os tipos por referência são utilizadas por objetos
        // Os programas utilizam as variáveis de tipos por referência para armazenar as localizações de objetos na memória do computador
        // As variáveis de instâncias de tipo por referência são inicializadas por padrão com valro null - uma palavra reservada que representa "referência a nada"
        Quadrado quadrado = new Quadrado();
        retornoObjeto(quadrado);
        System.out.println("Objeto ladoA=" + quadrado.getLadoA());
    }
    
    private static int retornaInteiro(int valor) {
        return valor + 1;
    }
    
    private static void retornoObjeto(Quadrado q) {
        q.setLadoA(13.0);
    }

    private static void modificadoresAcesso() {
        // Cria a intância da classe para acessar os métodos
        ModificadoresAcesso modificadoresAcesso = new ModificadoresAcesso();
        modificadoresAcesso.metodoPublicoStatico();
        modificadoresAcesso.metodoPublicNoStatic();
        
        // Acessa direto os métodos estáticos da classe
        ModificadoresAcesso.metodoPublicoStatico();
    }
}









