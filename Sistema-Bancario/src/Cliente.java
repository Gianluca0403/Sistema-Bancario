public class Cliente {

    private String cpf;
    private String nome;

    Cliente(){

    }

    Cliente(String cpf , String nome){

        if (!ValidarCpf.cpfValido(cpf)) {

            System.out.println(("CPF Valido:") + cpf);

        }else{

            throw new IllegalArgumentException("CPF inválido: " + cpf);
        };
        this.cpf = cpf;
        this.nome = nome;

    }

    public void setCpf (String cpf){

        if (!ValidarCpf.cpfValido(cpf)) {

            System.out.println(("CPF Valido:") + cpf);

        }else{

            throw new IllegalArgumentException("CPF inválido: " + cpf);
        }
        this.cpf = cpf;

    }

    public String getCpf(){

        return this.cpf;

    }

    public void setNome(String nome){

        this.nome = nome;

    }

    public String getNome(){

        return this.nome;

    }

}
