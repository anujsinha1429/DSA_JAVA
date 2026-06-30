import java.util.*;

public class que_06_divisor {
    public int[] divisor(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1;i<=Math.sqrt(n);i++){
            if (n%i==0){
                list.add(i);
                if (i!=n/i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        int[] ans=new int[list.size()];
        for (int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans ;
    }
    public static void main(String[] args){
        que_06_divisor ob1=new que_06_divisor();
        System.out.println(Arrays.toString(ob1.divisor(36)));



    }
}
