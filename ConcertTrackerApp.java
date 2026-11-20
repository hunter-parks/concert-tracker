import java.time.LocalDate;
import java.util.List;

public class ConcertTrackerApp {

    public static void main(String[] args) {
        List<Concert> concerts = List.of(
                new Concert(
                        "Metallica",
                        "AT&T Stadium",
                        "Arlington",
                        LocalDate.of(2027, 6, 12)),
                new Concert(
                        "Linkin Park",
                        "Moody Center",
                        "Austin",
                        LocalDate.of(2027, 8, 15)));

        System.out.println("=== CONCERT TRACKER ===\n");

        for (int i = 0; i < concerts.size(); i++) {
            printConcert(i + 1, concerts.get(i));

            // Only print a blank line if there is another concert after this one
            if (i < concerts.size() - 1) {
                System.out.println();
            }
        }
    }

    private static void printConcert(int number, Concert concert) {
        System.out.println("Concert " + number);
        System.out.println("Artist: " + concert.getArtistName());
        System.out.println("Venue: " + concert.getVenueName());
        System.out.println("City: " + concert.getConcertCity());
        System.out.println("Date: " + concert.getConcertDate());
        System.out.println("Attended: " + concert.isAttended());
    }
}