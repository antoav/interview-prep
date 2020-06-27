    /*
    BRICK BREAK
    
    given a string with spaces and dashes, and an index value. 
    If the character in the string at the specified index is a "-", 
    transform it into a space. Otherwise, leave it alone. Metaphorically, 
    the index is the "ball" and it "breaks" the "brick" if the break is there. 
    */
    
    public static String brickBreak(String bricks, int ball) {
        int length = bricks.length();

        if(bricks == null || bricks.isEmpty() || length <= ball){
            return bricks;
        }

        if(bricks.charAt(ball) == '-'){
            char[] convert = bricks.toCharArray();
            convert[ball] = ' ';
            String newBricks = String.valueOf(convert);
            return newBricks;
        }
        else return bricks;
    }