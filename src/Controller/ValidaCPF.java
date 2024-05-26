package Controller;

public class ValidaCPF {

    // Método para verificar se um CPF é válido
    public static String validaCPF(String CPF) {
        String mensagem= "";
        // Considera erro CPFs formados por uma sequência de números iguais
        if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") || CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") || (CPF.length() != 11)) {
            mensagem = "CPF inválido em sequência";
            return mensagem;
        }

        // Calcula o primeiro dígito verificador
        int sm = 0;
        for (int i = 0; i < 9; i++) {
            sm += (CPF.charAt(i) - '0') * (10 - i);
        }
        int primDigit = 11 - (sm % 11);
        if (primDigit >= 10) {
            primDigit = 0;
        }

        // Verifica se o primeiro dígito verificador é igual ao informado no CPF
        if (primDigit != (CPF.charAt(9) - '0')) {
            mensagem = "CPF inválido no primeiro dígito verificador.";
            return mensagem;
        }

        // Calcula o segundo dígito verificador
        sm = 0;
        for (int i = 0; i < 10; i++) {
            sm += (CPF.charAt(i) - '0') * (11 - i);
        }
        int segundDigit = 11 - (sm % 11);
        if (segundDigit >= 10) {
            segundDigit = 0;
        }

        // Verifica se o segundo dígito verificador é igual ao informado no CPF
        if (segundDigit != (CPF.charAt(10) - '0')) {
            mensagem = "CPF inválido no segundo dígito verificador.";
        }
        return mensagem; 

    }
}
