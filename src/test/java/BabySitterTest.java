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

        //Family B pays $12 per hour before 10pm
        @Test
        public void FamilyBPayStartUntil10(){

            sitter.shiftTime(5,10);
            sitter.shiftTime(7,10);

            int shiftHours = 5;
            int shiftHours2 = 3;

            assertEquals(60, sitter.familyBPayUntil10(shiftHours));
            assertEquals(36, sitter.familyBPayUntil10(shiftHours2));

        }

        //Family B pays $8 per hour between 10pm and 12am
        @Test
        public void FamilyBPay10Until12(){

            sitter.shiftTime(10,12);

            int shiftHours = 2;

            assertEquals(16, sitter.familyBPayUntil12(shiftHours));

        }

        //Family B pays $16 per hour after 12am
        @Test
        public void FamilyBPay12UntilEnd(){

            sitter.shiftTime(12,4);
            sitter.shiftTime(12,2);

            int shiftHours = 4;
            int shiftHours2 = 2;

            assertEquals(64, sitter.familyBPayUntilEnd(shiftHours));
            assertEquals(32, sitter.familyBPayUntilEnd(shiftHours2));

        }

        //Family C pays $21 per hour before 9pm
        @Test
        public void FamilyCPayUntil9(){

            sitter.shiftTime(5,9);
            sitter.shiftTime(7,9);

            int shiftHours = 4;
            int shiftHours2 = 2;

            assertEquals(84, sitter.familyCPayUntil9(shiftHours));
            assertEquals(42, sitter.familyCPayUntil9(shiftHours2));

        }

        //Family C pays $15 per hour after 9pm
        @Test
        public void FamilyCPayAfter9(){

            sitter.shiftTime(9,4);
            sitter.shiftTime(9,1);

            int shiftHours = 7;
            int shiftHours2 = 4;

            assertEquals(105, sitter.familyCPayAfter9(shiftHours));
            assertEquals(60, sitter.familyCPayAfter9(shiftHours2));
        }


    }


