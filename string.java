import java.lang.reflect.Array;
import java.util.*;
class string {
     public static void main(String[] args) {
        Vector<Integer>vt=new  Vector<>();
        vt.addAll(List.of(1,2,3,4));
        // System.out.print(vt);
       //System.out.print(vt.capacity());
      // System.out.print(vt.isEmpty());
     // System.out.print(vt.lastIndexOf(4));
      vt.insertElementAt(3,1);
      System.out.print(vt);
      Arrays.sort(args);
     }
}
