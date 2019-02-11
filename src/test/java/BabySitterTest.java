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

    }


