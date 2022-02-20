public class Senha {

    public static void valida_senha(String senha){
        System.out.println(senha);

        /* Define as variáveis */
        String numeros = "0123456789";
        String minusculas = "abcdefghijklmnopqrstuvxwyz";
        String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVXWYZ";
        String especiais = "!@#$%^&*()-+";

        /* Inicializa as variáveis */
        int qtd_numeros = 0;
        int qtd_minusculas = 0;
        int qtd_maiusculas = 0;
        int qtd_especiais = 0;

        int tamanho_exigido = 6;
        int tamanho_senha = senha.length();
        int tamanho_validado = 0;
        int caracteres_faltantes = 0;

        /* Incrementa a quantidade de números, letras minúsculas e maiúsculas, e caracteres especiais as suas respectivas variáveis
        para conseguir realizar a verificação dos requisitos mais adiante */
        for (int i = 0; i < tamanho_senha; i++) {
            if (numeros.indexOf(senha.charAt(i)) >= 0) {
                qtd_numeros++;
            }

            if (minusculas.indexOf(senha.charAt(i)) >= 0) {
                qtd_minusculas++;
            }

            if (maiusculas.indexOf(senha.charAt(i)) >= 0) {
                qtd_maiusculas++;
            }

            if (especiais.indexOf(senha.charAt(i)) >= 0) {
                qtd_especiais++;
            }
        }

        /* Define as variáveis 'tamanho_validado' e 'caracteres_faltantes' */
        tamanho_validado = qtd_numeros + qtd_minusculas + qtd_maiusculas + qtd_especiais;

        caracteres_faltantes = tamanho_exigido - tamanho_validado;

        /* Verifica se a senha atende os requisitos e imprime os resultados */
        if(tamanho_validado < 6){
            System.out.println("Serao necessario(s) mais: " + caracteres_faltantes + " caracter(es).");
        }
        if(qtd_numeros < 1){
            System.out.println("Necessario possuir no minimo 1 numero.");
        }
        if(qtd_minusculas < 1){
            System.out.println("Necessario possuir no minimo 1 letra minuscula");
        }
        if(qtd_maiusculas < 1){
            System.out.println("Necessario possuir no minimo 1 letra maiuscula");
        }
        if(qtd_especiais < 1){
            System.out.println("Necessario possuir no minimo 1 caracter especial.");
        }
        if(tamanho_validado >= 6 & qtd_numeros >= 1 & qtd_minusculas >= 1 & qtd_maiusculas >= 1 & qtd_especiais >= 1){
            System.out.println("A senha atende os requisitos necessarios.");
        }
    }
    public static void main(String[] args){
        valida_senha("Ya3");
    }
}