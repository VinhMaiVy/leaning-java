
public class DayOfWeek {
	public static void main(String[] args) {
		int day = 1;
		int month = 4;
		int year = 2020;
		
		System.out.println("For " + month + "/" + day + "/" + year);
		
		// Take the last two digits of the year.
		int workday =  year % 100;
        System.out.println("Step 1: Take the last two digits of the year = " + workday);

		// Divide by 4, discarding any fraction.
		workday = workday / 4;
        System.out.println("Step 2: Divide by 4, discarding any fraction = " + workday);
        
		// Add the day of the month.
		workday += day;
        System.out.println("Step 3: Add the day of the month = " + workday);		
		
		// Add the month's key value: JFM AMJ JAS OND 144 025 036 146
		int[] add_month = {1,4,4,0,2,5,0,3,6,1,4,6};
		workday += add_month[month-1];
        System.out.println("Step 4: Add the month's key value = " + workday);		
		
		// Subtract 1 for January or February of a leap year.
        //if (year % 4 == 0 && month <=2)
        //	workday -= 1;
        
		// Add 0 for 1900's, 6 for 2000's, 4 for 1700's, 2 for 1800's; for other years, add or subtract multiples of 400.
		workday += 6;
        System.out.println("Step 5: Add 6 for 2000's = " + workday);		

		// Add the last two digits of the year.
        workday += year % 100;
        System.out.println("Step 6: Add the last two digits of the year = " + workday);
        
		// Divide by 7 and take the remainder.
		workday = workday % 7;
        System.out.println("Step 7: Divide by 7 and take the remainder = " + workday);
				
        System.out.println("Day of week: " + workday);
        
		String[] weekday = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Day of week: " + weekday[workday-1]);

	}

}
