public class testDate {
    public static void main(String[] args) {
        //create object dl call method in class date
        date d1 = new date(2025 , 8,2) ;
        //System.out.println(d1.toString());
        System.out.println(d1);

        System.out.println("change Year");

        d1.setYear(2024);
        System.out.println(d1);
        System.out.println("change month and day");
        d1.setMonth(12);
        d1.setDay(23);
        System.out.println(d1);

        System.out.println("Year is "+ d1.getYear());
        System.out.println("Month is "+ d1.getMonth());

        d1.setDate(2023, 1, 23);
        System.out.println(d1);

    }
    

}
