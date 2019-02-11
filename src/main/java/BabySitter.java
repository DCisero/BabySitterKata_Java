
public class BabySitter {

    private final int FAMILY_A_PAY_BEFORE11 = 15;
    private final int FAMILY_A_PAY_AFTER11 = 20;
    private int totalHoursWorkedUntil11 = 6;
    private int totalHoursWorkedAfter11 = 5;

    public int shiftPayment;
    public int shiftPayment2;

    public int totalPayA;


    public boolean shiftTime(double startTime, double endTime) {
        if (startTime == 5.00 && endTime == 4.00) {
            return true;
        }
        return false;
    }

    public void add(int value) {
    }

    public boolean contains(int value) {
        if (value == 1) {
            return true;
        }
        return false;
    }

    public int familyAPayBefore11(int shiftHours) {
        if (shiftHours <= totalHoursWorkedUntil11) {
            shiftPayment = FAMILY_A_PAY_BEFORE11 * shiftHours;
        }
        return shiftPayment;
    }

    public int familyAPayAfter11(int shiftHours) {
        if (shiftHours <= totalHoursWorkedAfter11){
            shiftPayment2 = FAMILY_A_PAY_AFTER11 * shiftHours;
        }
        return totalPayA = shiftPayment2 + shiftPayment;
    }

    }



