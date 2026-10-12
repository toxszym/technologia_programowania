/**
 * Rodzina instrumentów muzycznych.
 */
public enum InstrumentType {
    STRINGS("strunowe"),
    KEYS("klawiszowe"),
    PERCUSSION("perkusyjne"),
    WIND("dęte");

    private final String label;

    InstrumentType(final String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
