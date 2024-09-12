package u;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import c.TestMe;
import c.Hybrid;


public class TestMeTests {

	TestMe testMe;
    Hybrid aHybrid;

	@Before
	public void setUp() throws Exception {
        testMe = new TestMe();
		aHybrid = new Hybrid();
    }

	@Test
	public void squareTest() {

		double baseValue = 3.0;
		double expected = baseValue*baseValue;
		testMe.setValue(3.0);
		double actual = testMe.square();

		assertTrue(actual == expected);
	}

    @Test
    public void MPGTest() {
        double expected = 120.0 / 20.0;
        aHybrid.setMilesfromGas(120.0);
        aHybrid.setGallonsfromGas(20.0);
        double actual = aHybrid.calcGasMPG();
        assertTrue(actual == expected);
    }

    @Test
	public void MPGeTest() {

		double expected = (300.0/70.0) * 33.7;
        aHybrid.setElectricMiles(300.0);
        aHybrid.setTotalkWh(70.0);
		double actual = aHybrid.calcMPGe();
		assertTrue(actual == expected);

	}

	@Test
	public void HybridTest() {

        aHybrid.setMilesfromGas(120.0);   
        aHybrid.setGallonsfromGas(20.0);  
    
        aHybrid.setElectricMiles(300.0);  
        aHybrid.setTotalkWh(70.0);        
        double gasMPG = aHybrid.calcGasMPG();         
        double electricMPGe = aHybrid.calcMPGe();    

        double expected = (gasMPG + electricMPGe) / 2.0;
        double actual = aHybrid.calcAverage();
        assertTrue(expected == actual);

	}

}
