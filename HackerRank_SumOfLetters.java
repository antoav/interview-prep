/*
SUM OF LETTERS
    Given a string, calculate the sum of the ASCII values
    
     * Difficulty level: Easy.
     * Input: String of letters.
     * Output: integer (int) of the sum. 
     */

public static int summate(String vals) {
        int sum = 0;
        // loop through string to take each char
        for(int i = 0; i < vals.length(); i++){
            // add char values into an int variable
            sum +=(int)vals.charAt(i);
        }
        // return int variable
        return sum;
    }