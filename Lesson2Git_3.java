public class Lesson2Git_3 {
    public static void main(String[] rags) {
        int depositAmount = 1500;
        int depositYears = 5;
        int depositAnnualPercentage = 3;
        float totalDepositAmount = (depositAmount + (depositAmount * depositYears * depositAnnualPercentage / 100));
        System.out.println(totalDepositAmount);
    }
}
