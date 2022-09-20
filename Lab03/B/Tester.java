public class Tester {
    public static void main(String[] args) {
       Clock clock = new Clock();

        System.out.println("Current Time is " + clock.getHour()+" hours " +
                clock.getMinute()+" minutes " +
                clock.getSecond()+" seconds ");

        clock.tick(); //increment by 1

        System.out.println("Current Time is "+clock.getHour()+" hours " +
                clock.getMinute()+" minutes " +
                clock.getSecond()+" seconds ");

        clock.tickAhead(1); //increment by 1

        System.out.println("Current Time is " + clock.getHour()+" hours " +
                clock.getMinute()+" minutes " +
                clock.getSecond()+" seconds ");

        clock.tickAhead(5); //increment by 5

        System.out.println("Current Time is " + clock.getHour()+" hours " +
                clock.getMinute()+" minutes " +
                clock.getSecond() + " seconds ");

        clock.tickAhead(60); //increment by 1 minute

        System.out.println("Current Time is " + clock.getHour() + " hours " +
                clock.getMinute()+" minutes " +
                clock.getSecond()+" seconds ");

        clock.tickAhead(3600); ////increment by 1 hour

        System.out.println("Current Time is " + clock.getHour() + " hours " +
                clock.getMinute()+" minutes " +
                clock.getSecond()+" seconds ");

        clock.tickAhead(86400); //increment by 24 hour

        System.out.println("Current Time is " + clock.getHour()+" hours " +
                clock.getMinute()+" minutes " +
                clock.getSecond()+" seconds ");
    }

}
