// CONTAINS DUPLICATE TRUE OR FALSE

import java.util.*;
public class day3_2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

for(int i = 0; i<n; i++){
    arr[i] = sc.nextInt();
}
HashSet<Integer>set = new HashSet<>();
for(int i = 0; i<n; i++){
    if(set.contains (arr[i])){
        System.out.println(true);
        return;
    }
    set.add(arr[i]);
}
System.out.println(false);
}
    
}
