package Array;

public class Multidimensional3DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] a = new int[3][3][3];
		int it=1;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					
					a[i][j][k] = it;
					it++;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++)
				System.out.print(a[i][j][k] + " ");
				System.out.println();
				}
				System.out.println();
			}
			
		

	}

}
