import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

    public class BabySitterTest {

        BabySitter sitter;

        @Before
        public void setUp() {

            sitter = new BabySitter();
        }

        //start time 5 and end time 4
        @Test
        public void StartTimeIsNoEarlierThan5Pm_EndTimeIsNoLaterThan4Am() {

            assertTrue(sitter.shiftTime(5.00, 4.00));
            assertFalse(sitter.shiftTime(3.00, 8.30));
            assertFalse(sitter.shiftTime(1.00, 10.30));
            assertFalse(sitter.shiftTime(4.00, 6.30));
        }

        @Test
        public void ValidateOneFamilyPerNight(){

            sitter.add(1);

            boolean familyPerNight = sitter.contains(1);

            assertTrue(familyPerNight);
            assertFalse(sitter.contains(2));
            assertFalse(sitter.contains(3));

        }

        //Family A pays $15 per hour before 11pm
        @Test
        public void FamilyAPayStartUntil11(){

            sitter.shiftTime(5,11);
            sitter.shiftTime(6,10);

            int shiftHours = 6;
            int shiftHours2 = 4;

            assertEquals(90, sitter.familyAPayBefore11(shiftHours));
            assertEquals(60, sitter.familyAPayBefore11(shiftHours2));

        }

        //Family A pays $20 per hour after 11pm
        @Test
        public void FamilyAPayAfter11UntilEnd(){

            sitter.shiftTime(11,2);
            sitter.shiftTime(12,4);

            int shiftHours = 3;
            int shiftHours2 = 4;

            assertEquals(60, sitter.familyAPayAfter11(shiftHours));
            assertEquals(80, sitter.familyAPayAfter11(shiftHours2));

        }

    }


