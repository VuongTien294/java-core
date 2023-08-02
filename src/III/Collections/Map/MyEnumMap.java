package III.Collections.Map;

import java.util.EnumMap;
import java.util.Map;

public class MyEnumMap {
    public static void main(String[] args) {
        // create enum map
        EnumMap<Day, String> enumMap = new EnumMap<Day, String>(Day.class);
        // add element to map
        enumMap.put(Day.Monday, "1");
        enumMap.put(Day.Tuesday, "2");
        enumMap.put(Day.Wednesday, "3");
        enumMap.put(Day.Thursday, "4");
        enumMap.put(Day.Friday, "5");
        // show map
        for (Map.Entry<Day, String> map : enumMap.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
