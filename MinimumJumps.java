public class MinimumJumps {

	public static int getMinimumJumps(int[] src, int index) {
		if (src.length == 0) return 0;
		if (index >= src.length-1) return 0;
		int result = Integer.MAX_VALUE;
		for (int i=1; i <= src[index]; i++) {
			int localResult = 1;
			localResult += getMinimumJumps(src, index + i);
			if (localResult < result) result = localResult;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] src = { 2,4,1,1,2 };
		System.out.println(getMinimumJumps(src, 0));
	}
}
