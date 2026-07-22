import java.io.*;
import java.util.*;

class Prime {
    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String values = br.readLine();

        String[] val = values.split(",");

        Map<Integer, Integer> mpp = new HashMap<>();

        for (String num : val) {
            int x = Integer.parseInt(num);
            mpp.put(x, mpp.getOrDefault(x, 0) + 1);
        }

        System.out.println(mpp);
    }
}