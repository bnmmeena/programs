import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]){
        TreeMap<Integer,Integer> hp=new TreeMap<Integer,Integer>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            if(a[i]==a[j])
            c++;
            hp.put(a[i],c);
            c=0;
        }
  
        Iterator itr = hp.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry mapElement = (Map.Entry)itr.next();
            // Printing mark corresponding to string entries
            System.out.println(mapElement.getKey() + " aparece "
                               + mapElement.getValue()+" vez(es)");
        }
    }
}