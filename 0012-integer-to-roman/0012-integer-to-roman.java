public class Solution {
    public String intToRoman(int num) {
        String[] symbol = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] number = new int[]
        {1000,900,500,400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int k = 0;
        StringBuilder sb = new StringBuilder();
        while(num >= 0 && k < number.length){
            while(num >= number[k]){
                num -= number[k];
                sb.append(symbol[k]);
            }
            k++;
        }

        return sb.toString();
    }
}