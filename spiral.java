import java.util.*;
public class spiral {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int dir=1;
        int top=0,left=0,bottom=arr.length-1;
        int right=arr[top].length-1;
        int count=(bottom+1)*(right+1);

        while(left<=right&&top<=bottom) {

            if(count>0) {
                if(dir==1) {
                    for(int i=left;i<=right;i++) {
                        System.out.print(arr[top][i]+", ");
                        count--;
                    }
                }
                dir=2;
                top++;
            }

            if(count>0) {
                if(dir==2) {
                    for(int i=top;i<=bottom;i++) {
                        System.out.print(arr[i][right]+", ");
                        count--;
                    }
                }
                dir=3;
                right--;

            }

            if(count>0) {
                if(dir==3) {
                    for(int i=right;i>=left;i--) {
                        System.out.print(arr[bottom][i]+", ");
                        count--;
                    }
                }
                dir=4;
                bottom--;
            }

            if(count>0) {
                if(dir==4) {
                    for(int i=bottom;i>=top;i--) {
                        System.out.print(arr[i][left]+", ");
                        count--;
                    }
                }
                dir=1;
                left++;

            }

        }
        System.out.print("END");
    }

}