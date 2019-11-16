public class Hello {
    /**
     * 測試參數
     * @param args 
     */
    
    public static void main(String[] args) {
//        boolean b = false;
//        System.out.print("b=");
//        System.out.println(b);
        
        System.out.println("b=" + 123);
        
        float f;
        f = 1 + 3.14F;
        f = 3L + 3.14F;
        double x = 1/2f;
        System.out.println("1/2 = " + x);
        
        int a = 1;
        int b;
        b = ++a;
        System.out.println("abcdefg");
        System.out.println("b = " + b);
        
        double F, C=23;
        java.util.Scanner sc = new java.util.Scanner(System.in);    //allow user to input
        System.out.print("請輸入 1) C ->F,  2) F->C    : ");
        int userChoice = sc.nextInt();
        System.out.print("請輸入欲查詢的溫度 : ");
        double input = sc.nextDouble();
        
        if(userChoice == 1) {
            double result = input * 9/5 + 32;   
            System.out.println(">>> " + result + " 'F");
        } else {
            double result = (input-32)* 5/9;                        
            System.out.println(">>> " + result + " 'C");
        }
        
    }
}
