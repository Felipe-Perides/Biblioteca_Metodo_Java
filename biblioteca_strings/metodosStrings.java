package biblioteca_strings;

/**
 * Biblioteca de Métodos
 *
 * Professora: Lucia Giraffa
 * Alunos: Felipe Nicolau Perides, Bernardo Tarnowski Dallarosa
 * Turma: 10
 * @version (3.0)
 */

public class MetodosStrings{
    public static String inverter(String palavra){
        String invertida = "";
        for(int i = palavra.length()-1; i>=0; i--){
            invertida += palavra.charAt(i);
        }
        return invertida;
    }
    public static String substituir(String palavra, char caracter, char novoCaracter){
        String novaPalavra = "";
        for(int i = 0; i<palavra.length(); i++){
            if(palavra.charAt(i)==caracter){
                novaPalavra += novoCaracter;
            }else{
                novaPalavra += palavra.charAt(i);
            }
        }
        return novaPalavra;
    }
    //Quantidade de Vogais
    public static int vogais(String palavra){
        int total = 0;
        for(int count = 0; count<palavra.length();count++){
            char letra = palavra.charAt(count);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                total++;
            }
        }
        return total;
    }
    //Se a String possui o char retorna true senão false
    public static boolean temChar(String palavra, char caracter){
        boolean found = false;
        for(int i = 0; i<palavra.length(); i++){
            if(palavra.charAt(i)==caracter){
                found = true;
            }else{
                found = false;
            }
        }
        return found;
    }
    //Se a String possuir o char, quantas vezes ele aparece
    public static int temCharX(String palavra, char caracter){
        int quant = 0;
        for(int i = 0; i<palavra.length(); i++){
            if(palavra.charAt(i)==caracter){
                quant++;
            }
        }
        return quant;
    }
    //Se a 1º String estiver contida na 2º
    public static boolean temStringString(String P1, String P2){
        if(P1.contains(P2)){
            return true;
        }else{
            return false;
        }
    }
    //Palíndromo
    public static boolean Palindromo(String palavra){
        for(int i = 0; i<palavra.length()/2-1;i++){
            if(palavra.charAt(i)!=palavra.charAt(palavra.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    //Retorna a menor String
    public static String menorS(String S1, String S2){
        if(S1.length()<S2.length()){
            return S1;
        }else{
            return S2;
        }
    }
    //Retorna uma concatenação das duas Strings
    public static String maiorS(String S1, String S2){
        S1 = S1.concat(" ");
        String Novo = S1.concat(S2);
        return Novo;
    }
}