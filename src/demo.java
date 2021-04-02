import java.sql.SQLOutput;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("Mời nhập số:");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if(0 <= number&&number < 1000){
            if(number < 10){
                String unitRow="";
                switch (number){
                    case 0:
                        unitRow = " zero";
                    case 1:
                        unitRow = " one";
                        break;
                    case 2:
                        unitRow = " two";
                        break;
                    case 3:
                        unitRow = " three";
                        break;
                    case 4:
                        unitRow = " four";
                        break;
                    case 5:
                        unitRow = " five";
                        break;
                    case 6:
                        unitRow = " six";
                        break;
                    case 7:
                        unitRow = " seven";
                        break;
                    case 8:
                        unitRow = " eight";
                        break;
                    case 9:
                        unitRow = " night";
                        break;
                }
            }
            else if(number < 20){
                String read;
                switch (number%10){
                    case 0:
                        read = "teen";
                        break;
                    case 1:
                        read = "eleven";
                        break;
                    case 2:
                        read = "twelve";
                        break;
                    case 3:
                        read = "thirteen";
                        break;
                    case 4:
                        read = "fourteen";
                        break;
                    case 5:
                        read = "fifteen";
                        break;
                    case 6:
                        read = "sixteen";
                        break;
                    case 7:
                        read = "seventeen";
                        break;
                    case 8:
                        read = "eighteen";
                        break;
                    case 9:
                        read = "nineteen";
                        break;
                }
            }
            else if(20 <= number && number < 100){
                String unitRow="";
                String dozens="";
                switch (number % 10){
                    case 0:
                        unitRow = "";
                        break;
                    case 1:
                        unitRow = " one";
                        break;
                    case 2:
                        unitRow = " two";
                        break;
                    case 3:
                        unitRow = " three";
                        break;
                    case 4:
                        unitRow = " four";
                        break;
                    case 5:
                        unitRow = " five";
                        break;
                    case 6:
                        unitRow = " six";
                        break;
                    case 7:
                        unitRow = " seven";
                        break;
                    case 8:
                        unitRow = " eight";
                        break;
                    case 9:
                        unitRow = " nine";
                        break;

                }
                switch (number / 10){
                    case 2:
                        dozens = "twenty";
                        break;
                    case 3:
                        dozens = "thirty";
                        break;
                    case 4:
                        dozens = "forty";
                        break;
                    case 5:
                        dozens = "fifty";
                        break;
                    case 6:
                        dozens = "sixty";
                        break;
                    case 7:
                        dozens = "seventy";
                        break;
                    case 8:
                        dozens = "eighty";
                        break;
                    case 9:
                        dozens = "ninety";
                        break;

                }
                System.out.println(dozens+unitRow);
            }
            else if(number>=100){
                String hundreds = "";
                String unitRow="";
                String dozens="";
                switch (number / 100){
                    case 1:
                        hundreds = "one hundred";
                        break;
                    case 2:
                        hundreds = "two hundred";
                        break;
                    case 3:
                        hundreds = "three hundred";
                        break;
                    case 4:
                        hundreds = "four hundred";
                        break;
                    case 5:
                        hundreds = "five hundred";
                        break;
                    case 6:
                        hundreds = "six hundred";
                        break;
                    case 7:
                        hundreds = "seven hundred";
                        break;
                    case 8:
                        hundreds = "eight hundred";
                        break;
                    case 9:
                        hundreds = "nine hundred";
                        break;

                }
                switch ((number % 100) % 10){
                    case 0:
                        unitRow = "";
                        break;
                    case 1:
                        unitRow = " one";
                        break;
                    case 2:
                        unitRow = " two";
                        break;
                    case 3:
                        unitRow = " three";
                        break;
                    case 4:
                        unitRow = " four";
                        break;
                    case 5:
                        unitRow = " five";
                        break;
                    case 6:
                        unitRow = " six";
                        break;
                    case 7:
                        unitRow = " seven";
                        break;
                    case 8:
                        unitRow = " eight";
                        break;
                    case 9:
                        unitRow = " nine";
                        break;

                }
                switch ((number % 100) / 10){
                    case 0:
                        dozens = "";
                        break;
                    case 1:
                        dozens = "";
                        switch ((number % 100) % 10){
                            case 0:
                                unitRow = " teen";
                                break;
                            case 1:
                                unitRow = " eleven";
                                break;
                            case 2:
                                unitRow = " twelve";
                                break;
                            case 3:
                                unitRow = " thirteen";
                                break;
                            case 4:
                                unitRow = " fourteen";
                                break;
                            case 5:
                                unitRow = " fifteen";
                                break;
                            case 6:
                                unitRow = " sixteen";
                                break;
                            case 7:
                                unitRow = " seventeen";
                                break;
                            case 8:
                                unitRow = " eighteen";
                                break;
                            case 9:
                                unitRow = " nineteen";
                                break;
                        }
                        break;
                    case 2:
                        dozens = " twenty";
                        break;
                    case 3:
                        dozens = " thirty";
                        break;
                    case 4:
                        dozens = " forty";
                        break;
                    case 5:
                        dozens = " fifty";
                        break;
                    case 6:
                        dozens = " sixty";
                        break;
                    case 7:
                        dozens = " seventy";
                        break;
                    case 8:
                        dozens = " eighty";
                        break;
                    case 9:
                        dozens = " ninety";
                        break;

                }
                System.out.println(hundreds+" and "+dozens+unitRow);
            }

        }
    }
}
