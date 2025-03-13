package first.example;
import java.util.Stack;

import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Calculator extends Application {

    public  void start(Stage primaryStage){

        GridPane pane = new GridPane();
        pane.setHgap(10);
        pane.setVgap(15);
        GridPane numPad = new GridPane();
        numPad.setHgap(10);
        numPad.setVgap(15);
        //pane.add(numPad, 1, 1);
        //  numPad.setAlignment(Pos.BOTTOM_CENTER);
        numPad.setPadding(new Insets(30) );
        GridPane operations = new GridPane();
        operations.setHgap(10);
        operations.setVgap(15);
        operations.setAlignment(Pos.TOP_LEFT);
        pane.add(operations, 8, 6);
        Button one = new Button();
        Button two = new Button();
        Button three = new Button();
        Button four = new Button();
        Button five = new Button();
        Button six = new Button();
        Button seven = new Button();
        Button eight = new Button();
        Button nine = new Button();
        Button zero = new Button();

        Button addition = new Button();
        Button subtraction = new Button();
        Button multiplication = new Button();
        Button division = new Button();
        Button sqrt = new Button();
        Button power = new Button();

        Button equal = new Button();

        Button dot = new Button();
        Button clear = new Button();
        Button openedP = new Button();
        Button closedP = new Button();

        Button c = new Button();
        c.setPrefSize(50, 50);

        TextField result = new TextField();
        Font font1 = new Font(20);
        result.setFont(font1);
        result.setEditable(false);
        result.setPrefSize(300, 60);
        result.setAlignment(Pos.CENTER);

        pane.add(result, 3, 0);



        numPad.add(one, 0, 1);
        numPad.add(two, 1, 1);
        numPad.add(three, 2, 1);
        numPad.add(four, 0, 2);
        numPad.add(five, 1, 2);
        numPad.add(six, 2, 2);
        numPad.add(seven, 0, 3);
        numPad.add(eight, 1, 3);
        numPad.add(nine, 2, 3);
        numPad.add(zero, 1, 4);

        numPad.add(addition, 3, 1);
        numPad.add(subtraction, 4, 1);
        numPad.add(multiplication,3,2);
        numPad.add(division, 4, 2);
        numPad.add(sqrt, 3, 3);
        numPad.add(power, 4, 3);

        numPad.add(result, 0, 0,5,1);
        numPad.add(dot, 2, 4);
        numPad.add(openedP, 0, 5);
        numPad.add(closedP, 1, 5);
        numPad.add(c, 2, 5);
/////////////////////////////////////////////// Text Block

        one.setText("1");

        two.setText("2");
        three.setText("3");
        four.setText("4");
        five.setText("5");
        six.setText("6");
        seven.setText("7");
        eight.setText("8");
        nine.setText("9");
        zero.setText("0");

        addition.setText("+");
        subtraction.setText("-");
        multiplication.setText("*");
        division.setText("/");
        sqrt.setText("√");
        power.setText("^");

        equal.setText("=");

        dot.setText(".");
        openedP.setText("(");
        closedP.setText(")");
        clear.setText("Clear");
        c.setText("CE");



///////////////////////////////////////////////////////////////
//////////////////////////////////////////////// Size Block
        one.setPrefWidth(50);
        one.setPrefHeight(50);
        two.setPrefHeight(50);
        two.setPrefWidth(50);
        three.setPrefSize(50, 50);
        four.setPrefSize(50, 50);
        five.setPrefSize(50, 50);
        six.setPrefSize(50, 50);
        seven.setPrefSize(50, 50);
        eight.setPrefSize(50, 50);
        nine.setPrefSize(50, 50);
        zero.setPrefSize(170, 50);

        addition.setPrefSize(50, 50);
        subtraction.setPrefSize(50, 50);
        multiplication.setPrefSize(50, 50);
        division.setPrefSize(50, 50);
        sqrt.setPrefSize(50, 50);
        power.setPrefSize(50, 50);
        equal.setPrefSize(110, 50);

        dot.setPrefSize(50, 50);
        openedP.setPrefSize(50, 50);
        closedP.setPrefSize(50, 50);
        clear.setPrefSize(110, 50);

////////////////////////////////////////////////////
        HBox hb = new HBox();
        hb.getChildren().add(zero);
        HBox hb2 = new HBox();
        hb2.getChildren().add(equal);
        numPad.add(hb, 0, 4, 2, 1);
        numPad.add(hb2, 3, 4, 2, 1);
        HBox hb3 = new HBox();
        hb3.getChildren().add(clear);
        numPad.add(hb3, 3, 5, 2, 1);





        one.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        two.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        three.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        four.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        six.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        seven.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        eight.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        nine.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        zero.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        addition.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        subtraction.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        multiplication.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        division.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        sqrt.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        power.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        five.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        equal.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        dot.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        openedP.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        closedP.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");
        clear.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: Red;-fx-font-size: 1.5em;");
        c.setStyle("-fx-border-color: Black; -fx-border-width: 2px;-fx-text-fill: #0000ff;-fx-font-size: 1.5em;");










        StringBuilder equation = new StringBuilder();



        c.setOnAction((ActionEvent e)->{

            result.setText("");
            equation.deleteCharAt(equation.length()-1);
            String str0=  equation.toString();
            result.setText(str0);



        });




        one.setOnAction((ActionEvent e)->{

            equation.append("1");
            result.setText("");
            String str1=  equation.toString();
            result.setText(str1);



        });


        two.setOnAction((ActionEvent e)->{
            equation.append("2");

            result.setText("");
            String str2=  equation.toString();
            result.setText(str2);


        });


        three.setOnAction((ActionEvent e)->{
            equation.append("3");

            result.setText("");
            String str3=  equation.toString();
            result.setText(str3);


        });


        four.setOnAction((ActionEvent e)->{
            equation.append("4");


            result.setText("");
            String str4=  equation.toString();
            result.setText(str4);

        });


        five.setOnAction((ActionEvent e)->{
            equation.append("5");


            result.setText("");
            String str5=  equation.toString();
            result.setText(str5);

        });


        six.setOnAction((ActionEvent e)->{
            equation.append("6");

            result.setText("");
            String str6=  equation.toString();
            result.setText(str6);


        });


        seven.setOnAction((ActionEvent e)->{
            equation.append("7");

            result.setText("");
            String str7=  equation.toString();
            result.setText(str7);


        });


        eight.setOnAction((ActionEvent e)->{
            equation.append("8");

            result.setText("");
            String str8=  equation.toString();
            result.setText(str8);


        });


        nine.setOnAction((ActionEvent e)->{
            equation.append("9");

            result.setText("");
            String str9=  equation.toString();
            result.setText(str9);


        });


        zero.setOnAction((ActionEvent e)->{
            equation.append("0");

            result.setText("");
            String str0=  equation.toString();
            result.setText(str0);


        });


        addition.setOnAction((ActionEvent e)->{
            equation.append("+");

            result.setText("");
            String str10=  equation.toString();
            result.setText(str10);


        });


        subtraction.setOnAction((ActionEvent e)->{
            equation.append("-");

            result.setText("");
            String str11=  equation.toString();
            result.setText(str11);


        });


        multiplication.setOnAction((ActionEvent e)->{
            equation.append("*");

            result.setText("");
            String str12=  equation.toString();
            result.setText(str12);


        });



        division.setOnAction((ActionEvent e)->{
            equation.append("/");

            result.setText("");
            String str13=  equation.toString();
            result.setText(str13);


        });


        sqrt.setOnAction((ActionEvent e)->{
            equation.append("√");

            result.setText("");
            String str14=  equation.toString();
            // equation.delete(0, str14.length());
            result.setText(str14);
           /*double square = Double.parseDouble(str14);
           square = Math.sqrt(square);
           String squareRoot = Double.toString(square);
           result.setText(squareRoot);
           equation.append(squareRoot);*/




        });


        power.setOnAction((ActionEvent e)->{
            equation.append("^");


            result.setText("");
            String str15=  equation.toString();
            result.setText(str15);

        });


        equal.setOnAction((ActionEvent e)->{
            equation.append("@");
            //System.out.println("equation =" + equation);
            String res = equation.toString();

            double finalRes = run(res);
            if(finalRes ==-1)
                result.setText("INVALID EQUATION");
            else{
                String finalres = Double.toString(finalRes);

                result.setText(finalres);

            }
           /*  System.out.println("equation =" + equation);

           // equation.delete(0,  equation.length()-1);
            res= spliString(res);
            res=inToPost(res);
            double finalRes = Evaluate(res);

              String finalres = Double.toString(finalRes);

            result.setText(finalres);*/
            equation.delete(0,  equation.length());
            equation.append(finalRes);


        });


        dot.setOnAction((ActionEvent e)->{
            equation.append(".");


            result.setText("");
            String str16=  equation.toString();
            result.setText(str16);

        });

        openedP.setOnAction((ActionEvent e)->{
            equation.append("(");


            result.setText("");
            String str17=  equation.toString();
            result.setText(str17);

        });


        closedP.setOnAction((ActionEvent e)->{
            equation.append(")");


            result.setText("");
            String str18=  equation.toString();
            result.setText(str18);

        });



        clear.setOnAction((ActionEvent e)->{

            result.setText("");
            equation.delete(0, equation.length());


        });



        Scene scene1 = new Scene(numPad,350,390);
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("calc2.png"));


        primaryStage.show();


    }

    public static double run(String st){
        Stack<Character> valid = new Stack<>();
        valid = fillStack(st);
        boolean x = isvalid(valid);
        if(x){
            st=spliString(st);
            st=inToPost(st);

            double res = Evaluate(st);

            return res;
        }
        else return -1;
    }




    public static Double evaluate(String Eq ){

        int op1= Eq.indexOf('+');
        int op2 = Eq.indexOf('-');
        int op3 = Eq.indexOf('*');
        int op4 = Eq.indexOf('/');
        int op5 = Eq.indexOf('^');

        int op = op1+op2+op3+op4+op5 +4;
        double result=0;

        if(op>0){
            String num1=  Eq.substring(0, op);
            String num2 = Eq.substring(op+1);

            double number1 = Double.parseDouble(num1);
            //double number2 = Double.parseDouble(num2);
            double number2 = Double.parseDouble(num2);

            if(op1 !=-1)
                result = number1 + number2;
            else if(op2 !=-1)
                result = number1 - number2;
            else if (op3 != -1) {
                result = number1 * number2;

            }
            else if (op4 != -1) {
                result = number1/number2;
            }
            else if (op5 != -1) {
                result = Math.pow(number1, number2);
            }






        }

        return result;


    }





    public static void main(String[] args) {
        launch(args);

/* String st =  args[0];
System.out.println(st);
st=spliString(st);
System.out.println(st);

st=inToPost(st);
System.out.println(st);
double res = Evaluate(st);
System.out.println("result=" + res);  */



    }



    public static boolean isDigit (char digit){

        int x = digit-48;

        if (x<=9 && x>=0) {
            return true;
        }
        else if (digit =='.')
            return true;
        else return false;


    }

    public static boolean isOperation(String operation){

        if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/") || operation.equals("^") || operation.equals("√")) {
            return true;
        }
        else return false;


    }


    public static int getPrecedence(char operation){
        int degree=0;
        if (operation== '+') {
            degree =1;
        }
        else if ( operation=='-') {
            degree=2;
        }
        else if(operation=='*' || operation=='/'){
            degree = 3;
        }
        else if (operation=='^') {
            degree =4;
        }
        else if (operation=='√') {
            degree =5;
        }
        else degree =-1;

        return degree;

    }


    public static Stack<Character> fillStack(String equation){

        Stack<Character> test = new Stack<>();
        int i =0;
        char bit =equation.charAt(i);
        String str;
        while (bit !='@') {
            //str= Character.toString(bit);
            //test.push(" ");
            test.push(bit);
            i++;
            bit =equation.charAt(i);

        }

        return test;

    }


    public static boolean isvalid(Stack<Character> test){
        int step1=1,step2=1,step3=1,step4=1,step5=1,step6=-1;
        char  top='\0';
        char low='\0';
        int openB=0 ,closedB=0;
        top = test.pop();

        while(!(test.isEmpty())){

            low = test.pop();

            if(low=='(')
                openB++;
            if(top==')')
                closedB++;

            if ((low=='(' )&& (top=='+' || top=='-' || top=='*' || top=='/' || top=='√'|| top=='^') ) {
                step1=-1;

            }
            if (isDigit(top) && low==')') {
                step2 =-1;
            }
            if (isDigit(low) && top=='(') {
                step3 =-1;
            }
            if ((top==')' )&& (low=='+' || low=='-' || low=='*' || low=='/' || low=='√'|| low=='^') ){
                step4 =-1;
            }

            if ((low=='*' || low=='/' || low=='+'|| low=='-') && (top=='*' ||  top=='/'  ||  top=='+' ))  {

                step5=-1;

            }

            top =low;
        }
        if (closedB==openB) {
            step6=1;
        }

        if(step1==1 && step2==1 && step3==1&&step4==1&&step5==1&&step6==1)
            return true;


        return false;



    }


