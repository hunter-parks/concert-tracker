import java.time.LocalDate;

public class Concert {
    private String artistName;
    private String venueName;
    private String concertCity;
    private LocalDate concertDate;
    private boolean attended;

    public Concert(String artistName, String venueName, String concertCity, LocalDate concertDate) {

        this.artistName = artistName;
        this.venueName = venueName;
        this.concertCity = concertCity;
        this.concertDate = concertDate;
        this.attended = false;
    }

    // Getters
    public String getArtistName() {
        return artistName;
    }

    public String getVenueName() {
        return venueName;
    }

    public String getConcertCity() {
        return concertCity;
    }

    public LocalDate getConcertDate() {
        return concertDate;
    }

    public boolean isAttended() {
        return attended;
    }

}
