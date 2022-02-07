package PracticeProjects;

public class LongestSubSequence {
	public static void main(String[] args) {
		LongestSubSequence log= new LongestSubSequence();
		int [] arr1= {1,50,16,60,48,25};
		int [] arr2={6,8,7,5,3};
		log.subsequence(arr1);
		System.out.println();
		log.subsequence(arr2);
		}
		void subsequence (int[] arr) {
		int [] res=new int[arr.length];
		int pos, finalLength=1,comp,length;
		for(int i=0;i<arr.length;i++) {
		int[] loop = new int[arr.length];
		loop[0]=arr[i];
		comp=arr[i];
		pos=1;length=1;
		for(int j=i+1;j<arr.length;j++) {
		if(arr[j]>comp) {
		loop[pos]=arr[j];
		pos+=1;
		length+=1;
		comp=arr[j];
		}
		}
		if(length>finalLength) {
		finalLength=length;
		res=loop;
		}
		}
		System.out.println("The longest increasing subsquence is of length "+ finalLength);
		System.out.print("The Longest subsequence is ");
		for (int i=0;i<finalLength;i++)
		System.out.print(res[i]+" ");
		System.out.println();
		}

}
