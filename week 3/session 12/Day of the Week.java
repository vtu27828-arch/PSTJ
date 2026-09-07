import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {

        LocalDate date = LocalDate.of(year, month, day);

        return date.getDayOfWeek().toString();
    }
}

Input
day = 31
month = 8
year = 2019
Output
SATURDAY
