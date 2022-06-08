package day08_ternaries_switch;
public class FieldTrip {
    public static void main(String[] args) {
        int grade = 4;
        String location = "";
        int numOfGroup = 0;
        String teacher = "";

        if ( grade >= 1 && grade <= 6 ) {
            if ( grade == 1 ) {
                location = "Apple Orchard";
                numOfGroup = 3;
                teacher = " Smith";
            } else if ( grade == 2 ) {
                location = "zoo";
                numOfGroup = 7;
                teacher = "lee";
            } else if ( grade == 3 ) {
                location = "Aquarium";
                numOfGroup = 5;
                teacher = " Wilson";
            } else if ( grade == 4 ) {
                location = "movie";
                numOfGroup = 2;
                teacher = "Reyes";
            } else if ( grade == 5 ) {
                location = "musium";
                numOfGroup = 5;
                teacher = "lala";
            } else {
                location = "six flag";
                numOfGroup = 6;
                teacher = "watt";
            }
        } else {
            location = " unknown";
            numOfGroup = 0;
            teacher = "Invalid location";
        }
        System.out.println("grade = " + grade);
        System.out.println("teacher = " + teacher);
        System.out.println("numOfGroup = " + numOfGroup);
        System.out.println("location = " + location);



       /* 2. Create a class called FieldTrip. Your school
        goes on a Field trip each year.The
       place you go will be based on your grade.
        Given a variable gradeNumber figure out the details
        of your field trip. Print the information at the end.
        Data based on grade:
        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith
        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee
        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson
        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes
        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela
        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
        for any other gradeNumber:
        location - Unknown
        number of groups - 0
        teacher in charge - Unknown*/


    }

}