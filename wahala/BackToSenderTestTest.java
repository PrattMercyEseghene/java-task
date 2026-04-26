package wahala;

import org.junit.jupiter.api.Assertions;

class BackToSenderTestTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void calculateCommission() {
        BackToSenderTest backToSenderTest = new BackToSenderTest();
        int response1 = backToSenderTest.calculateCommission(80);
        int response2 = backToSenderTest.calculateCommission(25);
        int response3 = backToSenderTest.calculateCommission(65);


        Assertions.assertEquals(45000, response1);
        Assertions.assertEquals(9000, response2);
        Assertions.assertEquals(21250, response3);
    }
}
