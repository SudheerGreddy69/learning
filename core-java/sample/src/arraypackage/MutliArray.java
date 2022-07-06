package arraypackage;

public class MutliArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] ={ {1,2,3}, {2,4,5}, {4,4,5}};
		
		
		a[0][0] =1;
		a[0][1] =20;
		a[0][2] =3;
		
		a[1][0] =1;
		a[1][1] =2;
		a[1][2] =3;
		
		a[2][0] =1;
		a[2][1] =2;
		a[2][2] =3;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
