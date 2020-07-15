
public class Testing {

	public static void main(String[] args) {
		
		int [] array= {0,1,2,3,4,5,7,8,9};
		int count=0;
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length;j++) {
				int b=array[j];
				int c=array[i];
				int sum=b+c;
				if(sum==7) {
					System.out.println(sum);
					count++;
				}
				
			}
		}
		System.out.println(count);

	}

}
