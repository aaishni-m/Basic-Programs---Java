class Pattern5 {
    public static void main(String[] args) {
        // 79 108 139 176 217 260
        // Primes added: 29 31 37 41 43

        int num = 79;
        int var = 29;
        System.out.println(num);

        out:
        for (int a = 1; a <= 6; a++) { 
            home:
            for (int i = var; i <= 260; i++) { 
                boolean flag = true;

                for (int j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                        flag = false;
                        continue home;
                    }
                }

                if (flag) { 
                    num += i;
                    System.out.println(num); 
                    var++; 
                    continue out; 
                }
            }
        }
    }
}
