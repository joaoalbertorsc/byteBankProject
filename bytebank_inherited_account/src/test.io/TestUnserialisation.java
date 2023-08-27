package test.io;


import br.com.bytebank.banco.model.AccountCurrent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestUnserialisation {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        // Pegando os dados de um cliente e utilizando no codigo;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
        AccountCurrent cc = (AccountCurrent) ois.readObject();
        System.out.println(cc.getNumber());
        System.out.println(cc.getHolder().getName());

    }
}
