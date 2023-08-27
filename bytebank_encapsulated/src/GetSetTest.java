public class GetSetTest {
    public static void main(String[] args) {

        // criando nova conta 'account'
        //
        Account account = new Account(556,4411);

        // account = 1222
        // modificando o number da conta através do 'setNumber'
        account.setNumber(1222);

        // imprimindo o number do paulo usando o 'getNumber' como referência para o number da conta.
        //
        System.out.println("Paulo's number = " + account.getNumber());

        // criando novo cliente 'paulo'
        //
        Client paulo = new Client();

        // account.holder = paulo;
        // modificando name da conta paulo através do 'setName'.
        paulo.setName("Paulo Silveira");

        // setando um titular a conta 'account' sendo o titular 'paulo'
        //
        account.setHolder(paulo);

        // setando cpf
        // setando profession
        // printando profession e cpf utilizando o 'getProfession'
        // e o 'getCpf' como referência para a 'profession e para o 'cpf'
        paulo.setCpf("565.565.565.56");
        paulo.setProfession("Developer");
        System.out.println("Paulo`s profession = " + paulo.getProfession() +
                "\n" + "Paulo`s cpf = " + paulo.getCpf());
    }
}