//public static double Evaluate(String equation){







//}



/* public static String inToPost(String equation){
Stack<String> container = new Stack<String>();
StringBuilder storage =new StringBuilder();

char bit;
int i=0;
String str="",bit2,bit3;
bit = equation.charAt(i);

while(bit!='@'){



str = String.valueOf(bit);

System.out.println(str);


  if (isDigit(str)|| str.equals(".")|| str.equals(" "))  {
    System.out.println("digit");
    storage.append(str);
  }
  else if(str.equals("(")){
  container.push(str);
  }
  else if (str.equals(")")) {
    bit2 = container.pop();

    while(!bit2.equals("(")){

      storage.append(bit2);

      bit2=container.pop();
    }

    if (bit2.equals("(")) {
      container.pop();
    }


  }
 //else if((str.equals("*")) || (str.equals("/")) || (str.compareTo("+")==0) || (str.equals("-")) || (str.equals("^")) || (str.equals("√"))){
  else if (isOperation(str)) {
   // else{

          System.out.println("operation");

    if(!(container.isEmpty())){
    bit3= container.pop();

    if(getPrecedence(bit3)<=getPrecedence(str)){
    container.push(str);
    }
    else if (getPrecedence(bit3)>getPrecedence(str)) {

      storage.append(bit3);
      bit3=container.pop();
      while(getPrecedence(bit3)>getPrecedence(str)){

        storage.append(bit3);
      bit3=container.pop();

      }

      if(getPrecedence(bit3)<=getPrecedence(str))
    container.push(str);
    }
  }
  else container.push(str);

  }
 /*  else if (str==" ") {
    container.push(str);
   }









i++;

bit = equation.charAt(i);




}
while(!(container.isEmpty())){

str=container.pop();
storage.append(str);


   }


String postFix =storage.toString();

return postFix;


}

 */


    public static String inToPost(String equation){

        Stack<Character> container = new Stack<>();
        container.push('\0');
        StringBuilder storage = new StringBuilder(100);
        int i=0;
        char bit = equation.charAt(i);
        String str="";
        char top='\0',out='\0',bit2='\0';


        //while((i<equation.length()-1)){
        while(bit!='@'){
//System.out.println(bit);
//str= String.valueOf(bit);
            if ((bit>=48 && bit<=57) || bit=='.'|| bit=='#') {
                // System.out.println("number = "+ bit);
                storage.append(bit);
                // System.out.println("storage ="+storage);

            }
            else if ( (bit=='*') || (bit == '+')  || (bit == '/') || (bit=='-') || (bit == '^') ||  (bit=='√')    ) {
                //System.out.println("bye "+bit);

                // str = String.valueOf(bit);

                if(!(container.isEmpty())){
                    top= container.peek();
                    // System.out.println(top);

                    if(getPrecedence(top)<=getPrecedence(bit)){
                        // System.out.println("1- "+container);

                        //  System.out.println("hi "+bit);
                        container.push(bit);
                        // System.out.println("1 "+container);
                        //  System.out.println("storage ="+storage);

                    }
                    else if (getPrecedence(top)>getPrecedence(bit)) {
                        // System.out.println("2- "+container);

                        //System.out.println("2 "+container);
                        out=container.pop();
                        // storage.append(' ');
                        storage.append(out);
                        //  System.out.println("storage ="+storage);
                        //  System.out.println("2 "+container);

                        if(!(container.isEmpty()))

                            top=container.peek();
                        while(getPrecedence(top)>getPrecedence(bit)){
                            //  System.out.println("3- "+container);

                            out=container.pop();
                            //storage.append(' ');

                            storage.append(out);
                            if(!(container.isEmpty()))
                                out=container.pop();
                            else break;

                        }

                        if(getPrecedence(top)<=getPrecedence(bit))

                            container.push(bit);
                    }
                }
            }

            else if(bit=='('){
                // System.out.println("one");
                container.push(bit);
            }
            else if (bit==')') {
                // System.out.println("three");
                bit2 = container.pop();
                //System.out.println("b="+ bit2);
                while(!(bit2=='(')){
                    //     System.out.println("storage1 ="+storage);

                    storage.append(bit2);
                    //    System.out.println("storage2 ="+storage);

                    bit2=container.pop();
                    // System.out.println(container);

                }

    /*if (bit2=='(') {
      container.pop();
      System.out.println(container);
    }*/


            }


            i++;

            bit = equation.charAt(i);
            //System.out.println(bit);

        }

//System.out.println(container);
//System.out.println(storage);


        while(!(container.isEmpty())){

            bit=container.pop();
//System.out.println("left"+bit);
            storage.append(bit);
        }



        storage.append('@');
        String postFix =storage.toString();

        return postFix;


    }



    public static String spliString (String equation){

        StringBuilder storage = new StringBuilder(100);
        int i=0;
        char bit = equation.charAt(i);

        while (bit!='@'){
            if ((bit>=48 && bit<=57) || bit=='.'||bit=='(') {
                storage.append(bit);

            }
            else if ((bit=='*') || (bit == '+')  || (bit == '/') || (bit=='-') || (bit == '^') ||  (bit=='√')  || bit == ')') {
                storage.append('#');
                storage.append(bit);

            }
            i++;
            bit = equation.charAt(i);

        }

        storage.append('@');
        String finalRes = storage.toString();

        return finalRes;


    }








    public static double Evaluate(String equation){

        Stack<String> numbers = new Stack<>();
        int i=0;
        char bit = equation.charAt(i);
        StringBuilder number = new StringBuilder(100);
        String storage="";

        String number1="";
        String number2="";
        String res="";
        double num1,num2,result=0;

        while((bit!='@')){
 /*  if (i!=0) {
   // System.out.println(i);

  } */
            //System.out.println("bit= "+bit);
            if ((bit>=48 && bit<=57) || bit=='.') {
                while (bit!='#' /*|| (bit!='*') || (bit != '+')  || (bit != '/') || (bit!='-') || (bit != '^') ||  (bit!='√')*/) {


                    number.append(bit);
                    i++;
                    bit = equation.charAt(i);
                    if ((bit=='*') || (bit == '+')  || (bit == '/') || (bit=='-') || (bit == '^') ||  (bit=='√') ) {
                        break;
                    }
                    // System.out.println("digit");
                }
                storage = number.toString();
                numbers.push(storage);
                number.delete(0, storage.length());

            }


            if((bit=='*') || (bit == '+')  || (bit == '/') || (bit=='-') || (bit == '^')  ){
                number1=numbers.pop();
                number2=numbers.pop();

                num1=Double.parseDouble(number1);
                num2 = Double.parseDouble(number2);

                switch (bit) {
                    case '+':
                        result = num1+num2;
                        break;
                    case '*':
                        result = num1*num2;
                        break;
                    case '/':
                        result = num2/num1;
                        break;
                    case '-':
                        result = num2-num1;
                        break;
                    case '^':
                        result = Math.pow(num2, num1);
                        break;

                }

                res=String.valueOf(result);
                numbers.push(res);
            }
            if ((bit=='√')) {
                number1=numbers.pop();
                num1=Double.parseDouble(number1);
                result=Math.sqrt(num1);
                res=String.valueOf(result);
                numbers.push(res);

            }

            i++;
            bit = equation.charAt(i);

        }



        res=numbers.pop();
        result=Double.parseDouble(res);


        return result;

    }














}