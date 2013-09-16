import java.util.*;
import java.io.*;

class Filter {
    public static ArrayList<String> readFile(String filename) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(new File(filename));
        while (sc.hasNext()) {
            list.add(sc.nextLine());
        }
        sc.close();
        return list;
    }

    public static boolean isInterestingToMe(String line) {
        return (line.contains("CS")) && 
               (line.contains("BS") || line.contains("Bachelor's")) &&
               (line.contains("FT"));
    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> lines = readFile("list.txt");
        for (String line : lines) {
            if (isInterestingToMe(line)) {
                System.out.println(line);
            }
        } 
    }
}
