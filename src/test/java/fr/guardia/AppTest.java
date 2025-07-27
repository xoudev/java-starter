package fr.guardia;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testAppHasACorrectPackageName() {
        assertTrue(App.class.getPackage().getName().equals("fr.guardia"));
    }
}
