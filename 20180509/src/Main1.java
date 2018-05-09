import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int data;
        int count1 =0;
        int count2 =0;
        int count3 =0;
        for (int i =0 ; i<6 ;i++){
            data=sca.nextInt();
            if (data>0){
                count1++;
            }else if(data<0){
                count2++;
            }else {
                count3++;
            }
        }
        System.out.println("+="+count1);
        System.out.println("-="+count2);
        System.out.println("0="+count3);


    }
}
