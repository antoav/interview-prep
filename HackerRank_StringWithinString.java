public static boolean isSubstring(String str1, String str2) {

    int length1 = str1.length();
    int length2 = str2.length();
    int position = 0;
    boolean present = false;

    if(length1 > length2){
        present = false;
    }
    else {
        for(int i = 0; i < length2; i++){
            // check if the first letter of smaller word is in str2
            if(str2.charAt(i) == str1.charAt(0)){
                // if its found, check for the rest of length 1 starting at that point in str2
                position = i;
            }
        }
        for(int i = position; i < length1; i++){
            for(int j = 0; j< length1; j++){
                if(str2.charAt(i) != str1.charAt(j)){
                    present = false;
                }
                else present = true;
            }
        }
    }
    return present;
}
