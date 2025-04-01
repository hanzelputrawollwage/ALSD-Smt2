|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020157|
| Nama |  HANZEL PUTRA WOLLWAGE |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/hanzelputrawollwage/ALSD-Smt2)|

# JOB SHEET 6 REPORT


# 7.2 Sequential Search Method

## 7.2 Result

![image](https://github.com/user-attachments/assets/ec996be8-b81b-4878-b564-3d4e7009bff2)
![image](https://github.com/user-attachments/assets/44a556c9-284c-4023-960e-ab4e216ce2ab)

## 7.3 Question's Answer

1. The difference between displayData() and displayPosition() methods in StudentSearch15 class are : 
- displayData() : is a method that show / display details about the Student NIM, Name, Age, and the GPA.
- displayPosition() : is a method that show / display is the Student is in the list or not by displaying the index position of a Student in the array when we tried to search it.

2. Function of break in this program

    ![image](https://github.com/user-attachments/assets/8b2426ab-22b9-4f5c-b959-0c6a6b53db07)

    The break here is to stop the loop when the student with the same search of NIM that user input is found. So this thing here is to stop the iteration of condition listStd[i].nim is matches what the user search for.

3. NO, the program wouldn’t encounter an error, because SEQUENTIAL SEARCH works fine with unsorted data, but BINARY SEARCH gives incorrect results if the list is not sorted. The reason is Sequential search checks each element 1 by 1 regardless of order.

4. The reason it initialized by -1 instead of 0 is just the matter of misconception of array. If the Student that we search for is not found in the list we mark them with / as index -1. 0 index is the first index in array, so if we mark the non-exist student as 0, the program think that “not found student” is the first index.

  
# 7.3 Binary Search Method
## 7.2 Result

![image](https://github.com/user-attachments/assets/f49e06c9-de6a-44d4-a384-29de6f3d1f30)

## 7.3 Question's Answer

1. The program code / line that runs the divide process is :

    ![image](https://github.com/user-attachments/assets/41a19117-4432-42d9-ac36-0abc22197b25)

2. The program code / line that runs the conquer process is :

    ![image](https://github.com/user-attachments/assets/f190b636-11cb-4148-870a-7452e8d9b7da)

3. NO, the program would’t gave the correct result, because Binary Searches only works on sorted list, and if the NIM isn’t sorted, it would’t find the correct index because the program assumes that the middle element correctly divides the search space. For example : we have sorted array (20215, 20214 20212, 20211,20210) then if we search for 20210 the algorithm will correctly find it at index 4, but if it’s not sorted like (20214, 20215, 20210, 20212, 20211) if we search for 20210, the algorithm may check the wrong half and fail to find it, because it expect to be sorted before.

4. First is to add a new constructor for accepting the number of student :

     ![image](https://github.com/user-attachments/assets/962382b1-466b-4b96-a766-7a036eb18f9a)

    Then add the scanner for accepting a number user’s input, change the amountStudent = 5; into scanner (s.nextInt()), and for last is add a “amountStudent” in parameter.

     ![image](https://github.com/user-attachments/assets/4f9c7b4d-a4b3-4908-bd5b-5023f3bc5c3f)


# 7.4 Review Divide and Conquer
## 7.2 Result

![image](https://github.com/user-attachments/assets/0accb0da-4f66-47cd-bb2e-7aa48915292e)

# 7.5 Assignments
a. Sequential Search : 

  ![image](https://github.com/user-attachments/assets/211abcd9-bad2-4c34-ae72-ff982ddc1ef5)

  Changes Result : 
  
  ![image](https://github.com/user-attachments/assets/886ecae0-c854-4cba-91b2-951d06050c5c)

b. Binary Search : 

  ![image](https://github.com/user-attachments/assets/e84f1ae8-e777-4d0c-beb0-7590be5638f2)

  Changes Result : 
  
  ![image](https://github.com/user-attachments/assets/c283804b-1305-4d81-accf-43aac2b4e7f3)











    
