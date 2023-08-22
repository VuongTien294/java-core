package DocFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocFile {
    public static String filePath = "D:/FriendSub/EngSub.txt";
    public static String filePath3 = "D:/FriendSub/Result.txt";
    public static String regex = ".*[0-9].*";

    private static boolean checkPatter(String number) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);

        return matcher.matches();
    }

    private static Map<Integer, List<String>> getEngSub() throws Exception {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fileReader);
        Map<Integer, List<String>> map = new HashMap<>();
        int i = 0;
        String line;
        while ((line = br.readLine()) != null) {
            if (checkPatter(line)) {
                i++;
                map.put(i, new ArrayList<>());
            } else {
                List<String> list = map.get(i);
                list.add(line);
            }
        }
        return map;

    }

    private static void write(Map<Integer, List<String>> map) throws Exception {
        FileWriter fileWriter = new FileWriter(filePath3);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        for (Map.Entry<Integer, List<String>> entryEng : map.entrySet()) {
            for(int i = 0;i < entryEng.getValue().size();i++){
                bw.write("* "+entryEng.getValue().get(i)+" :" + "\n");
                bw.write("\n");
            }
        }
        bw.close();
    }

    public static void main(String[] args) throws Exception {
          Map<Integer, List<String>> mapEndSub = getEngSub();
          write(mapEndSub);

    }
}
