package III.Collections.Set;

import java.util.EnumSet;
import java.util.Set;

public class MyEnumSet {
    public static void main(String[] args) {
        EnumSet<Day> ngayLamViec = EnumSet.noneOf(Day.class);

        ngayLamViec.add(Day.MONDAY);
        ngayLamViec.add(Day.TUESDAY);
        ngayLamViec.add(Day.WEDNESDAY);
        ngayLamViec.add(Day.THURSDAY);
        ngayLamViec.add(Day.FRIDAY);

        EnumSet<Day> ngayNghi = EnumSet.complementOf(ngayLamViec);

        System.out.println("Ngày làm việc: " + ngayLamViec); // Output: Working days: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]
        System.out.println("Ngày nghỉ: " + ngayNghi); // Output: Weekend days: [SATURDAY, SUNDAY]

    }
}
