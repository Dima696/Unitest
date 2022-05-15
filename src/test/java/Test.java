import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    @org.junit.jupiter.api.Test
    void resultSum() {
        Calculator calculator = new Calculator();
        int res = calculator.plus.apply(2, 3);
        int res1 = calculator.plus.apply(100, 1000);
        assertEquals(5, res);
        assertEquals(1100,res1);
    }

    @org.junit.jupiter.api.Test
    void resultMultiplication() {
        Calculator calculator = new Calculator();
        int res = calculator.multiply.apply(2, 3);
        int res1 = calculator.multiply.apply(100, 2);
        assertEquals(6, res);
        assertEquals(200,res1);
    }


    @org.junit.jupiter.api.Test
    void resultMinus(){
        Calculator calculator = new Calculator();
       int res = calculator.minus.apply(100,0);
        int res1 = calculator.minus.apply(50, 100);
       assertEquals(100,res);
       assertEquals(-50,res1);
    }
    @org.junit.jupiter.api.Test
    void resultABS(){
        Calculator calculator = new Calculator();
        int res = calculator.abs.apply(1);

        assertEquals(1,res);
        }

    }





