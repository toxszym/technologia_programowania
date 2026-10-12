import java.util.Objects;

/**
 * Instrument muzyczny, który trzeba nastroić, zanim da się na nim zagrać.
 */
public class Instrument {
    private final String name;
    private final InstrumentType type;
    private boolean tuned;

    /**
     * Tworzy nienastrojony instrument.
     *
     * @param name nazwa instrumentu, np. "gitara"
     * @param type rodzina instrumentu
     */
    public Instrument(final String name, final InstrumentType type) {
        this.name = Objects.requireNonNull(name, "name");
        this.type = Objects.requireNonNull(type, "type");
    }

    public String getName() {
        return name;
    }

    public InstrumentType getType() {
        return type;
    }

    public boolean isTuned() {
        return tuned;
    }

    /**
     * Stroi instrument.
     */
    public void tune() {
        tuned = true;
    }

    /**
     * Gra na instrumencie.
     *
     * @return opis zagranego dźwięku
     * @throws IllegalStateException gdy instrument nie jest nastrojony
     */
    public String play() {
        if (!tuned) {
            throw new IllegalStateException("Instrument nie jest nastrojony: " + name);
        }
        return name + " (" + type.getLabel() + ") gra";
    }
}
