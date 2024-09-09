public class Multiples {
    public static void main(String[] args) {
        int maxNum = 1000;
        int multiplesOfThree = maxNum / 3;
        int multiplesOfFive = maxNum / 5;
        int multiplesOfFifteen = maxNum / 15;
        int multiplesOfThreeOrFive = multiplesOfFive + multiplesOfThree - multiplesOfFifteen;
        System.out.print("There are ");
        System.out.print(multiplesOfThreeOrFive);
        System.out.println(" multiples of three or five.");
    }
}
