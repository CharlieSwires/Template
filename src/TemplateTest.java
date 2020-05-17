import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemplateTest {
    
    private Coffee cof;
    private Tea t;

    @BeforeEach
    void setUp() throws Exception {
        cof = new Coffee();
        t = new Tea();
    }

    @Test
    void test() {
        System.out.println("# Coffee");
        cof.prepareRecipe();
        System.out.println("# Tea");
        t.prepareRecipe();
    }

}
