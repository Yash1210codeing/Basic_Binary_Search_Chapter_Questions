package Basic_Binary_Search_Chapter_Questions;
public class KTH_Root_Binary_Questions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=87;
        int k=3;
        System.out.println(kthroot(n,k));       
	}
	public static int kthroot(int n, int k) {
		int lo=1; //Low Point   (Starting Point)
		int hi=n; //high point   ( Ending Point)
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(Math.pow(mid,k)<=n) {
				ans=mid;
				lo=mid+1;				
			}else {
				hi=mid-1;
			}
		}
		return ans;			
	}
}
