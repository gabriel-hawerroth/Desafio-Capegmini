public class Escada {

    public static void imprime_escada(int degraus){
        String escada = "";
        int lajota = 1;
        int espacos = degraus - 1;

        /* Define o tamanho da escada, dando um limite máximo de linhas a serem feitas 
        (o limite é declarado com o int 'degraus') */
        for(int i = 1; i <= degraus; i++) {
            /* Incrementa os espaços e asteriscos na string escada */
            for(int e = 1; e <= espacos; e++) {
                escada = escada + " ";
            }
            for(int d = 1; d <= lajota; d++) {
                escada = escada + "*";
            }
            /* Acrescenta 1 na lajota e decrementa 1 espaco, para formar a escada */
            lajota = lajota + 1;
            espacos = espacos - 1;

            /* Imprime o resultado da string escada */
            System.out.println(escada);
            /* Zera a string escada */
            escada = "";
        }
    }

    public static void main(String[] args){
        imprime_escada(6);
    }
}