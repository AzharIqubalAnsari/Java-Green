class Solution {
    public String intToRoman(int num) {
        // Define numerals in descending order.
        int value[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        // Correspounding Roman Symbols
        String symbol[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        // Loop through all the values.
        for(int i = 0; i<value.length && num > 0; i++){
            while(num >= value[i]){
                // Append symbols.
                roman.append(symbol[i]);
                // Substract corresponding values.
                num -= value[i];
            }
        }
        // Convert into String
        return roman.toString();
    }
}
