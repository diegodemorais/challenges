Coins same face

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


class CoinsSameFace {
    public int solution(int[] A) {

        int coins0 = (int) Arrays.stream(A)
	        		.filter(p-> p == 0)
	        		.count();
        int coins1 = (int) Arrays.stream(A)
	        		.filter(p-> p == 1)
	        		.count();	        		
	    if (coins0 > coins1) {
	        return coins1;
	    } else {
	        return coins0;
	    }
    }
}
