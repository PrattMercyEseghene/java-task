package wahala;

import org.junit.jupiter.api.Assertions;

public class BackToSenderTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void calculateCommission() {
        int response1 = BackToSender.calculateCommission(80);
        int response2 = BackToSender.calculateCommission(25);
        int response3 = BackToSender.calculateCommission(65);


        Assertions.assertEquals(45000, response1);
        Assertions.assertEquals(9000, response2);
        Assertions.assertEquals(21250, response3);
    }
}
