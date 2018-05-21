import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpaceAgeTest {
    
    SpaceAge spaceAge;

    @Before
    public void setUp() {
        spaceAge = new SpaceAge(25);
    }

    @Test
    public void getMercuryAge() {
        assertEquals(103.80, spaceAge.mercuryAge(), 0.01);
    }

    @Test
    public void getVenusAge() {
        assertEquals(40.64, spaceAge.venusAge(), 0.01);
    }

    @Test
    public void getEarthAge() {
        assertEquals(25, spaceAge.EarthAge(), 0.01);
    }

    @Test
    public void getMarsAge() {
        assertEquals(13.29, spaceAge.marsAge(), 0.01);
    }

    @Test
    public void getJupiterAge() {
        assertEquals(2.10, spaceAge.jupiterAge(), 0.01);
    }

    @Test
    public void getSaturnAge() {
        assertEquals(0.85, spaceAge.saturnAge(), 0.1);
    }

    @Test
    public void getUranusAge() {
        assertEquals(0.30, spaceAge.uranusAge(), 0.1);
    }

    @Test
    public void getNeptuneAge() {
        assertEquals(0.15, spaceAge.neptuneAge(), 0.1);
    }

    @Test
    public void getPlutoAge() {
        assertEquals(0.10, spaceAge.plutoAge(), 0.1);
    }
}
