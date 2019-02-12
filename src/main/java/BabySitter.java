
public class BabySitter {

    private final int FAMILY_A_PAY_BEFORE11 = 15;
    private final int FAMILY_A_PAY_AFTER11 = 20;
    private int[] hoursA = {5,6,7,8,9,10};
    private int[] hoursA2 = {11,12,1,2,3,4};

    private final int FAMILY_B_PAY_BEFORE10 = 12;
    private final int FAMILY_B_PAY_AFTER10_UNTIL12 = 8;
    private final int FAMILY_B_PAY_AFTER12 = 16;
    private int[] hoursB = {5,6,7,8,9};
    private int[] hoursB2 = {10,11};
    private int[] hoursB3 = {12,1,2,3};

    private final int FAMILY_C_PAY_BEFORE9 = 21;
    private final int FAMILY_C_PAY_AFTER9 = 15;
    private int[] hoursC = {5,6,7,8};
    private int[] hoursC2 = {9,10,11,12,1,2,3};

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

    public int familyAPayBefore11(int[] shiftHours) {
        for (int i = 0; i <= shiftHours.length; i++) {
            if (shiftHours.equals(i) == hoursA.equals(i)) {
                shiftPayment = FAMILY_A_PAY_BEFORE11 * shiftHours.length;
            }
        }
        return shiftPayment;
    }

    public int familyAPayAfter11(int[] shiftHours) {
        for (int i = 0; i <= shiftHours.length; i++) {
            if (shiftHours.equals(i) == hoursA2.equals(i)) {
                shiftPayment2 = FAMILY_A_PAY_AFTER11 * shiftHours.length;
            }
        }
        return totalPayA = shiftPayment2 + shiftPayment;
    }

    public int familyBPayUntil10(int[] shiftHours) {
        for (int i = 0; i <= shiftHours.length; i++)
            if (shiftHours.equals(i) == hoursB.equals(i)){
                shiftPayment = FAMILY_B_PAY_BEFORE10 * shiftHours.length;
            }
        return shiftPayment;
    }

    public int familyBPayUntil12(int[] shiftHours) {
        for (int i = 0; i <= shiftHours.length; i++)
            if (shiftHours.equals(i) == hoursB2.equals(i)){
                shiftPayment2 = FAMILY_B_PAY_AFTER10_UNTIL12 * shiftHours.length;
            }
        return shiftPayment2;
    }

    public int familyBPayUntilEnd(int[] shiftHours) {
        for (int i = 0; i <= shiftHours.length; i++)
            if (shiftHours.equals(i) == hoursB3.equals(i)){
                shiftPayment3 = FAMILY_B_PAY_AFTER12 * shiftHours.length;
            }
        return totalPayB = shiftPayment3 + shiftPayment2 + shiftPayment;
    }

    public int familyCPayUntil9(int[] shiftHours) {
        for (int i = 0; i <= shiftHours.length; i++)
            if (shiftHours.equals(i) == hoursC.equals(i)){
                shiftPayment = FAMILY_C_PAY_BEFORE9 * shiftHours.length;
            }
        return shiftPayment;
    }

    public int familyCPayAfter9(int[] shiftHours) {
        for (int i = 0; i <= shiftHours.length; i++)
            if (shiftHours.equals(i) == hoursC2.equals(i)){
                shiftPayment2 = FAMILY_C_PAY_AFTER9 * shiftHours.length;
            }
        return totalPayC = shiftPayment2 + shiftPayment;
    }

}



