package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01IOExceptions {

    public static void main(String[] args) throws FileNotFoundException { //exceptions firlatabilir demek

        /*
        java da bilgisayardan bir dosya okutmak (input) yapmak istersek  FileInputStream classindan yardim aliriz
        javadan bilgisayara bigi aktarmak istersek  FileOuputStream classindan yardim aliriz
         */
        FileInputStream fis = new FileInputStream("src/day39_exceptions/test.txt");

        /*
        throws exception sorumluluk almaktır run yapınca excep. gormezden gelmez hata mesaji verir
        sadece excep. olabilir haberim var demek icin kullanilir
         */
    }
}
