import java.time.LocalDate;
import java.time.LocalDateTime;
import java.lang.Math;

class Gigasecond {
    private LocalDateTime birthday;
    private long addSeconds = (long) Math.pow(10, 9);

    Gigasecond(LocalDate birthDate) {
        this(birthDate.atStartOfDay()); // calls the other constructor by changing localDate to localDateTime
    }

    Gigasecond(LocalDateTime birthDateTime) {
        birthday = birthDateTime;
    }

    LocalDateTime getDate() {
        return birthday.plusSeconds(addSeconds);
    }

}
