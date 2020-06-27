/*
    ALL ALLITERATION
    
    implement a solution that checks if the group of words forms
    an alliteration (all words start with same letter).

    Return true if alliteration, otherwise Return false.

*/ 

 public static boolean isAlliteration(List<String> words) {

        // iterate through arrayList and check first letter of each string
        for(int i = 0; i < words.size(); i++){
            // compare first letter on forst string to all others
            if(words.get(0).charAt(0) != words.get(i).charAt(0))
                return false;
        }
        return true;
    }