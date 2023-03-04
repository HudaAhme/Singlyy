/**
 * Created by DELL on 25/01/2023.
 */
public class Testing {
    public static void main(String[] args) {

        SingleLinkedList<Integer>H=new SingleLinkedList<>();

        H.addfirst(56);
        H.addfirst(90);
        H.addfirst(70);
        H.revers();
        H.rotate();


       System.out.println(H.toString());
        System.out.println(H.Mysize());
        System.out.println(H.first());
        System.out.println(H.first());
        System.out.println(H.last());

        for (int i = 0; i <H.size() ; i++) {
            System.out.println(H.getClass());


        }


    }
}
