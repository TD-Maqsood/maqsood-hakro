import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
import java.net.ServerSocket;
import java.net.Socket;


class Test1 extends AbstractClass{
    @Override
    public void test(int a, int b) {
        System.out.println(a+b);
    }
}

public class JavaPractice {
    public static void main(String args[]) throws IOException {

        Test1 test1 = new Test1();
        test1.test(4,4);


    }
}
//        Scanner keyboard = new Scanner(System.in);
//
//        //Creating students objects
//        ArrayList<Student> studentList = new ArrayList<Student>();
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter Information for Student:" + i);
//            System.out.print("Please enter your id, age and score:");
//            int id = keyboard.nextInt();
//            int age = keyboard.nextInt();
//            int score = keyboard.nextInt();
//
//            studentList.add(new Student(id, age, score));
//            System.out.println();
//        }
//
//
////        Sorting
//
//        for (int k = 0; k < studentList.size() - 1; k++) {
//            for (int i = 0; i < studentList.size() - 1; i++) {
//                //System.out.println("Student"+(i)+": "+"id:"+studentList.get(i).id + " age:"+ studentList.get(i).age + " score:"+ studentList.get(i).score);
//                //System.out.println(studentList.get(i).score);
//
//                int first = studentList.get(i).score;
//                int second = studentList.get(i + 1).score;
//
//                Object firstObject = studentList.get(i);
//                Object secondObject = studentList.get(i + 1);
//
//                if (first > second) {
//                    studentList.set(i, (Student) secondObject);
//                    studentList.set(i + 1, (Student) firstObject);
//                }
//            }
//
//        }
//
//        //Displaying Students
//        for (int i = 0; i < studentList.size(); i++) {
//            System.out.println("Student" + (i) + ": " + "id:" + studentList.get(i).id + " age:" + studentList.get(i).age + " score:" + studentList.get(i).score);
//        }
//
//
//    }
//}

//Sorting


//        int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
//
//        Scanner keyboard = new Scanner(System.in);
//
//
//        System.out.println("Guessing number is : " + randomNum);
//        int counter = 0;
//        while (true) {
//            counter++;
//            System.out.print("enter an integer:");
//            String inputNumber = keyboard.nextLine();
//
//
//            if (inputNumber.equals("exist")) {
//                break;
//            } else if (inputNumber.equals("help")) {
//                System.out.println("Instructions about guessing number game...");
//            } else {
//                int i = Integer.parseInt(inputNumber);
//                if (i == randomNum) {
//                    System.out.println("Congratulations!!! You won the match in " + counter + " moves");
//                    break;
//                } else if (i > randomNum) {
//                    System.out.println("you are exceeding!!!");
//                } else {
//                    System.out.println("you are not exceeding!!");
//                }
//            }
//        }

//    }
//}
