|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020157|
| Nama |  HANZEL PUTRA WOLLWAGE |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/hanzelputrawollwage/ALSD-Smt2)|

# JOB SHEET 3 REPORT

## 1.2 Create, insert, and display Array of Object
![image](https://github.com/user-attachments/assets/32bf6e37-4971-4c30-80a2-0d2baa7d0c84)

![image](https://github.com/user-attachments/assets/d366d53b-13e0-4c33-8607-0fa2c1efc6df)

## Result : 
![image](https://github.com/user-attachments/assets/9778dacd-d197-4647-b206-185ea99562bb)

## 1.2.3 Questions
1. Based on part 1.2, does the class that are going to be used as an array of object must have
attributes and methods? Please explain!

Answer : 

**No,  a class that are going to be used as an array of object must not have an attributes and methods. Because a attributes and methods in class are not necessarily a mandatory things to perform the class. Meanwhile, methods used if the class want to perform something with function, like constructor**

2. Does class Rectangle have constructor? If not, why we instantiate the object as follows?
rectangleArray[1] = new Rectangle();

Answer : 

**In the Rectangle class, there’s no constructor. The line rectangleArray[1] = new Rectangle(); is used as a default constructor to create a new Rectangle object and that doesn’t mean there’s a constructor explicitly define in Rectangle class. So there’s no constructor in Rectangle class.**

3. What’s the meaning of this line of code?
Rectangle[] rectangleArray = new Rectangle[3];

Answer : 

**That line of code is a array declaration, especially array of object. The “Rectangle[]” is an object that used for array, “rectangleArray” as a array name / identifier, “new” as a memory allocation, and “Rectangle[3];” as an array size. So those entire line have a meaning declaration of array with object Rectangle class.**

4. What’s the meaning of these lines of code?
 rectangleArray[1] = new Rectangle();
 rectangleArray[1].length = 80;
 rectangleArray[1].width = 40;

Answer : 

**There are 3 line of code : 
- retangleArray[1] = new Rectangle(); is creating a new Rectangle object and assigned to rectangleArray in second index that uses the default constructor, which initialize attributes to 0.
- rectangleArray[1].length = 80; is used to set the rectangleArray[1] with length attribute and valued 80.
- rectangleArray[1].width = 40; is the same as rectangleArray[1].length = 40; but the difference is this line of code uses attributes width and valued 40.
So all those line of codes create a new Rectangle object that store in index 1 (second).**

5. Why ArrayOfObject class and Rectangle class should be separated?

Answer : 

**The reason why ArrayOfObject class and Rectacngle should be separated is because, it follows the OOP principle or how it works, like how the ArrayOfObject act as object creation and execution, while the Rectangle act as a blueprint. And it also maintaining the code’s reuseability, if both class are combined we should rewrite everytime we need what in blueprint / class Rectangle, it also works for like added shaped (triangle, circle) we don’t need to modify the ArrayOfObject for example. And so it makes the code more organized.**


## 1.3 Input data into Array of Objects using Loops
![image](https://github.com/user-attachments/assets/9887393b-7dbc-4af0-bded-7fb56a2214dc)

## Result : 
![image](https://github.com/user-attachments/assets/c6f4e770-16d5-4da2-a399-fb771da0f5d0)

## 1.3.3 Questions
1. Does array of object can be implemented on 2D array?

Answer : 

**Yes, array of object can be implemented on 2d array. Where each element of array is an object.**

2. If yes, then please give an example. Otherwise, please explain.

Answer : 

![image](https://github.com/user-attachments/assets/2c4de8b9-f030-46da-b973-cf009c9741f7)

**In here, my 2d array of object is type and car model.**

   
3. There is a Square class that has an attribute side with integer as its data type. There
will be an error when we run this code, why?
Square[] squareArray = new Square[100];
squareArray[5].side = 20;

Answer : 

**Because Square[] squareArray = new Square[100]; is creating references of array and NOT creating a Square objects. Each element in squareArray is null by default. We must create and assign object before accessing them. So the correct line code is : Square[] squareArray = new Square();.**

4. Modify the code on part 1.3 so that the length of the array will be defined from user
input.

Answer : 

**We just need to add scanner for user to input, then change the array refrence with num, and then change the all the condition with num from the original code.**
**The changes at comments**
![image](https://github.com/user-attachments/assets/3b982a5a-5e86-421d-a70a-3a4f59e169a2)

![image](https://github.com/user-attachments/assets/c6f4e770-16d5-4da2-a399-fb771da0f5d0)

5. Can we duplicate the instantiation process in array of objects? For example, we assign
the object in ppArray[i] and ppArray[0], the instantiation process of ppArray[0] will be
done twice. What’s the effect of this?

Answer : 

**Yes, we can duplicate the instantiation process in array of objects. It’ll point the same memory location. So if we instantiate twice at the same index, the ppArray[i] object is lost. And if we modify the ppArray[i] the ppArray[0] will also reflected because they had the same reference object.**

## 1.4 Mathematical operation in array of object’s attribute
![image](https://github.com/user-attachments/assets/bc5ac6c6-e12d-4237-9807-2b94a99236b1)

![image](https://github.com/user-attachments/assets/f5d75669-577a-4ad8-bd1f-bd7c52e6ebf9)

## Result : 

![image](https://github.com/user-attachments/assets/1b86cd03-a7da-4626-b1d2-8c23821a1b3c)

1.4.3 Questions
1. Can we have more than one constructor in one class? Please explain.

Answer : 

**Yes we can have more than one constructor in one class. It called constructor overloading, we can use it like practice from week 2**

![image](https://github.com/user-attachments/assets/5af00d86-c67e-4f9c-8e99-eb3dfdae15d2)

**We can use more than one with the exception that the parameter should be different.**

2. Create a Triangle class as follows.
public class Triangle{
public int base;
 public int height;
}
Add another constructor in this class that has parameter int a, int t. These represents
its base and height.

Answer : 

**Adding another constructor that has parameter int a, int t for base and height**

![image](https://github.com/user-attachments/assets/47002372-bca3-407c-87d0-e1ac76410d3a)

3. Add method countArea() and countPerimeter() in class Triangle

Answer : 

**Adding method countArea() and countPerimeter();**

![image](https://github.com/user-attachments/assets/b3e05cca-e66d-499f-88fe-e5227bdb181a)


4. In main function, instantiate array of Triangle objects. Assign the attributes values as
follows:
0th trArray base: 10, height: 4
1st trArray base: 20, height: 10
2nd trArray base: 15, height: 6
3rd trArray base: 25, height: 10

Answer : 

**Instantiate array of Triangle objects**

![image](https://github.com/user-attachments/assets/0e2412a1-1bb3-4310-8c4d-1f4657d2a8a3)

5. Display the result of area and perimeter for each triangle by calling the method
countArea() and countPerimeter()

Answer : 

**For Result**

![image](https://github.com/user-attachments/assets/6e9e25bc-4e14-48d8-a536-b4772feb7eef)

## 1.5 Assignments
**Lecturer15x**

1. **Create a program to display information about lecturers.**

![image](https://github.com/user-attachments/assets/f67e0478-cd6a-48fd-aca7-785519fcc10d)

**LecturerDemo15x**

![image](https://github.com/user-attachments/assets/2be2b9d4-3fbb-4c30-bbda-51b832efabad)

![image](https://github.com/user-attachments/assets/9c248d81-526d-49d3-a99a-8c8731ec6a00)

**For loop usage**

![image](https://github.com/user-attachments/assets/17a6fecc-23a7-45ef-9d37-c63362544e56)

**Foreach loop usage**

![image](https://github.com/user-attachments/assets/52b79aa3-1b4b-4b76-bdb4-753c83dc7b58)

2. **Add a new class called LecturerData< NoPresensi > with the following methods...**

Answer : 

a. showAllLecturerData(Lecturer[] lecturerArray) – Displays all lecturer data.

![image](https://github.com/user-attachments/assets/8161b145-fa17-4429-9739-ff23b6597415)


b. countLecturerByGender(Lecturer[] lecturerArray) – Displays the number of
lecturers based on gender (Male/Female).

![image](https://github.com/user-attachments/assets/f9ea49ee-4b09-4c02-9cbc-c0ac365d0183)


c. averageLecturerAgeByGender(Lecturer[] lecturerArray) – Displays the
average age of lecturers based on gender (Male/Female).

![image](https://github.com/user-attachments/assets/645279f0-ddae-4315-a94c-d17e7cfd925b)


d. showOldestLecturerInfo(Lecturer[] lecturerArray) – Displays the information
of the oldest lecturer.

![image](https://github.com/user-attachments/assets/63a2bc04-9698-4f0b-81c2-b1bf174cadfa)


e. showYoungestLecturerInfo(Lecturer[] lecturerArray) – Displays the
information of the youngest lecturer.

![image](https://github.com/user-attachments/assets/77a1eb75-d98e-4700-9a7b-08204d2273b2)

**Result :**

![image](https://github.com/user-attachments/assets/693c620e-b0d5-496e-b59d-08dc294fcf8a)

![image](https://github.com/user-attachments/assets/c2ff3d5d-26d1-49fb-b4c2-301e2dbbc3e7)

