package leesangwon.report7;
//6-20번 문제
public class report7_4 {
    /* (1) max 메서드를 작성하시오 . */
    static int max(int[] arr){
        int max = 0;
        if(arr==null || arr.length==0){
            return -999999;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :"+max(data));
        System.out.println("최대값 :"+max(null));
        System.out.println("최대값  :"+max(new int[]{})); // 크기가 0인 배열  }
    }
}