import java.util.Scanner; 

class GoodPrime {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt(); 
        boolean flag = true;
		int cnt = 0;

        home:
        for (int i = 2; i <= num; i++) { 
            int prime = 2;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue home; 
                }
            }
            prime = i; 
			//System.out.println(prime);

            int dup = prime; //23
            while (prime > 0) {
                int rem = prime % 10; //3

				if (rem==1)
				{
					flag = false;
					break;
				}
                for (int j = 2; j < rem; j++) { //j4
                    if (rem % j == 0 && rem != j) { //
                        flag = false; 
                        break; 
                    }
                }
                prime /= 10; 
            }

            if (flag) {
				cnt++;
                System.out.print(dup+" ");
            }
            flag = true;
        }
		System.out.println();
		System.out.println("Number of good primes: "+cnt);
    }
}
