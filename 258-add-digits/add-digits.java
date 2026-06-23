class Solution {
    public int addDigits(int num) {
        while (num > 9) {
            int l = num / 10;
            int r = num % 10;
            num = l + r; 
        }
        return num;
    }
}