package biblioteca_matrizes;

/**
 * Biblioteca de Métodos
 *
 * Professora: Lucia Giraffa
 * Alunos: Felipe Nicolau Perides, Bernardo Tarnowski Dallarosa
 * Turma: 10
 * @version (3.0)
 */

public class MetodosMatrizes{
    //Imprime Matriz INT
    public static void imprimeMatrizInt(int[][] matriz){
        for (int[] element : matriz) {
            System.out.print("\n");
            for (int element2 : element) {
                System.out.print("|"+element2);
            }
            System.out.print("|");
        }
    }
    //Imprime Matriz DOUBLE
    public static void imprimeMatrizDouble(double[][] matriz){
        for (double[] element : matriz) {
            System.out.print("\n");
            for (double element2 : element) {
                System.out.print("|"+element2);
            }
            System.out.print("|");
        }
    }
    //imprime a diagonal principal de uma matriz quadrada de inteiros  e retorna um vetor com estes termos
    public int[] diagonalInt(int[][] matriz){
        int[] diag = new int[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++){
            diag[i]=matriz[i][i];
            System.out.print("|"+matriz[i][i]+"|");
        }
        System.out.print("|");
        return diag;
    }
    //imprime a diagonal principal de uma matriz quadrada de doubles e retorna um vetor com estes termos
    public double[] diagonalDouble(double[][] matriz){
        double[] diag = new double[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++){
            diag[i]=matriz[i][i];
            System.out.print("|"+matriz[i][i]+"|");
        }
        System.out.print("|");
        return diag;
    }
    //imprime a diagonal secundaria de uma matriz quadrada de inteiros  e retorna um vetor com estes termos
    public int[] secundariaInt(int[][] matriz){
        int[] diag = new int[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++){
            diag[i] = matriz[i][matriz[i].length-i-1];
            System.out.print("|"+matriz[i][matriz[i].length-i-1]+"|");
        }
        System.out.print("|");
        return diag;
    }
    //imprime a diagonal secundaria de uma matriz quadrada de inteiros  e retorna um vetor com estes termos
    public double[] secundariaDouble(double[][] matriz){
        double[] diag = new double[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++){
            diag[i]=matriz[i][matriz[i].length-i-1];
            System.out.print("|"+matriz[i][matriz[i].length-i-1]+"|");
        }
        System.out.print("|");
        return diag;
    }
    //checa se uma matriz é diagonal (int)
    public static boolean matrizDiagonalInt(int[][] matriz){
        for (int i = 0; i<matriz.length;i++){
            for(int j= 0; j<matriz[i].length;j++){
                if(i!=j){
                    if(matriz[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    //checa se uma matriz é diagonal (double)
    public boolean matrizDiagonalDouble(double[][] matriz){
        for (int i = 0; i<matriz.length;i++){
            for(int j= 0; j<matriz[i].length;j++){
                if(i!=j){
                    if(matriz[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    //checa se uma matriz é uma matriz unidade (int)
    public boolean matrizUnidadeInt(int[][] matriz){
        for (int i = 0; i<matriz.length;i++){
            for(int j= 0; j<matriz[i].length;j++){
                if(i==j){
                    if(matriz[i][j]!=1){
                        return false;
                    }
                }else if (matriz[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
    //checa se uma matriz é uma matriz unidade (double)
    public boolean matrizUnidadeDouble(double[][] matriz){
        for (int i = 0; i<matriz.length;i++){
            for(int j= 0; j<matriz[i].length;j++){
                if(i==j){
                    if(matriz[i][j]!=1){
                        return false;
                    }
                }else if (matriz[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
    //retorna true se a matriz tem mais de 50% dos elementos iguais a zero
    //Uma matriz é dita esparsa quando possui uma grande quantidade de elementos com valor zero
    //Matrizes esparsas são matrizes nas quais a maioria das posições é preenchida por zeros.
    //Para essas matrizes,podemos economizar um espaço significativo de memória se apenas os termos diferentes de zero forem
    //armazenados. As operações usais sobre essas matrizes (somar, multiplicar, inverter, pivotar) também podem
    //ser feitas em tempo muito menor se não armazenarmos as posições que contêm zeros;
    //Na disciplina de estrutura de dados farao isto com listas encadeadas
    public boolean matrizEsparsaInt(int[][] matriz){
        double count = 0;
        for (int[] element : matriz) {
            for (int element2 : element) {
                if(element2==0){
                    count+=1.0;
                }
            }
        }
        if(count/(matriz.length*matriz[0].length)>0.5){
            return true;
        }
        return false;
    }
    //retorna true se a matriz (retangular) tem mais de 50% dos elementos iguais a zero
    public boolean matrizEsparsaIDouble(double[][] matriz){
        double count = 0;
        for (double[] element : matriz) {
            for (double element2 : element) {
                if(element2==0){
                    count+=1.0;
                }
            }
        }
        if(count/(matriz.length*matriz[0].length)>0.5){
            return true;
        }
        return false;
    }
    //soma os elementos de duas matrizes de mesmo tamanho (int)
    public static int[][] somaMatrizInt(int[][] matriz1, int[][] matriz2){
    	int[][] soma = new int[matriz1.length][matriz1[0].length];
        for(int i = 0; i<matriz1.length;i++){
        	for(int j = 0; j<matriz1[i].length;j++) {
        		soma[i][j] = matriz1[i][j] + matriz2[i][j];
        	}
        }
        return soma;
    }
    //soma os elementos de duas matrizes de mesmo tamanho (double)
    public static double[][] somaMatrizDouble(double[][] matriz1, double[][] matriz2){
    	double[][] soma = new double[matriz1.length][matriz1[0].length];
        for(int i = 0; i<matriz1.length;i++){
        	for(int j = 0; j<matriz1[i].length;j++) {
        		soma[i][j] = matriz1[i][j] + matriz2[i][j];
        	}
        }
        return soma;
    }
    //Multiplica todos os elementos de uma matriz de mesmo tamanho (int)
    public static int[][] produtoMatrizInt(int[][] matriz1, int[][] matriz2){
        int[][] prod = new int[matriz1.length][matriz2[0].length];
        for(int i = 0; i<matriz1.length;i++){
            for(int j = 0; j<matriz2[0].length;j++) {
                prod[i][j] = matriz1[i][j]*matriz2[i][j];
            }
        }
        return prod;
    }
    //Multiplica todos os elementos de uma matriz de mesmo tamanho (double)
    public static double[][] produtoMatrizDouble(double[][] matriz1, double[][] matriz2){
        double[][] prod = new double[matriz1.length][matriz2[0].length];
        for(int i = 0; i<matriz1.length;i++){
            for(int j = 0; j<matriz2[0].length;j++) {
                prod[i][j] = matriz1[i][j]*matriz2[i][j];
            }
        }
        return prod;
    }
    public static int[] jogaNoVetor(int[][] matriz) {
    	int n=matriz.length;
        int m=matriz[0].length;
        int tam=n*m;
        int[] array = new int[tam];
        int aux = 0;
        for(int i = 0; i<n;i++) {
        	for(int j = 0; j<m; j++) {
        		array[aux] = matriz[i][j];
        		aux++;
        	}
        }
        return array;
    }
    public static int[][] jogaNaMatriz(int[] array, int lin, int col){
    	int[][] matriz = new int[lin][col];
    	int aux = 0;
    	for(int i = 0; i<lin; i++) {
    		for(int j = 0; j<col; j++) {
    			matriz[lin][col] = array[aux];
    			aux++;
    		}
    	}
    	return matriz;
    }
    public static int somaDiagonalP(int[][] matriz) {
    	int tam = matriz.length;
    	int soma = 0;
    	for(int i = 0; i<tam; i++) {
    		soma = soma + matriz[i][i];
    	}
    	return soma;
    }
    public static int somaDiagonalS(int[][] matriz) {
    	int tam = matriz.length;
    	int soma = 0;
        int aux = tam - 1;
        for(int i = 0; i<tam; i++) {
        	soma = soma + matriz[i][aux-1];
        }
        return soma;
    }
    //soma elementos das diagonais
    public static int somaDiagonais(int[][] matriz){
    	int soma=0; int tam=matriz.length;//ordem da matriz
        int aux1=somaDiagonalS(matriz);
        int aux2=somaDiagonalP(matriz);
        soma=aux1+aux2;
        //elemento central tem coordenadas
        int coord= (tam-1)/2;
        int central= matriz[coord][coord];
        if (tam%2!=0) {soma=soma-central; }
        return soma;
    }
  //verifica se todos sao zeros abaixo da DP
    public static boolean acimaP(int[][] matriz){
        int tam=matriz.length;int cont=0;
        for (int i=0;i<tam;i++) {
         for (int j=0;j<tam;j++){
             if(i>j){
            	 if (matriz[i][j]==0) {
					cont++;
				}}
         }
        }
        int quant=((tam*tam)-tam)/2;
        if (cont==quant) {
			return true;
		} else {
			return false ;
		}
    }
  //veirfica se todos sao zeros acima da DP
    public static boolean abaixoP(int[][] matriz){
        int tam=matriz.length;int cont=0;
        for (int i=0;i<tam;i++) {
         for (int j=0;j<tam;j++){
             if(i<j){
            	 if (matriz[i][j]==0) {
					cont++;
				}}
         }
        }
        int quant=((tam*tam)-tam)/2;
        if (cont==quant) {
			return true;
		} else {
			return false ;
		}
    }
  //soma elemntos de determinada coluna
    public static int somaCOLUNA(int[][] matriz, int col){
        int tam=matriz.length;int soma=0;
        for (int i=0;i<tam;i++){
         soma=soma+matriz[i][col];
        }
         return soma;
    }
  //soma elemntos de determinada linha
    public static int somaLINHA(int[][] matriz, int li){
        int tam=matriz.length;int soma=0;
        for (int i=0;i<tam;i++){
         soma=soma+matriz[li][i];
        }
         return soma;
    }
    public static int linhaMaiorValor(int[][] matriz) {
		int maior = 0;
		int lin = 0;
		for(int i = 0; i<matriz.length; i++) {
			maior = Biblioteca.maior(Biblioteca.jogaNoVetor(matriz));
			for(int j = 0; j<matriz[0].length; j++) {
				if(maior==matriz[i][j]) {
					lin = i;
					break;
				}
			}
		}
		return lin;
	}
}