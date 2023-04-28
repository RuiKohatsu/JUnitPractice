import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationCalcTest {

    @Test
    public void 渡した引数のどちらかが負の数である(){
        var expected = -1;
        var result = CombinationCalc.calc(-1, 5);
        assertEquals(expected, result);
    }

    @Test
    public void 組み合わせの左側の数より右側の数が大きい(){
        var expected = -1;
        var result = CombinationCalc.calc(1,2);
        assertEquals(expected,result);
    }

    @Test
    public void 組み合わせの左側の数が0の時右側の数が1以上() {
        var expected = -1;
        var result = CombinationCalc.calc(0, 2);
        assertEquals(expected, result);
    }

    @Test
    public void 組み合わせの答えがあっているか(){
        var expected = 15;
        var result = CombinationCalc.calc(6, 2);
        assertEquals(expected, result);
    }

}