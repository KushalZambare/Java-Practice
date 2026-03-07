class reverses {
    public int reverse(int x) {
        long reversed = 0;
        
        while (x != 0) {
            int digit = x % 10;
            
            reversed = (reversed * 10) + digit;
            
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
            
            x /= 10;
        }
        
        return (int) reversed;
    }
    public static void main(String[] args) {
        reverses rev = new reverses();
        int number = 123;
        int reversedNumber = rev.reverse(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

}