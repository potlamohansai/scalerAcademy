import java.util.*;
import java.util.stream.Stream;


class Main {
    public static void main(String[] args) {
      //creating a Square matrix
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(1); a1.add(2); a1.add(3);
        ArrayList<Integer> a2=new ArrayList<>();
        a2.add(4); a2.add(5); a2.add(6);
        ArrayList<Integer> a3=new ArrayList<>();
        a3.add(7); a3.add(8); a3.add(9);

        arr.add(a1); arr.add(a2); arr.add(a3);

        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                int temp=arr.get(i).get(j); // i j
                arr.get(i).set(j,arr.get(j).get(i));
                arr.get(j).set(i,temp);
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++) {
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
