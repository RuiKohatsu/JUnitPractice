public class CombinationCalc {
    public static int calc(int n, int r){
        var n1 = 1;
        var r1 = 1;
        var nr = 1;
        if(n < 0 || r < 0){
            return -1;
        }else if(n < r){
            return -1;
        }else if(n == 0 && r >= 1){
            return -1;
        }else{
            for (var i = 1; i <= n; i++){
                n1 *= i;
            }for (var j = 1; j <= r; j++){
                r1 *= j;
            }for(var k = 1; k <= n - r; k++) {
                nr *= k;
            }

            var num = nr* r1;
            var num1 = n1;

            var comb = num1 / num;
            return comb;
        }
    }
}
