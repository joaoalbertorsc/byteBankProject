public class TestBank {
    public static void main(String[] args) {
        Client paulo = new Client();

        //
        // "preenchendo" os atributos do paulo.

        paulo.name = "Paulo Silveira";
        paulo.cpf = "222.222.222-22";
        paulo.profession = "developer";

        //
        // criando a conta do paulo

        Account pauloAccount = new Account();

        //
        // invocando métodos na conta do paulo

        pauloAccount.deposit(100.0);

        // paulo e pauloAccount são referências para o mesmo objeto.
        // associa o cliente paulo a conta 'pauloAccount'

        pauloAccount.holder = paulo;

        System.out.println(pauloAccount.holder.name);
        System.out.println(paulo.name);
        System.out.println(pauloAccount.holder);
        System.out.println(paulo);
    }
}
