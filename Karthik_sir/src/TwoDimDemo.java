
public class TwoDimDemo {
   public static void main(String[] args) {
	   int [][]X=new int[3][];
	   X[0]=new int[3];
	   X[1]=new int[2];
	   X[2]=new int[5];
	   for(int i=0;i<X.length;i++)
	   {
		   for(int j=0;j<X[i].length;j++)
		   {
			   X[i][j]=i;
			   System.out.println(X[i][j]);
		   }
		   System.out.println();
	   }
   }
}
