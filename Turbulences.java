class Turbulences {
    public int solution(int[] A) {
       int result = 0;
		if (A.length < 3) {
			result = A.length;
		} else {
			result = 2;
		}
		if (A.length > 2) {
			int currentResult = 0, previous = -1;
			boolean wasRising = false, wasStable = false;
			for (int i = 0; i < A.length; i++) {
				int current = A[i];
				if (previous == current) {
					currentResult = 1;
					wasStable = true;
				} else {
					boolean isRising = previous < current;
					if (i == 1 || wasStable || isRising != wasRising) {
						currentResult++;
					} else {
						currentResult = 2;
					}
					wasRising = isRising;
					wasStable = false;
				}
				previous = current;
				if (currentResult > result) {
					result = currentResult;
				}
			}
		}
		return result;
    }
}
