package net.zjitc;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class SuperBackendApplicationTests {

    @Test
    void contextLoads() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        ParsePosition pos = new ParsePosition(0);

        Date strtodate = formatter.parse("20240708", pos);

        System.out.println(strtodate);


    }

}
