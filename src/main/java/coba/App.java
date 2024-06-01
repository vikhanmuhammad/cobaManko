package src.main.java.coba;

import src.main.java.coba.Orang;
import src.main.java.coba.TanggalHelper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Orang pejanji = new Orang("Vikhan", 1, 10);
        
        LocalDateTime waktuJanji1 = LocalDateTime.of(2022, Month.DECEMBER, 2, 10, 0);
        pejanji.tambahJanji(waktuJanji1, "bos");
        LocalDateTime waktuJanji2 = LocalDateTime.of(2022, Month.DECEMBER, 3, 9, 0);
        pejanji.tambahJanji(waktuJanji2, "temen");
        LocalDateTime waktuJanji3 = LocalDateTime.of(2022, Month.DECEMBER, 4, 18, 30);
        pejanji.tambahJanji(waktuJanji3, "pacar");
        LocalDateTime waktuJanji4 = LocalDateTime.of(2022, Month.DECEMBER, 4, 7, 30);
        pejanji.tambahJanji(waktuJanji4, "dosen");
        LocalDateTime waktuJanji5 = LocalDateTime.of(2022, Month.DECEMBER, 4, 15, 0);
        pejanji.tambahJanji(waktuJanji5, "temen");
        
        pejanji.tampilkanSemuaWaktuDatang();
    }
}
