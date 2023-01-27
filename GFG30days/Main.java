package GFG30days;

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, ind=0;
        String min;

        n = sc.nextInt();
        String[] name = new String[n];
        String[] qual = new String[n];
        String[] gen = new String[n];
        String[] exp = new String[n];

        for(i=0; i<n; i++){
            name[i]=sc.nextLine();
            qual[i]=sc.nextLine();
            gen[i]=sc.nextLine();
            exp[i]=sc.nextLine();
        }

        String[] dexp = exp.clone();
        //Arrays.sort(dexp);
        Arrays.sort(dexp, Collections.reverseOrder());

        for(i=0; i<n; i++){
            min=dexp[i];  // Min Exp Suppose

            for(j=0; j<n; j++){
                if(Objects.equals(exp[j], min)){
                    ind = j;
                    break;
                }
            }

            System.out.println(name[ind]);
            System.out.println(qual[ind]);
            //System.out.println(gen[ind]);
            System.out.println(exp[ind]);
            exp[ind]="a";
        }

    }
};