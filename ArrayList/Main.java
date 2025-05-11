import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(10);
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.contains(3));

        System.out.println(list);

        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }

        // for(int x:list){
        //     System.out.println(x);
        // }
    }
}