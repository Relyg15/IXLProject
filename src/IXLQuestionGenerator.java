import java.util.*;

public class IXLQuestionGenerator {
    private int gradeLevel;
    private int topic;
    private int score;
    private Scanner input;

    public IXLQuestionGenerator(){
        input = new Scanner(System.in);
    }
    public IXLQuestionGenerator(int gradeLvl, int tp) {
        gradeLevel = gradeLvl;
        topic = tp;
        score = 0;
       // generateQuestions();
        input = new Scanner(System.in);
    }
    public void generateQuestions(){
        if (gradeLevel == 1)
        {
            if (topic == 1){ subtractByOne();}

            else  addByFour();
        }
        else if (gradeLevel == 2){

            if (topic == 1){ subtractByMultiplesOfTen();}

            else addThreeNums();
        }
        else if (gradeLevel == 3){
            if (topic == 1) { mixedOperations();}

            else divideByThree();
        }
        else if (gradeLevel == 4){
            if (topic == 1){ addThousands();}

            else findTwoNums();
        }

        else if (gradeLevel == 5){
            if (topic == 1){ addNumMillions();}

            else multiplyNums();
        }
    }

    public void generateQuestions(int grade, int tp){
        if (grade == 1)
        {
            if (tp == 1){ subtractByOne();}

            else  addByFour();
        }
        else if (grade == 2){

            if (tp == 1){ subtractByMultiplesOfTen();}

            else addThreeNums();
        }
        else if (grade == 3){
            if (tp == 1) { mixedOperations();}

            else divideByThree();
        }
        else if (grade == 4){
            if (tp == 1){ addThousands();}

            else findTwoNums();
        }

        else if (grade == 5){
            if (tp == 1){ addNumMillions();}

            else multiplyNums();
        }
    }

    public void addNumMillions(){
        int num1 = (int)(Math.random()*390000000) + 100000000;
        int num2 = (int)(Math.random()*390000000) + 100000000;
        int sum = num1 + num2;
        System.out.println("  " + num1 +"\n+ " + num2 );
        String answer = input.nextLine();
        if (answer.equals(""+sum)){ System.out.println("That's correct");}
        else {System.out.println("That's incorrect");}
    }


    public void multiplyNums(){
        int num1 = (int)(Math.random()* 900) + 100;
        int num2 = (int)(Math.random()* 10);
        String num = "" +(num1*num2);
        System.out.println("What is " + num1 + " * " + num2 + " ?" );
        String answer = input.nextLine();
        if (answer.equals(num)){System.out.println("That's correct");}
        else {System.out.println("That's incorrect");}

    }


    public void addThousands(){
        int num1 = (int)(Math.random()* 390000) + 1000;
        int num2 = (int)(Math.random()* 390000) + 1000;
        String num = "" +(num1+num2);
        System.out.println("What is " + num1 + " + " + num2 + " ?");
        String answer = input.nextLine();
        if (answer.equals(num)){System.out.println("That's correct");}
        else {System.out.println("That's incorrect");}
    }

    public void findTwoNums(){
        int num1 = (int)(Math.random()* 10);
        int num2 = (int)(Math.random()* 10);
        int sum = num1 + num2;
        int difference = Math.abs(num1- num2);
        System.out.println("The sum of two numbers are " + sum + "  and the difference of the same two numbers are " + difference +
                "\nWhat are the two numbers? \n*Please Note that you MUST put the smaller first and then the larger number after." +
                " If the numbers are equal the order shouldn't matter*");
        String userInput = input.nextLine();
        String answer = "" + num1 + " " + num2;
        if (answer.equals(userInput)){ System.out.println("That's correct");}
        else {System.out.println("That's incorrect");}
    }


    public void mixedOperations(){
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
    String userInput = input.nextLine();

        if (answer.equals(userInput)){ System.out.println("That's correct");}
        else {System.out.println("That's correct");}
    }


    public void divideByThree(){
        int num1 = 3 * (int)(Math.random() * 10);
        String answer ="" + (num1/3);
        System.out.println("What is " + num1 + " divided by 3?");
        String userInput = input.nextLine();
        if (answer.equals(userInput)){System.out.println("That's correct");}
        else {System.out.println("That's incorrect");}
    }


    public void subtractByMultiplesOfTen(){
        int num1 = 10 * ((int)(Math.random()*50) + 20);
        int num2 = 10 * ((int)(Math.random()*20) + 1);
        String answer = "" + (num1 - num2);
        System.out.println("What is " + num1 + " - " + num2 + " ?");
        String userInput = input.nextLine();
        if (answer.equals(userInput)){ System.out.println("That's correct");}
        else {System.out.println("That's incorrect");}
    }


    public void addThreeNums(){
        int num1 = (int)(Math.random()*399) + 100;
        int num2 = (int)(Math.random()*400) + 100;
        String answer = "" + (num1 + num2);
        System.out.println("What is " + num1 + " +\n " + num2 + " ?");
        String userInput = input.nextLine();
        if (answer.equals(userInput)){System.out.println("That's correct");}
        else {System.out.println("That's incorrect");}
    }


    public void subtractByOne(){
        int num1 = (int)(Math.random() * 10) + 1;
        String answer = ""  + (num1 -1);
        System.out.println("What is " + num1 + " minus 1?");
        String userInput = input.nextLine();
        if (answer.equals(userInput)){System.out.println("That's correct");}
        else {System.out.println("That's incorrect");}
    }


    public void addByFour(){
        int num1 =  (int)(Math.random()*10);
        String answer = ""  + (num1 + 4);
        System.out.println("What is " + num1 + " + 4?");
        String userInput = input.nextLine();
        if (answer.equals(userInput)){System.out.println("That's correct");}
        else {System.out.println("That's incorrect");}
    }


}
