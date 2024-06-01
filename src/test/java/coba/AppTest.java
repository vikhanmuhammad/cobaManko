package src.test.java.coba;

import static org.junit.Assert.assertTrue;
import src.main.java.coba.TanggalHelper;
import org.junit.Test;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testTambahMenit() {
        LocalDateTime waktu = LocalDateTime.of(2023, 6, 1, 12, 0, 0);
        String expected = "2023-06-01 12:10:00";
        String actual = TanggalHelper.tambahMenit(waktu, 10);
        assertEquals(expected, actual);
    }

    @Test
    public void testTambahJam() {
        LocalDateTime waktu = LocalDateTime.of(2023, 6, 1, 12, 0, 0);
        String expected = "2023-06-01 15:00:00";
        String actual = TanggalHelper.tambahJam(waktu, 3);
        assertEquals(expected, actual);
    }
}
