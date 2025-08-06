package biblioteca_matematica;

/**
 * Biblioteca de Métodos
 *
 * Professora: Lucia Giraffa
 * Alunos: Felipe Nicolau Perides, Bernardo Tarnowski Dallarosa
 * Turma: 10
 * @version (3.0)
 */

public class MetodosMatematica {
    //Fórmulas Matemáticas
    public static double areaCirculo(double raio){
        double aux = Math.PI*Math.pow(raio,2);
        return aux;
    }
    public static double areaTrianguloEqui(double lado){
        double aux = Math.pow(lado, 2) * Math.sqrt(3)/4;
        return aux;
    }
    public static double areaHexagono(double lado){
        double aux = 6 * Math.pow(lado, 2) * Math.sqrt(3)/4;
        return aux;
    }
    public static double areaLosango(double diam1, double diam2){
        double aux = diam1 * diam2/2;
        return aux;
    }
    public static double areaTrapezio(double baseMaior, double baseMenor,double altura){
        double aux = (baseMaior + baseMenor) * altura/2;
        return aux;
    }
    public static double supEsfera(double raio){
        double aux = 4*Math.PI*Math.pow(raio,2);
        return aux;
    }
    public static double supCubo(double lado, double altura){
        double aux = 6*Math.pow(lado,2);
        return aux;
    }
    public static double supPrisma(double comp, double larg, double alt){
        double aux = (2*(larg*comp))+(2*(comp*alt))+(2*(alt*larg));
        return aux;
    }
    public double superficiePiramide(double ladobase1,double ladobase2,double altura){
        double m = ladobase1/2, g = Math.sqrt(Math.pow(m,2)+Math.pow(altura,2));
        double Ab = (ladobase1*ladobase2), Al = 4*((g*ladobase1)/2);
        return Ab+Al;
    }
    public static double supCilindro(double raio, double altura){
        double aux = (2*Math.PI*raio*altura)+(2*Math.PI*Math.pow(raio,2));
        return aux;
    }
    public static double circunferencia(double raio){
        double aux = 2*Math.PI*raio;
        return aux;
    }
    public double volumePiramide(double ladobase1,double ladobase2,double altura){
        double Vol = (ladobase1*ladobase2*altura)/3;
        return Vol;
    }
    public static double volumeCilindro(double raio, double altura){
        double aux = areaCirculo(raio)*altura;
        return aux;
    }
    public static double volumeCone (double raio, double altura){
        double aux = Math.PI * Math.pow(raio, 2) * altura/3;
        return aux;
    }
    public static double volumeCubo (double lado){
        double aux = Math.pow(lado, 3);
        return aux;
    }
    public static double volumeEsfera(double raio){
        double aux = (4*Math.PI*Math.pow(raio,3))/3;
        return aux;
    }
    public static double volumeParal(double comprimento, double largura, double altura){
        double aux = comprimento*altura*largura;
        return aux;
    }
    //Par ou Ímpar
    public static boolean testePar2(int valor){
        if (valor % 2 == 0){return true;}
        else {return false;}
    }
    //Divisor ou Múltiplo
    public static boolean testeDivMulti(int valor1, int valor2){
        if (valor1 % valor2 == 0){return true;}
        else {return false;}
    }
    //Verificação de um triângulo
    public static boolean triangulo(double x, double y, double z){
        boolean aux = false;
        if ((x<(y+z))&&(x>Math.abs(y-z))) {aux=true;}
        if ((y<(x+z))&&(y>Math.abs(x-z))) {aux=true;}
        if ((z<(x+y))&&(z>Math.abs(x-y))) {aux=true;}
        return aux;
    }
    //Maior e Menor
    public static double maior(double a, double b, double c){ //Entre 3 números
        double maior=0;
        if(a>b&&a>c){maior=a;}else if(a>b&&a<c){maior=c;}else if(a<b&&a>c){maior=b;}
        return maior;
    }
    public static double menor(double a, double b, double c){  //Entre 3 números
        double menor=0;
        if(a<b&&a<c){menor=a;}else if(a<b&&a>c){menor=c;}else if(a>b&&a<c){menor=b;}
        return menor;
    }
    //3025 --> 30+25=55 --> 55² = 3025
    public static void especial(int x){
        if((x>=1000) && (x<= 9999)){
            int aux = x/100, resto1 = x%100;
            int aux2 = resto1;
            int a = aux+aux2;
            if(Math.pow(a,2)==x){System.out.println("O número "+x+" possui uma característica especial na qual ao separá-lo em dois algarismos e somá-los, seu quadrado será igual ao número inicial!");
            } else {System.out.println("O número "+x+" não possui a característica especial na qual ao separá-lo em dois algarismos e somá-los, seu quadrado será igual ao número inicial!");}
        }
    }
    //Capícuo
    public static boolean capicuo(int x){
        int dezena1 = x/1000, unidade1 = (x%1000)/100;
        int dezena2 = (x%1000)/100, unidade2 = x%10;
        if(dezena1 == unidade2 && unidade1 == dezena2){return true;} else {return false;}
    }
    //Número ao contrário
    public static void contrario(int x){
        int a = 0;
        while(x>0){a *= 10; a += (x%10); x /= 10;}
        System.out.println("O número escolhido é igual a "+a+" quando invertido.");
    }
    //retorna um array com os 3 números ordenados em ordem crescente
    public static void ordenaTresCrescente(int a, int b, int c){
        Integer[] Ordem = {a,b,c};
        Arrays.sort(Ordem);
        System.out.println(Arrays.toString(Ordem));
    }
    //retorna um array com os 3 números ordenados em ordem decrescente
    public static void ordenaTresDecrescente(int a, int b, int c){
        Integer[] Ordem = {a,b,c};
        Arrays.sort(Ordem, Collections.reverseOrder());
        System.out.println(Arrays.toString(Ordem));
    }
    //Quantidade de divisores e a soma desses valores
    public static int quantiDiv(int valor){
        int antecessor=1;
        int contador=0;
        while(antecessor<=valor){
            if(valor%antecessor==0)
                                {
                                    contador++;
                                }
            antecessor++;
        }
        return contador;
    }
    public static int SomaDiv(int valor){
        int antecessor=1;
        int soma=0;
        while(antecessor<=valor){
            if(valor%antecessor==0)
                                {
                                    soma=soma+antecessor;
                                }
            antecessor++;
        }
        return soma;
    }
    //Número Primo
    public static boolean numeroPrimo(int num){
        if(num<=1){
            return false;
        }
        for(int i = 2; i < Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    //verifica se um número é um "número amigo"
    public static boolean numeroAmigo(int num1, int num2){
        boolean a = true;
        if(SomaDiv(num1)==num2&&SomaDiv(num2)==num1){
            a = true;
        }else{a = false;}
        return a;
    }
    //verifica se um número é perfeito.
    public static boolean numeroPerfeito(int num){
        if(SomaDiv(num)==num){
            return true;
        }else{return false;}
    }
    //verifica se um número é defectivo.
    public static boolean numeroDefectivo(int num){
        if(SomaDiv(num)<num){
            return true;
        }else{return false;}
    }
    //verifica se um número é abundante
    public static boolean numeroAbundante(int num){
       if(SomaDiv(num)>num){
            return true;
        }else{return false;}
    }
    //Divisor Simples
    public static boolean DivSimples(int num1, int num2){
        if(num1%num2==0){return true;}else{return false;}
    }
    //Primos entre si
    public static boolean PrimosEntreSi(int a, int b){
        boolean ans = true;
        if(mdc(a,b)==1){
            ans = true;
        }else{
            ans = false;
        }
        return ans;
    }
    //Máx.Div.Comum
    public static int Mdc(int a, int b) {
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static int mdc(int a, int b) {
        if (b == 0) {
			return a;
		} else {
			return mdc(b, a % b);
		}
    }
    //Mega Plus
    public static boolean MegaPlus(int valor){
        if(numeroPrimo(valor)&&valor>=100&&valor<=999){
            return true;
        }else{
            return false;
        }
    }
    //Ano bissexto
    public static boolean Bissexto(int ano){
        return (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);
    }
    //Diferença de tempo
    public static void horas(int hora, int minuto){
            Scanner teclado = new Scanner(System.in);
            System.out.println ("\n Digite  a hora de inicio  da partida"); int hora1=teclado.nextInt();
            System.out.println ("\n Digite  os minutos associados a hora  de inicio  da partida"); int min1=teclado.nextInt();
            System.out.println ("\n Digite  a hora de final  da partida"); int hora2=teclado.nextInt();
            System.out.println ("\n Digite  os minutos associados a hora  de fim  da partida"); int min2=teclado.nextInt();
            int total=24*60; int inicio= hora1*60+min1; int fim =hora2*60+min2; int diferenca=fim-inicio;
            if (diferenca > 0){hora=diferenca/60; minuto=diferenca%60; System.out.println("\n A partida durou: "+ hora+" horas e "+minuto+" minutos ");}
                else{hora= (total-inicio)+ fim; System.out.println("\n A partida durou: "+ (hora/60) +" horas e "+(hora%60)+" minutos");}
            teclado.close();
    }
    //Calendário com data e hora atuais
    public static void DataAtual(){
        System.out.print("\f");
        Calendar agora = Calendar.getInstance();
        System.out.println("Dia: "+agora.get(Calendar.DAY_OF_MONTH));
        System.out.println("Mês: "+(agora.get(Calendar.MONTH)+1));
        System.out.println("Ano: "+agora.get(Calendar.YEAR));

        System.out.println("Hora: "+agora.get(Calendar.HOUR));
        System.out.println("Minutos: "+agora.get(Calendar.MINUTE));
        System.out.println("Segundos: "+agora.get(Calendar.SECOND));

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(dateFormat.format(agora.getTime()));
    }
    public static String unidades(int valor){
        String aux = " ";
        switch(valor){
            case 1: aux = "um"; break;
            case 2: aux = "dois"; break;
            case 3: aux = "três"; break;
            case 4: aux="quatro";break;
            case 5: aux="cinco";break;
            case 6: aux="seis";break;
            case 7: aux="sete";break;
            case 8: aux="oito";break;
            case 9: aux="nove";break;
              default:;
        }
        return aux;
    }
    public static String dezenas(int valor){
        String aux = " ";
        switch (valor){
            case 1: aux = "onze";break;
            case 2: aux = "doze";break;
            case 3: aux = "treze";break;
            case 4: aux = "quatorze";break;
            case 5: aux = "quinze";break;
            case 6: aux = "dezesseis";break;
            case 7: aux = "dezessete";break;
            case 8: aux = "dezoito";break;
            case 9: aux = "dezenove";break;
            case 0: aux = "dez";break;
            default:;
        }
        return aux;
    }
    public static String Dezenas(int valor){
        String aux = " ";
        switch(valor){
            case 2: aux = "vinte";break;
            case 3: aux = "trinta";break;
            case 4: aux = "quarenta";break;
            case 5: aux = "cinquenta";break;
            case 6: aux = "sessenta";break;
            case 7: aux = "setenta";break;
            case 8: aux = "oitenta";break;
            case 9: aux = "noventa";break;
            default:;
        }
        return aux;
    }
}