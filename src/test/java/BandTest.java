import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * Testy współpracy klas Band, Musician i Instrument.
 */
class BandTest {

    @Test
    void untunedInstrumentCannotBePlayed() {
        final Instrument guitar = new Instrument("gitara", InstrumentType.STRINGS);

        assertThrows(IllegalStateException.class, guitar::play);
    }

    @Test
    void musicianTunesInstrumentBeforePlaying() {
        final Instrument piano = new Instrument("pianino", InstrumentType.KEYS);
        final Musician musician = new Musician("Celina", piano);

        assertEquals("Celina: pianino (klawiszowe) gra", musician.perform());
        assertTrue(piano.isTuned());
    }

    @Test
    void rehearsalKeepsOrderOfMusicians() {
        final Band band = new Band("Test");
        band.addMusician(new Musician("Ania", new Instrument("gitara", InstrumentType.STRINGS)));
        band.addMusician(
                new Musician("Darek", new Instrument("perkusja", InstrumentType.PERCUSSION)));

        assertEquals(
                List.of("Ania: gitara (strunowe) gra", "Darek: perkusja (perkusyjne) gra"),
                band.rehearse());
    }

    @Test
    void countsMusiciansByInstrumentType() {
        final Band band = new Band("Test");
        band.addMusician(new Musician("Ania", new Instrument("gitara", InstrumentType.STRINGS)));
        band.addMusician(new Musician("Bartek", new Instrument("bas", InstrumentType.STRINGS)));
        band.addMusician(new Musician("Celina", new Instrument("pianino", InstrumentType.KEYS)));

        assertEquals(2, band.countByType(InstrumentType.STRINGS));
        assertEquals(0, band.countByType(InstrumentType.WIND));
    }
}
