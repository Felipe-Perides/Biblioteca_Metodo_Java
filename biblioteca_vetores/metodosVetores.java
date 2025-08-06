package biblioteca_vetores;

/**
 * Biblioteca de Métodos
 *
 * Professora: Lucia Giraffa
 * Alunos: Felipe Nicolau Perides, Bernardo Tarnowski Dallarosa
 * Turma: 10
 * @version (3.0)
 */

public class MetodosVetores {
    //Inverte o vetor
    public static int[] inverter(int[] vetor) {
        int[] invertido = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            invertido[i] = vetor[vetor.length - 1 - i];
        }
        return invertido;
    }

    //Substitui um valor por outro no vetor
    public static int[] substituir(int[] vetor, int valor, int novoValor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                vetor[i] = novoValor;
            }
        }
        return vetor;
    }

    //Conta a quantidade de elementos iguais a um valor
    public static int contar(int[] vetor, int valor) {
        int total = 0;
        for (int num : vetor) {
            if (num == valor) {
                total++;
            }
        }
        return total;
    }

    //Verifica se o vetor contém um determinado valor
    public static boolean contem(int[] vetor, int valor) {
        for (int num : vetor) {
            if (num == valor) {
                return true;
            }
        }
        return false;
    }

    //Imprime vetor inteiro
    public static void imprimeVint(int[] vetor){
        for (int element : vetor) {
        System.out.print(" [ "+element+" ] ");
        }
    }
    //Imprime vetor double
    public static void imprimeVdouble(double[] vetor){
        for (double element : vetor) {
        System.out.print(" [ "+element+" ] ");
        }
    }
    //Maior do vetor int
    public static int maior(int[] vetor) {
        int max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        return max;
    }
    //Maior do vetor double
    public static double maior(double[] vetor) {
        double max = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
        return max;
    }
    //Menor do vetor int
    public static int menor(int[] vetor) {
        int min = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];
            }
        }
        return min;
    }
    //Menor do vetor double
    public static double menor(double[] vetor) {
        double min = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];
            }
        }
        return min;
    }
    //Ordena vetor inteiro
    public static int[]ordena(int[]v){
        int tam = v.length;
        int aux = 0;
        for(int i=0; i<tam; i++){
        for(int j=i+1; j<tam; j++){
        if(v[j]<v[i]){aux=v[i]; v[i]=v[j]; v[j]=aux;}
           }
         }
        return v;
    }
    //Ordena vetor real
    public static double[]ordena(double[]v){
        int tam = v.length;
        double aux = 0;
        for(int i=0; i<tam; i++){
        for(int j=i+1; j<tam; j++){
        if(v[j]<v[i]){aux=v[i]; v[i]=v[j]; v[j]=aux;}
           }
         }
        return v;
    }
    //Soma de vetores inteiros
    public static int[] adicionaInt(int[] vetor1, int[] vetor2) {
        int tam = vetor1.length;
        int[] soma = new int[tam];
        for(int i=0; i<tam; i++){
            soma[i] = (vetor1[i]) + (vetor2[i]);
        }
        return soma;
    }
    //Soma de vetores reais
    public static double[] adicionaDouble(double[] vetor1, double[] vetor2) {
        int tam = vetor1.length;
        double[] soma = new double[tam];
        for(int i=0; i<tam; i++){
            soma[i] = (vetor1[i]) + (vetor2[i]);
        }
        return soma;
    }
    //Subtração de vetores inteiros
    public static int[] subtrai(int[] vetor1, int[] vetor2) {
        int tam = vetor1.length;
        int[] subtracao = new int[tam];
        for(int i=0; i<tam; i++){
            subtracao[i] = (vetor1[i]) - (vetor2[i]);
        }
        return subtracao;
    }
    //Subtração de vetores reais
    public static double[] subtrai(double[] vetor1, double[] vetor2) {
        int tam = vetor1.length;
        double[] subtracao = new double[tam];
        for(int i=0; i<tam; i++){
            subtracao[i] = (vetor1[i]) - (vetor2[i]);
        }
        return subtracao;
    }
    //Multiplicação de vetor por um int
    public static int[] multiplicado(int[] vetor, int multiplicador) {
        int tam = vetor.length;
        int[] novo = new int[tam];
        for(int i=0; i<tam; i++){
            novo[i] = (vetor[i]) * multiplicador;
        }
        return novo;
    }
    //Produto de dois vetores Int
    public static int[] prodVetorInt(int[] array1, int[] array2){
        if(array1.length<array2.length){
            int[] aux = array1;
            array1 = array2;
            array2 = aux;
        }
        for(int i = 0; i<array1.length;i++){
            array1[i] = array1[i]*array2[i];
        }
        return array1;
    }
    //Produto de dois vetores double
    public static double[] prodVetorDouble(double[] array1, double[] array2){
        if(array1.length<array2.length){
            double[] aux = array1;
            array1 = array2;
            array2 = aux;
        }
        for(int i = 0; i<array1.length;i++){
            array1[i] = array1[i]*array2[i];
        }
        return array1;
    }
    //Aumenta o vetor e adiciona maior valor
    public static double[] aumenta(double[] vetor){
        int tam=vetor.length;
        double[]novo=new double[tam+1];
        for(int i=0; i<tam; i++){
          novo[i]=vetor[i];
        }
          double aux = maior(vetor);
          novo[tam]=aux;
        return novo;
    }
    //Diminui o vetor e remove o menor valor
    public static int[] diminui(int[] array){
        int count = 0;
        int tam = array.length;
        int menorIndex = menor(array);
        for(int k = 0; k<tam; k++){
            if(array[k]==array[menorIndex]){count++;}
        }
        int[] novo = new int[tam-count];
        int index = 0;
        for(int i = 0; i<tam;i++){
            if(array[i]!=array[menorIndex]){
                novo[index++] = array[i];
            }
        }
        return novo;
    }
    //Espicho
    public static int[] espicha(int[] array){
        int tam = array.length;
        int[] novo = new int[(2*tam)-1];
        int Tam = (2*tam)-1;
        for(int i = 0, j = 0, k = 1; i<tam; i++,j=j+2, k=k+2){
            novo[j] = array[i];
            if(k+2>Tam){
                k=k-2;
                novo[k] = 0;
            }else{
                novo[k] = 0;
            }
        }
        return novo;
    }
    //Mistura
    public static int[] mistura(int[] array){
        int tam = array.length;
        int meio = tam/2;
        int[] novo = new int[tam];
        for(int j = 0; j<tam; j++){
            novo[j] = array[j];
        }
        for(int i = 0; i<meio; i++){
            int posTroca = tam-i-1;
            int temp = novo[i];
            novo[i] = novo[posTroca];
            novo[posTroca] = temp;
        }
        return novo;
    }
    //União Int *TESTE
    public static int[] uniao(int[] array1, int[]array2){
        int tam = array1.length+array2.length;
        int[] uniao = new int[tam];
        int index = 0;
        for (int element : array1) {
            uniao[index++] = element;
        }
        for (int element : array2) {
            boolean found = false;
            for(int x = 0; x<index; x++){
                if(element==uniao[x]){
                    found = true;
                    break;
                }
            }
            if(!found){
                uniao[index++] = element;
            }
        }
        int[] Uniao = new int[index];
        for(int i = 0; i<index; i++){
            Uniao[i] = uniao[i];
        }
        return Uniao;
    }
    //União Double *TESTE
    public static double[] uniao(double[] array1, double[]array2){
        int tam = array1.length+array2.length;
        double[] uniao = new double[tam];
        int index = 0;
        for (double element : array1) {
            uniao[index++] = element;
        }
        for (double element : array2) {
            boolean found = false;
            for(int x = 0; x<index; x++){
                if(element==uniao[x]){
                    found = true;
                    break;
                }
            }
            if(!found){
                uniao[index++] = element;
            }
        }
        double[] Uniao = new double[index];
        for(int i = 0; i<index; i++){
            Uniao[i] = uniao[i];
        }
        return Uniao;
    }
    //Intersecção Int *TESTE
    public static int[] interseccao(int[] array1, int[] array2){
        int[] inter = new int[Math.min(array1.length,array2.length)];
        int index = 0;
        for (int element : array1) {
            for (int element2 : array2) {
                if(element==element2){
                    boolean duplicata = false;
                    for(int k = 0; k<index;k++){
                        if(inter[k]==element){
                            duplicata = true;
                            break;
                        }
                    }
                    if(!duplicata){
                        inter[index++] = element;
                    }
                }
            }
        }
        int[] Inter = new int[index];
        for(int k = 0; k<index;k++){
            Inter[k] = inter[k];
        }
        return Inter;
    }
    //Intersecção Double *TESTE
    public static double[] interseccao(double[] array1, double[] array2){
        double[] inter = new double[Math.min(array1.length,array2.length)];
        int index = 0;
        for (double element : array1) {
            for (double element2 : array2) {
                if(element==element2){
                    boolean duplicata = false;
                    for(int k = 0; k<index;k++){
                        if(inter[k]==element){
                            duplicata = true;
                            break;
                        }
                    }
                    if(!duplicata){
                        inter[index++] = element;
                    }
                }
            }
        }
        double[] Inter = new double[index];
        for(int k = 0; k<index;k++){
            Inter[k] = inter[k];
        }
        return Inter;
    }
    //Produto Escalar Int *TESTE
    public static int prodEscalar(int[] array1, int[] array2){
        int produto = 0, tam = 0;
        if(array1.length>array2.length){
            tam = array2.length;
        }else if(array1.length<array2.length){
            tam = array1.length;
        }else{
            tam = array1.length;
        }
        for(int i = 0; i<tam;i++){
            produto += array1[i]*array2[i];
        }
        return produto;
    }
    //Produto Escalar double *TESTE
    public static double prodEscalar(double[] array1, double[] array2){
        double produto = 0, tam = 0;
        if(array1.length>array2.length){
            tam = array2.length;
        }else if(array1.length<array2.length){
            tam = array1.length;
        }else{
            tam = array1.length;
        }
        for(int i = 0; i<tam;i++){
            produto += array1[i]*array2[i];
        }
        return produto;
    }
    //multiplica os elementos de dois vetores int e gera num vetor **nao e produto escalar
    public int[] produtoVetorInt(int[] vetor1, int[] vetor2){
        if(vetor1.length<vetor2.length){
            int[] aux = vetor1;
            vetor1 =vetor2;
            vetor2=aux;
        }
        for(int i = 0; i<vetor1.length;i++){
            vetor1[i]=vetor1[i]*vetor2[i];
        }
        return vetor1;
    }
    //multiplica os elementos de dois vetores double
    public double[] produtoVetorDouble(double[] vetor1, double[] vetor2){
        if(vetor1.length<vetor2.length){
            double[] aux = vetor1;
            vetor1 =vetor2;
            vetor2=aux;
        }
        for(int i = 0; i<vetor1.length;i++){
            vetor1[i]=vetor1[i]*vetor2[i];
        }
        return vetor1;
    }
    //Soma todos os elementos do vetor de naturais
    public int somaTotalIntVetor(int[] array){
        int total = 0;
        for (int element : array) {
            total+=element;
        }
        return total;
    }
    //Soma todos os elementos do vetor de inteiros
    public double somaTotalDoubleVetor(double[] array){
        double total = 0;
        for (double element : array) {
            total+=element;
        }
        return total;
    }
}