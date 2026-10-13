/**
 * Punkt wejścia: składa przykładowy zespół i przeprowadza próbę.
 */
public final class App {
    private App() {
    }

    /**
     * Uruchamia aplikację.
     *
     * @param args argumenty wiersza poleceń (nieużywane)
     */
    public static void main(final String[] args) {
        final Band band = new Band("Maven");
        band.addMusician(new Musician("KONFLIKT!!!!", new Instrument("gitara", InstrumentType.STRINGS)));
        band.addMusician(new Musician("Bartek", new Instrument("bas", InstrumentType.STRINGS)));
        band.addMusician(new Musician("Celina", new Instrument("pianino", InstrumentType.KEYS)));
        band.addMusician(
                new Musician("Darek", new Instrument("perkusja", InstrumentType.PERCUSSION)));

        System.out.println("Próba zespołu " + band.getName());
        for (final String performance : band.rehearse()) {
            System.out.println("  " + performance);
        }
        System.out.println("Instrumenty strunowe: " + band.countByType(InstrumentType.STRINGS));
    }
}
