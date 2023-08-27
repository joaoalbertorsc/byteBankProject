
/*

 extends = herança
 'Manager' = 'Employee' + outras informações.
 'Manager' é um 'Employee'
  que serão adicionadas mas reaproveitando todas as atribuições
  dadas ao 'Employee' diminuindo a quantidade de codigo.

*/

public class Manager extends Employee implements Authenticable {

    private Authenticator authenticator;

    public Manager(){
        this.authenticator = new Authenticator();
    }
    public double getBonus(){

        return 19000;

    }

    @Override
    public void setKey(int key) {
        this.authenticator.setKey(key);
    }

    @Override
    public boolean authentication(int key) {
        return this.authenticator.authentication(key);
    }
}
