import java.io.*;
class Demo {
	public static void main(String[] args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
	System.out.print("Enter the Number of plane  :");
	int plane=Integer.parseInt(br.readLine());
	
	System.out.print("Enter the Number of rows  :");
	int r=Integer.parseInt(br.readLine());
	
	System.out.print("Enter the Number of column  :");
	int c=Integer.parseInt(br.readLine());
	
	int arr[][][]=new int[plane][r][c];
	int sum=0;
	for(int i=0;i<plane;i++){
		for(int j=0;j<r;j++){
			for(int k=0;k<c;k++){
				arr[i][j][k]=Integer.parseInt(br.readLine());
				sum=sum+arr[i][j][k];
			}
		}
	}
	System.out.println("sum  : "+sum);

	}
}
