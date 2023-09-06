package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;
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
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));

    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        char firstChar = job.toString().charAt(0);
        char lastChar = job.toString().charAt(job.toString().length()-1);
        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));

        String jobString = job.toString();

        assertTrue(jobString.contains("ID: "));
        assertTrue(jobString.contains("Name: Web Developer"));
        assertTrue(jobString.contains("Employer: LaunchCode"));
        assertTrue(jobString.contains("Location: StL"));
        assertTrue(jobString.contains("Position Type: Back-end developer"));
        assertTrue(jobString.contains("Core Competency: Java"));
    }

}
