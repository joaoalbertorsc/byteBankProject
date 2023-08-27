package test;

import br.com.bytebank.banco.model.Account;
import br.com.bytebank.banco.model.AccountCurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class testOutrosWrappers {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29);
        System.out.println(idadeRef);

        Double dRef = Double.valueOf(3.2);
        System.out.println(dRef);

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number refNumber = Float.valueOf(2.5f);

        List<Number> list = new ArrayList<>();
        list.add(2);
        list.add(2.6);
        list.add(99.23);

        System.out.println(list.get(2));
        System.out.println(list.get(0));
        System.out.println("----------");

        list.set(0, 3);
        System.out.println(list.get(0));

    }
}
