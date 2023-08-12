import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Bubble Sort -> O(n^2)");
//
//        Random rand = new Random();
//        int[] randomArray = new int[10];
//
//        for(int r=0; r< randomArray.length; r++) {
//            randomArray[r] = rand.nextInt(1000000);
//        }
//
//        //int[] random = {43, 75, 11, 9, 36};
//
//        boolean swappedSomething = true;
//
//        while(swappedSomething) {
//
//            swappedSomething = false;
//            for (int i = 0; i < randomArray.length - 1; i++) {
//                if(randomArray[i] > randomArray[i+1]) {
//                    swappedSomething = true;
//                    swap(i, i+1, randomArray);
//                }
//            }
//        }

//        for(int a=0; a< randomArray.length; a++) {
//            System.out.println(randomArray[a]);
//        }
//        Abc obj = new Abc(6);

//        for (int i:
//             random) {
//            System.out.println(random[i]);
//        }
        String s = "egg";
        String t = "add";

        HashMap<Character, Integer> hmS = new HashMap();
        HashMap<Character, Integer> hmT = new HashMap();

        for(int i=0; i<s.length(); i++) {
            if(hmS.containsKey(s.charAt(i))) {
                int count = hmS.get(s.charAt(i));
                hmS.put(s.charAt(i), ++count);
            } else {
                hmS.put(s.charAt(i), 1);
            }

            if(hmT.containsKey(t.charAt(i))) {
                int count = hmT.get(t.charAt(i));
                hmT.put(t.charAt(i), ++count);
            } else {
                hmT.put(t.charAt(i), 1);
            }
        }

        Object[] arrS = hmS.values().toArray();
        Object[] arrT = hmT.values().toArray();

        Arrays.equals(arrS, arrT);
    }

    public static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

class Abc {
    public Abc(double d) {
        System.out.println("Double: " + d);
    }
    public Abc(int i) {
        System.out.println("Int: " + i);
    }
}
