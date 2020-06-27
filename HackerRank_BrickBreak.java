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