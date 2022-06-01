import java.util.Scanner;

public class QuestionGenerator {
    private Scanner input;
    private static String end;

    public QuestionGenerator() {
        input = new Scanner(System.in);
        end = "";
    }

    public String addNumMillions() {
        int num1 = (int) (Math.random() * 390000000) + 100000000;
        int num2 = (int) (Math.random() * 390000000) + 100000000;
        int sum = num1 + num2;
        System.out.println("  " + num1 + "\n+ " + num2);
        String answer = input.nextLine();
        if (answer.equals("" + sum)) {
            System.out.println("That's correct");
            return answer;
        } else if (!answer.equals("end")) {
            System.out.println("That's incorrect");
            return answer;
        } else{
            end = "end";
            return "end";
        }
    }

    public String multiplyNums() {
        int num1 = (int) (Math.random() * 900) + 100;
        int num2 = (int) (Math.random() * 10);
        String num = "" + (num1 * num2);
        System.out.println("What is " + num1 + " * " + num2 + " ?");
        String answer = input.nextLine();
        if (answer.equals(num)) {
            System.out.println("That's correct");
            return answer;
        } else if (!answer.equals("end")) {
            System.out.println("That's incorrect");
            return answer;
        } else{
            end = "end";
            return "end";
        }

}


    public String  addThousands(){
        int num1 = (int)(Math.random()* 390000) + 1000;
        int num2 = (int)(Math.random()* 390000) + 1000;
        String num = "" +(num1+num2);
        System.out.println("What is " + num1 + " + " + num2 + " ?");
        String answer = input.nextLine();
        if (answer.equals(num)){System.out.println("That's correct");  return answer;}
        else if (!answer.equals("end")){System.out.println("That's incorrect"); return answer;}
        else{
            end = "end";
            return "end";
        }
    }

    public String findTwoNums(){
        int num1 = (int)(Math.random()* 10);
        int num2 = (int)(Math.random()* 10);
        int sum = num1 + num2;
        int difference = Math.abs(num1- num2);
        System.out.println("The sum of two numbers are " + sum + "  and the difference of the same two numbers are " + difference +
                "\nWhat are the two numbers?");
        String answer = input.nextLine();
        if (answer.indexOf(""+num1) > -1 && answer.indexOf(""+num2) > -1)
        { System.out.println("That's correct");
            return answer;}
        else if (!answer.equals("end")){
            System.out.println("That's incorrect, the correct answer is " + num1 + " and " + num2);
            return answer;}
        else{
            end = "end";
            return "end";
        }
    }


    public String doMixedOperations(){
        int num1 = (int)(Math.random()* 10);
        int num2 = (int)(Math.random()* 10);
        String answer = "";
        String oper;
        int operation = (int)(Math.random()* 2) + 1;
        if (operation == 1){
            answer += num1+ num2;
            oper = " + "; }
        else if (operation == 2){
            answer += num1-num2;
            oper = " - ";}
        else {
            answer += num1* num2;
            oper = " * ";}

        System.out.println("What is " + num1 + oper + num2 + " ?");
        return getString(answer);
    }


    public String divideByThree(){
        int num1 = 3 * (int)(Math.random() * 10);
        String answer ="" + (num1/3);
        System.out.println("What is " + num1 + " divided by 3?");
        return getString(answer);

    }

    private String getString(final String answer) {
        String userInput = input.nextLine();
        if (answer.equals(userInput)){System.out.println("That's correct"); return answer;}
       // else if (!answer.equals("end")) {System.out.println("That's incorrect");  return answer;}
        else{
            end = "end";
            return "end";
        }
    }

    public String subtractByMultiplesOfTen(){
        int num1 = 10 * ((int)(Math.random()*50) + 20);
        int num2 = 10 * ((int)(Math.random()*20) + 1);
        String answer = "" + (num1 - num2);
        System.out.println("What is " + num1 + " - " + num2 + " ?");
        return getString(answer);
    }


    public String addThreeNums(){
        int num1 = (int)(Math.random()*399) + 100;
        int num2 = (int)(Math.random()*400) + 100;
        String answer = "" + (num1 + num2);
        System.out.println("What is " + num1 + " +\n " + num2 + " ?");
        return getString(answer);
    }


    public String subtractByOne() {
        int num1 = (int) (Math.random() * 10) + 1;
        String answer = "" + (num1 - 1);
        System.out.println("What is " + num1 + " minus 1?");
        return getString(answer);
    }


    public String addByFour() {
        int num1 = (int) (Math.random() * 10);
        String answer = "" + (num1 + 4);
        System.out.println("What is " + num1 + " + 4?");
        return getString(answer);
    }
        public static String getValueOfAnswer(){
            return end;
        }

    }

