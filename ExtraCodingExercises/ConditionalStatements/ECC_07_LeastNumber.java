public class ECC_07_LeastNumber {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = -100;
        System.out.println(getLeastNum(n1, n2));
    }

    public static int getLeastNum(int num1, int num2) {
         if(num1<0 || num2<0)
         {
        	 return -1;
         }
         if(num1==0 || num2==0)
         {
        	 return -2;
         }
         return (num1>num2? num2:num1);
    }
}
