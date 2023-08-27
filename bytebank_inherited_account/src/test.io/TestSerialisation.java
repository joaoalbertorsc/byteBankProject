package test.io;


import br.com.bytebank.banco.model.AccountCurrent;
import br.com.bytebank.banco.model.Client;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialisation {
    public static void main(String[] args) throws IOException {

        Client client = new Client();
        client.setCpf("123321111");
        client.setName("Joberet");
        client.setProfession("Dev");

        AccountCurrent cc = new AccountCurrent(11, 11);
        cc.setHolder(client);
        cc.deposit(230);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(client);
        oos.close();
    }
}
