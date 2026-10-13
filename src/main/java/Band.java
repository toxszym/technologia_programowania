import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Zespół muzyczny złożony z muzyków.
 */
public class Band {
    private final String name;
    private final List<Musician> musicians = new ArrayList<>();
    // private int unused;

    /**
     * Tworzy pusty zespół.
     *
     * @param name nazwa zespołu
     */
    public Band(final String name) {
        this.name = Objects.requireNonNull(name, "name");
    }

    public String getName() {
        return name;
    }

    public List<Musician> getMusicians() {
        return Collections.unmodifiableList(musicians);
    }

    /**
     * Dodaje muzyka do zespołu.
     *
     * @param musician nowy członek zespołu
     */
    public void addMusician(final Musician musician) {
        musicians.add(Objects.requireNonNull(musician, "musician"));
    }

    /**
     * Liczy muzyków grających na instrumentach z danej rodziny.
     *
     * @param type rodzina instrumentów
     * @return liczba muzyków
     */
    public long countByType(final InstrumentType type) {
        return musicians.stream()
                .filter(musician -> musician.getInstrument().getType() == type)
                .count();
    }

    /**
     * Przeprowadza próbę: każdy muzyk po kolei gra na swoim instrumencie.
     *
     * @return opisy występów w kolejności dołączania do zespołu
     */
    public List<String> rehearse() {
        final List<String> performances = new ArrayList<>(musicians.size());
        for (final Musician musician : musicians) {
            performances.add(musician.perform());
        }
        return performances;
    }
}
