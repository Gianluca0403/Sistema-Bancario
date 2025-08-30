public class ValidarCpf {

    public static boolean cpfValido(String cpf){

        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() !=11)return false;

        if (cpf.matches("(\\d)\\1{10}")) return false;

        try {
            int soma = 0;
            for(int i = 0 ; i < 9 ; i ++){

                int num = Character.getNumericValue(cpf.charAt(i));
                soma += num * (10 - i);

            }

            int resto = 11 - (soma % 11);
            int digito1 = (resto == 10 || resto == 11) ? 0 : resto;

            soma = 0;
            for(int i = 0 ; i < 10 ; i ++){

                int num = Character.getNumericValue(cpf.charAt(i));
                soma += num * (11 - 1);

            }

            resto = 11 - (soma % 11);
            int digito2 = (resto == 10 || resto == 11 ) ? 0 : resto;

            return digito1 == Character.getNumericValue(cpf.charAt(9)) &&
                    digito2 == Character.getNumericValue(cpf.charAt(10));


        }catch (NumberFormatException e){
            return false;
        }

    }

}
