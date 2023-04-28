import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

    @Test
    public void 引数で受け取った数値文字列がintの範囲か判断する(){
        var result = Util.isNumber("-10000");
        assertTrue(result);
    }

    @Test
    public void 引数で受け取った文字列が郵便番号か判断する(){
        var result = Util.isPostalCode("9000000");
        assertTrue(result);
    }

    @Test
    public void 引数で受け取った文字列が小文字だけで構成されているか判断する(){
        var result = Util.isSmallAlphabet("aaaa");
        assertTrue(result);
    }

    @Test
    public void 引数に受け取った3つの数値を辺として三角形が作成できるか(){
        var result = Util.isTriangle(3,4,6);
        assertTrue(result);
    }

    @Test
    public void 受け取った値が0より小さいまたは10000より大きいか(){
        var expected = -1;
        var result = Util.isSquareNumber(-1);
        assertEquals(expected,result);
    }

    @Test
    public void 引数が何かしらの2乗でない(){
        var expected = -1;
        var result = Util.isSquareNumber(5);
        assertEquals(expected,result);
    }

    @Test
    public void 引数が何かしらの2乗である(){
        var expected = 6;
        var result = Util.isSquareNumber(36);
        assertEquals(expected,result);
    }



}