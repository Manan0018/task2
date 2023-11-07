import java.util.Scanner;

public class average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Taking input of how many subjects are there
        System.out.println("Enter the total no. of subjects");
        int tsub = sc.nextInt();
        int tmarks = 0;

        //Taking and adding all the marks
        for (int i = 1; i <=tsub; i++) {
            System.out.println("Enter the marks obtained in subject " + i);
            int marks = sc.nextInt();
            if(marks>=0 && marks<=100)
               tmarks += marks;
            else 
              System.out.println("out of 100");   
        }

        //Calculating Percentage
        int avgp = tmarks / tsub;

        //Calculating Grades
        char Grade;
        if(avgp>=90)
           Grade='A';
         else if(avgp>=80)
           Grade='B';
         else if(avgp>=70)
           Grade='C';    
          else if(avgp>=60)
           Grade='D'; 
           else 
           Grade='F'; 

        //Displaying all the Data
        System.out.println("Total marks obtained :- " + tmarks);
        System.out.println("Percentage obtained :- " + avgp+"%");
        System.out.println("Grade obtained :- " + Grade);
        sc.close();
    }
}