import java.util.Objects;

/**
 * Muzyk grający na jednym instrumencie.
 */
public class Musician {
    private final String name;
    private final Instrument instrument;

    /**
     * Tworzy muzyka.
     *
     * @param name imię muzyka
     * @param instrument instrument, na którym gra
     */
    public Musician(final String name, final Instrument instrument) {
        this.name = Objects.requireNonNull(name, "name");
        this.instrument = Objects.requireNonNull(instrument, "instrument");
    }

    public String getName() {
        return name;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    /**
     * Stroi instrument, jeśli trzeba, i gra na nim.
     *
     * @return opis występu muzyka
     */
    public String perform() {
        if (!instrument.isTuned()) {
            instrument.tune();
        }
        return name + ": " + instrument.play();
    }
}
