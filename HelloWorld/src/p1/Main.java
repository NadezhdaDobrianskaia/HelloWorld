/**
 * 
 */
package p1;

/**
 * @author Nadezhdalap
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int x=5;
        switch (x)
        {
        case 3 : x += 1;
        
        case 4 : x += 2;
        case 5 : x += 3;
        
        case 6 : x++;
        case 7 : x += 2;
        case 8 : x--;
        
        case 9 : x++;
        
        }
        System.out.println(x);


    }

}
