package com.practice.matrix;

class OfficeCounter {

    /*
        This practice takes a 2D matrix and tries to identify how many offices can be created out of a matrix,
        the matrix is filled with 1's and 0's:
        -a floor is marked as a 1
        -a wall is marked as a  0
        -a 1/0 is one block big

        An office must be two blocks big to be counted. Calculate the total number of possible offices.
     */
    public static String[][] getMatrix() {
        return new String[][]{  {"1","1","1","0","0"},
                                {"0","0","0","0","0"},
                                {"1","1","1","0","0"},
                                {"0","0","0","0","0"},
                                {"0","0","0","1","1"}};
    }

    public static int numOffices(String[][] grid) {
        int result = 0;
        System.out.println("rows"+grid.length);
        System.out.println("cols"+grid[0].length);


        boolean isOffice = false;
        boolean isOfficeAbove = false;
        for(int r = 0 ; r < grid.length; r++){ //rows
            for(int c = 0; c < grid[0].length-1; c++){ //cols

                System.out.println("r= " + r +" c= " + c);

                if (r > 0 && grid[r][c].charAt(0) == '1' && grid[r-1][c].charAt(0) == '1') {
                    isOfficeAbove = true;
                } else {
                    isOfficeAbove =false;
                }

                if (grid[r][c].charAt(0) =='0' && !isOfficeAbove) {
                    isOffice = false;
                } else if (c < grid[0].length-1 && grid[r][c].charAt(0) == '1' && grid[r][c+1].charAt(0) == '1') {
                    if(!isOffice && !isOfficeAbove) {
                        result++;
                        System.out.println("Adding!");
                    }
                    isOffice = true;
                    System.out.println("We are in an office!");
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = numOffices(getMatrix());
        System.out.println("Result = " + result);
    }
}
