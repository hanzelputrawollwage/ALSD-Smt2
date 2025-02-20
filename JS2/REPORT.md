|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020157|
| Nama |  HANZEL PUTRA WOLLWAGE |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/hanzelputrawollwage/JobSheet1-ALSD |

# JOB SHEET 2 REPORT

## Experiment 1: Declaring Classes, Attributes, and Methods
![Screenshot 2025-02-20 070802](https://github.com/user-attachments/assets/ab52c2c2-85f6-4959-9ef5-b701ffdcb807)

**Brief explanaton:** 
The reason we can't run the code is caused by no main class found, that mean Student15.java is not executable, and the system ask us to run the code in which file for main class replacement


## 2.1.3 Questions and Answers
1. Mention two characteristics of a class or object!

   Answer : 
    - Attributes : it serves like a characteristic for classes, or we say variables that defines in the class. Examples : String studentID; double GPA; String name;
    - Methods : it’s a set of instruction function that can be called for execution and behavior that an object can perform. Example : updateGPA(), update()

2. How many attributes does the Student class have? List them!

   Answer :
   
    There’s 4 attributes inside the Student class which include 
    - String studentID; 
    - String name; 
    - String className; 
    - double gpa;

3.  How many methods does the Student class have? List them!

    Answer :
    
       There’s also 4 methods inside the Student class
        - print()
        - changeClass(String newClass)
        - updateGPA(double newGPA)
        - evaluate()

4.  Modify the updateGPA() method to validate that the input IPK is within the range of 0.0 to 4.0. If it is out of range, display a message: "Invalid IPK. Must be between 0.0 and 4.0."

    Answer :
     
   ![Screenshot 2025-02-20 071234](https://github.com/user-attachments/assets/2a352d57-c963-47c6-b272-194f714dc47b)
   
  We just need an if else statement with condition anything but 0.0-4.0 will print Invalid IPK / GPA

5. Explain how the evaluate() method evaluates student performance. What criteria does it use, and what does it return?

   Answer :
   
     In methods evaluate() we use if else statement that uses criteria if the GPA >= 3.5 it’ll show “Excellent”, GPA >= 3.0 it’ll show “Good”, GPA >= 2.0 it’ll show “Fair”, and for GPA less than 2.0 it’ll show “Poor”. And inside those if else statement we’ll use return statement to get the return back value by printing each academic grade.

## Experiment 2: Object Instantiation and Accessing Attributes and Methods
![Screenshot 2025-02-20 074043](https://github.com/user-attachments/assets/8d29353e-8ef1-4cbc-a8fe-6c32bac0ed75)

2.2.3 Questions 
1. Show the line of code in StudentMain used for instantiation. What is the name of the created object?

    Answer :
   
   The instantiation  used in this line
   ![Screenshot 2025-02-20 074434](https://github.com/user-attachments/assets/641816f6-165d-43fe-a8a4-0a1bc4d1c727)
   
    I use “std1” as an object here. To use an instantiation / create object is by first write the Student15 class and followed by object name (std1) = add new followed by Student15 class with no parameters.

2. How do you access attributes and methods of an object?

   Answer :
   
     ![Screenshot 2025-02-20 075349](https://github.com/user-attachments/assets/c2d2139a-bd86-4c37-b63c-71236315e476)

   To access attributes and methods of an object is by declaring the object (std1) first with dot, and then you can choose which attributes / object you want to use.
   
3. Why does the output of the first and second calls to print() differ?

   Answer :
   
     It because the first print() methods is displaying the initial values of Student1 (std1)
   ![Screenshot 2025-02-20 075010](https://github.com/user-attachments/assets/e433f2ee-9733-4c90-b9fa-379d27d544e2)

   And after that we called changeclass(“TI-2I”) and updateGPA(3.9) so the values are modified, the second print will show the new update / modified attributes.


## Experiment 3: Creating Constructor

![Screenshot 2025-02-20 080321](https://github.com/user-attachments/assets/a651d52d-d35a-47f3-a5c0-f70d453289b2)


## 2.3.3 Questions

1. Show the line of code in Student used to declare the parameterized constructor.
   Answer :

   Parameterized constructor in Student15 
    ![Screenshot 2025-02-20 080714](https://github.com/user-attachments/assets/13ae169f-b2e7-4300-b83c-485fed46eed8)
   
2. In StudentMain, explain what the following line of code does: Student student2 = new Student("244107020040", "Rizky", "TI-1I", 3.5);
   Answer :
  
   Since we already declared the parameterized constructor, and when we create new object we can call / use so called a template for parameterized constructor that contains “id” from studentID, this.name = name, className = cls, this.gpa = gpa for the new object. Example :
   ![Screenshot 2025-02-20 081236](https://github.com/user-attachments/assets/87437988-8084-4361-899f-371b94ad9db3)

3. Remove the default constructor from Student, then compile and run the program. What happens? Explain why.
   Answer :

     When we remove the default constructor it’ll cause an error in the main file (StudentMain15.java) especially in first object which is Student1 (std1) because std1 is using the default parameter. Example of error :
   ![Screenshot 2025-02-20 081425](https://github.com/user-attachments/assets/74997527-6ca0-47a6-8503-02cc35daeee9)

4. After instantiating an object, do methods in Student need to be accessed in order? Explain.
   Answer :
   
     No, since each method performs a specific action independently we don’t need to access the method in order. But, some methods may depend on some previous changes if the places need in order. So, the answer is NO.

5. Create a new object named student<StudentName> using the parameterized constructor from Student class.
   Answer :

     My new object name is “studentHanzel”
![Screenshot 2025-02-20 082424](https://github.com/user-attachments/assets/ced59f9f-edd5-47e4-9f0e-c91af29d71a0)
![Screenshot 2025-02-20 082539](https://github.com/user-attachments/assets/fd955603-7b2a-403c-9578-caa1660ba707)

Results : 

![Screenshot 2025-02-20 082305](https://github.com/user-attachments/assets/e9969e19-bfaf-4a22-b9b2-dccf24914496)

## 2.4 Assignments
## 1. Course15.java & CourseMain15.java Results

  ![image](https://github.com/user-attachments/assets/1c6d3ff1-72d5-4a03-a289-de501415cbf4)

   **Explanation**
   
  First is to create a class with name Couse15, create methods of print, changecredit, addhour, reducehour and add attributes courseID, name, credit, hour. Then we need to add the default constructor allows object created without parameters, and constructor with parameters. Now to the main file. Create a new object by using the class followed by object name, new, and class methods with / without parameters. And if we want to access the object we can type "object" and followed by dot "." to display whole usage from object to accessm.
   

## 2. Lecturer15.java & LecturerMain15.java Results

![image](https://github.com/user-attachments/assets/a7fd705f-0f8a-4f2d-a653-93935861e14e)

   **Explanation**

   Just like the Course15 & CourseMain15, first we declared the class and attributes, second is to create the methods, here we use print(), setStatus(), calculateTenure(), and changeExpertiseField. And don't forget to add the constructor, the default and the parameterized constructor. For remainder if the methods use data types we need to make a return from those values, let's say from the code we use integer for calculateTenure method, so the method need to return the yearNow - startYear to calculate since when the lecturer joined. We use "-" for return type calculation not "-=". Now to the main file. Create new object just same as before, declared the main method first, then use the classname followed by objectname , new, and methods of class <Lecutrer15()> and when we want to access the object use "objectname" + dot to get full access the object function. And then last but not least we call the print() method.😊

   


   

   


