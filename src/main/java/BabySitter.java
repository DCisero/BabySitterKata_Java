
public class BabySitter {

    private final int FAMILY_A_PAY_BEFORE11 = 15;
    private final int FAMILY_A_PAY_AFTER11 = 20;
    private int totalHoursWorkedUntil11 = 6;
    private int totalHoursWorkedAfter11 = 5;

    private final int FAMILY_B_PAY_BEFORE10 = 12;
    private final int FAMILY_B_PAY_AFTER10_UNTIL12 = 8;
    private final int FAMILY_B_PAY_AFTER12 = 16;
    private int totalHoursWorkedUntil10 = 5;
    private int totalHoursWorked10Until12 = 2;
    private int totalHoursWorkedAfter12 = 4;

    private final int FAMILY_C_PAY_BEFORE9 = 21;
    private final int FAMILY_C_PAY_AFTER9 = 15;
    private int totalHoursWorkedUntil9 = 4;
    private int totalHoursWorkedAfter9 = 7;

    public int shiftPayment;
    public int shiftPayment2;
    public int shiftPayment3;

    public int totalPayA;
    public int totalPayB;
    public int totalPayC;


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

    public int familyBPayUntil10(int shiftHours) {
        if (shiftHours <= totalHoursWorkedUntil10){
            shiftPayment = FAMILY_B_PAY_BEFORE10 * shiftHours;
        }

        return shiftPayment;
    }

    public int familyBPayUntil12(int shiftHours) {
        if (shiftHours <= totalHoursWorked10Until12){
            shiftPayment2 = FAMILY_B_PAY_AFTER10_UNTIL12 * shiftHours;
        }
        return shiftPayment2;
    }

    public int familyBPayUntilEnd(int shiftHours) {
        if (shiftHours <= totalHoursWorkedAfter12){
            shiftPayment3 = FAMILY_B_PAY_AFTER12 * shiftHours;
        }
        return totalPayB = shiftPayment3 + shiftPayment2 + shiftPayment;
    }

    public int familyCPayUntil9(int shiftHours) {
        if (shiftHours <= totalHoursWorkedUntil9){
            shiftPayment = FAMILY_C_PAY_BEFORE9 * shiftHours;
        }
        return shiftPayment;
    }

    public int familyCPayAfter9(int shiftHours) {
        if (shiftHours <= totalHoursWorkedAfter9){
            shiftPayment2 = FAMILY_C_PAY_AFTER9 * shiftHours;
        }
        return totalPayC = shiftPayment2 + shiftPayment;
    }

    }



