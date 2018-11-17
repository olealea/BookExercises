package CH2_ElementaryProgramming;

/** (Print a table) Write a program that displays the following table. Cast floating-point
 numbers into integers.
 a  b   pow(a, b)
 1  2   1
 2  3   8
 3  4   81
 4  5   1024
 5  6   15625*/
public class ex18_PrintTable {
    public static void main(String[] args) {
        System.out.println("a       b       pow(a, b)");
        for(int i = 1; i <= 5; i++)
            System.out.println(i + "       " + (i + 1)
                    + "       " + (int)Math.pow(i, (i+1)));
    }
}
