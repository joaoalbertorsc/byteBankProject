package br.com.bytebank.banco.test;

public class TestArrayPrimitivos {
    public static void main(String[] args) {

        int [] idades = new int[5];

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        int[] refs = {1,2,3,4,5};

        //for (int i = 0; i < refs.length; i++) {
        //            System.out.println(refs[i]);
        //        }

        for (int ref : refs) {
            System.out.println(ref);
        }
    }
}
