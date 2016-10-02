package arrays;

public class RotateMatrix {

	static void printMatrix(int[][] input) {
		for (int i=0; i<input.length; i++) {
			for (int j=0; j<input[0].length; j++) {
				System.out.print(input[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int[][] matrix = { {0, 1, 2, 3}, 
						   {4 ,5, 6, 7}, 
						   {8, 9, 10, 11},
						   {12, 13, 14, 15}
						 };
		int n = 4;
		printMatrix(matrix);
		for (int i=0; i<matrix.length/2; i++) {
			int layerStart = i;
			int layerEnd = n-1-layerStart;
			for (int j=layerStart; j<layerEnd; j++) {
				int offset = i -  layerStart;
				int top = matrix[layerStart][i]; // save top
				// left -> top
				matrix[layerStart][i] = matrix[layerEnd-offset][layerStart];
				// bottom -> left
				matrix[layerEnd-offset][layerStart] = matrix[layerEnd][layerEnd - offset];
				// right -> bottom
				matrix[layerEnd][layerEnd - offset] = matrix[i][layerEnd];
				// top -> right
				matrix[i][layerEnd] = top; // right <- saved top
			}
		}
		System.out.println();
		printMatrix(matrix);
		
	}
	
}
