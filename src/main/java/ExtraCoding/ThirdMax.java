package ExtraCoding;

public class ThirdMax {

	public static void main(String[] args) {
		int a[]={-12,45,-23,64,-100,24};
		for(int i=0;i<a.length;i++){ for(int j=i+1;j<a.length;j++){ int temp=0;
		if(a[i]<a[j]){ temp=a[j]; a[j]=a[i]; a[i]=temp;
		}
		}
		}
		for(int k=0;k<a.length;k++){ System.out.println(a[k]);
		}
		System.out.println("The Third maximum number is " + a[a.length]);
		}
		

	}


