
public class DayOfWeek {
	public static void main(String[] args) {
		int day = 1;
		int month = 4;
		int year = 2020;
		
		System.out.println("For " + month + "/" + day + "/" + year);
		
		// Take the last two digits of the year.
		int dayofweek =  year % 100;
        System.out.println("Step 1: Take the last two digits of the year = " + dayofweek);

		// Divide by 4, discarding any fraction.
		dayofweek = dayofweek / 4;
        System.out.println("Step 2: Divide by 4, discarding any fraction = " + dayofweek);
        
		// Add the day of the month.
		dayofweek += day;
        System.out.println("Step 3: Add the day of the month = " + dayofweek);		
		
		// Add the month's key value: JFM AMJ JAS OND 144 025 036 146
		int[] add_month = {1,4,4,0,2,5,0,3,6,1,4,6};
		dayofweek += add_month[month-1];
        System.out.println("Step 4: Add the month's key value = " + dayofweek);		
		
		// Subtract 1 for January or February of a leap year.
        //if (year % 4 == 0 && month <=2)
        //	dayofweek -= 1;
        
		// Add 0 for 1900's, 6 for 2000's, 4 for 1700's, 2 for 1800's; for other years, add or subtract multiples of 400.
		dayofweek += 6;
        System.out.println("Step 5: Add 6 for 2000's = " + dayofweek);		

		// Add the last two digits of the year.
        dayofweek += year % 100;
        System.out.println("Step 6: Add the last two digits of the year = " + dayofweek);
        
		// Divide by 7 and take the remainder.
		dayofweek = dayofweek % 7;
        System.out.println("Step 7: Divide by 7 and take the remainder = " + dayofweek);
				
        System.out.println("Day of week: " + dayofweek);
        
		String[] weekday = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Day of week: " + weekday[dayofweek-1]);

	}

}
