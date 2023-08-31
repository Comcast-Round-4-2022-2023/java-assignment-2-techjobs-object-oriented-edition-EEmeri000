package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job2.getId(), job1.getId());

    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("Product tester", job1.getName());
        assertTrue(job1.getName() instanceof String);
        assertEquals("ACME", job1.getEmployer().toString());
        assertTrue(job1.getEmployer() instanceof Employer);
        assertEquals("Desert", job1.getLocation().toString());
        assertTrue(job1.getLocation() instanceof Location);
        assertEquals("Quality control", job1.getPositionType().toString());
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertEquals("Persistence", job1.getCoreCompetency().toString());
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
    }
}
