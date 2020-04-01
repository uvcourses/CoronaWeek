package daily.string;

public class MinimumTimeVisiting {

	public int minTimeToVisitAllPoints(int[][] points) {
		int minimum = 0;
		for (int i = 1; i < points.length; i++) {

			int[] source = points[i];
			int[] dest = points[i - 1];
			minimum += steps(source, dest);

		}
		return minimum;

	}

	private int steps(int source[], int dest[]) {

		int dx = Math.abs(source[0] - dest[0]);
		int dy = Math.abs(source[1] - dest[1]);

		return Math.max(dx, dy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		MinimumTimeVisiting m=new MinimumTimeVisiting();  
		
		int points[][]= {{3,2},{-2,1}};
		m.minTimeToVisitAllPoints(points);

	}

}
