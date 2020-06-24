/*
POWER OF 3
given an integer, write a function to determine
if its a power of 3. 
Return 1 if yes, 0 if no.
*/

public static boolean isPowerOfThree(int number){
    if(number == 1)
        return true;
    if(number > 0 && 1162261467 % number == 0)
        return true;
    else
        return false;
}
