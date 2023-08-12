import java.util.*;

public class Trial {
    public static void nope(String[] args) {
//        System.out.println("yo");
//        String s = "Hello World ";
//        s = s.trim();
//        //System.out.println("Last" + s.charAt(s.length()-3) + "Yes");
//
//        System.out.println(s.trim().length());
//        System.out.println(s.lastIndexOf(' '));
//        int len = s.trim().length() - s.lastIndexOf(' ');
//        System.out.println(len);
//
//        //Integer.t
//        String a = "111";
//        int b = a.charAt(2) - '0';
//
//        System.out.println("b: " + b);

        //String s = "A man, a plan, a canal: Panama";

        //StringBuilder builder = new StringBuilder();

//        for (Character ch: s.toCharArray()) {
//            if(Character.isLetterOrDigit(ch)) {
//                builder.append(Character.toLowerCase(ch));
//            }
//        }
//
//        System.out.println(builder.toString());
//
//        if((builder.toString()).equals(builder.reverse().toString())){
//            System.out.println("true");
//        }

//        s.chars()
//                .filter(c -> Character.isLetterOrDigit(c))
//                .mapToObj(c -> Character.toLowerCase((char)c))
//                .forEach(c -> builder.append(c));
//        System.out.println("builder" + builder.toString());
//        BinarySearch bs = new BinarySearch();
//        int[] nums = {-1,0,3,5,9,12};
//
//        int res = bs.searchAlgo(nums, 2);
//
//        System.out.println("Result : " + res);
//        String s1 = "abc";
//        String ans = "";
//
//        List<Integer> current = new ArrayList(new ArrayList<Integer>());
//        //printPermutn(s1,ans);
//        Set<int[]> queue = new HashSet<>();
//        queue.add(new int[] {0,1});
//        queue.remove(new int[] {0,1});
//        System.out.println("queue: " + queue);
//        System.out.println("isEmpty: " + queue.isEmpty());
//
//        //queueFresh: [[0,1],[0,2],[1,0],[1,1],[2,1],[2,2]]
//        System.out.println("poll: " + queue.contains(new int[] {0,1}));


//        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
//        for(int[] dir: dirs) {
//
//        }
//        Integer[] arr = new Integer[10];
//        arr[0] = 1;
//        String s = "abbc";
//        StringBuilder sb = new StringBuilder(s);

//        System.out.println(-1*Integer.MIN_VALUE);

//        String y = "    It is done ";
//        String a = "flower";
//        String b = "flow";
        //System.out.println(b.indexOf(a));

        String i ="11";
        String j = "1";

        int actual = Integer.parseInt(i);
        int actual2 = Integer.parseInt(j);
        ArrayList<Integer> yo = new ArrayList<>();
        //Character.

        int sum = actual | actual2 ;
//        System.out.println(actual);
//        System.out.println(actual2);
//        System.out.println(sum);
//        y = y.trim();
//        int n = y.length();
//        System.out.println(n);
//        for(int i=y.length()-1; i>=0; i--){
//            //System.out.println(y.charAt(i));
//            if(Character.isWhitespace(y.charAt(i))) {
//                System.out.println(y.substring(i+1).length());
//                break;
//            }
//        }
        //System.out.println(y);

        int[] array = new int[5];
        int[][] p = {
                {1,2,3,4},
                {5,6,7,8},
                {9,8,7,6}
        };
        //Random random = new Random();
//        for(int x: array) {
//            x = random.nextInt(50);
//            System.out.println(x);
//        }

        for(int[] a: p){
            for(int x: a){
                System.out.print(x);
            }
            System.out.println("");
        }
    }

    static void printPermutn(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }
}
