public class App {
    public static void main(String[] args) throws Exception {
        int n = 5;
        for(int x = 0; x <= n; x++){
            System.out.println(x);
        }

        int a = 0;
        for(int p = 5; p >= a; p--){
            System.out.println(p);
        }

        int z = 10;
        int sum = 0;
        for (int i = 1; i <= z; i++){
            if (z % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);


        int n1 = 5;
        long f = 1;
        for (int i = 1; i<= n1; i++){
            f = f * i;
        }
        System.out.println(n1 + "! = " + f);


        int R = 3;
        int C = 5;
        for (int i = 1; i <= R; i++){
            for (int j = 1; j <= C; j++){
                System.out.print("*");
            }
            System.out.println();
        }



        int N = 4;
        for (int i = 1; i <= N; i++){
            for (int j =1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        int N1 = 20;
        for(int num = 2; num <= N1; num++){
            boolean isPrime = true;

            for (int d = 2; d * d <= num; d++){
                if (num % d == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num + " ");
            }
                
            
        }



        int[] numbers = {2, 4, 3, 5, 7, 8, 9};
        int target = 10;

        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    System.out.println(
                        "(" + numbers[i] +  " + numbers[j] + )"
                    );
                }
            }
        }



    }  
}
