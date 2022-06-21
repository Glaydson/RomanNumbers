import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) throws Exception {

        if (s == null || s.isEmpty()) throw new Exception("Roman Number is null or empty");

        Map<Character, Integer> mapRomans = new HashMap<>();
        mapRomans.put('I', 1);
        mapRomans.put('V', 5);
        mapRomans.put('X', 10);
        mapRomans.put('L', 50);
        mapRomans.put('C', 100);
        mapRomans.put('D', 500);
        mapRomans.put('M', 1000);

        int number = 0;

        for (int i = 0; i < s.length(); i++) {

            Character c = s.charAt(i);
            if (mapRomans.get(s.charAt(i)) == null) {
                throw new Exception("Invalid character in roman number.");
            }

            if (i > 0 && mapRomans.get(s.charAt(i)) > mapRomans.get(s.charAt(i - 1))) {
                number += mapRomans.get(s.charAt(i)) - 2 * (mapRomans.get(s.charAt(i - 1)));
            } else {
                number += mapRomans.get(s.charAt(i));
            }
        }
        return number;
    }
}
