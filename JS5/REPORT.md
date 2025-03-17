|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020157|
| Nama |  HANZEL PUTRA WOLLWAGE |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/hanzelputrawollwage/ALSD-Smt2)|

# JOB SHEET 5 REPORT

## 5.2 Calculating Factorial Using Brute Force and Divide and Conquer Algorithms
## 5.2.2 Result : 

![image](https://github.com/user-attachments/assets/f187bc85-b8dd-4df4-a728-b1769122e772)

## 5.2.3. Question's Answer : 

1. The difference in base case between if and else 
- If condition: uses checks if n is equal to 1, and if it does, it directly returns 1. It serves to stop the infinite recursion
- Else condition: it recursively calls facotrialDC(n-1), by multiplying n with factorial of (n-1) then continues to breakdown the smaller problems / subproblems until it reach 1, or n ==1

![image](https://github.com/user-attachments/assets/f62a7d37-24b5-4320-8559-fa44df1c4bc8)

So the if condition stops the recursion and return fixed value, while the else condition performs recursive multiplication until it reach value 1.

2. We can use while loop as an alternative for loop in factorialBF() like this and work the same :

![image](https://github.com/user-attachments/assets/e9ddc878-0563-4722-b78c-b0742a52848b)

3. Differences Between facto = facto * i; and int facto = n * factorialDC(n-1);
- Facto = facto * i : It updates an existing variable in the loop. It performs continuously multiplication like 1x1,1x2,3x3,8x4
- int facto = n * factorialDC(n-1) : It creates new variable in each recursive call factorialDC(). The multiplication happens backward as the recursive call return

4. The factorialBF() works iteratively looping the value one by one, while factorialDC() works by recursion and splitting the problems into smaller subproblems then solving it

## 5.3 Calculating Exponentiation Using Brute Force and Divide and Conquer Algorithms
## 5.3.2 Result : 

![image](https://github.com/user-attachments/assets/50b1ac91-453a-46e5-b4cd-a85c824839bc)

## 5.3.3. Question's Answer : 

1. Both method has the same function, that is to calculate n to the power of e. The difference are, powerBF() use bruteforce and done iteratively, while powerDC() use divide and conquer and done by recursion
2. Yes, the combine stage exist it in this block of code

![image](https://github.com/user-attachments/assets/ce76f0fa-3d6a-42b7-88b9-5e1fb613601c)

3. Yes, the method could be implemented without parameter, because baseNumber and exponent is already stored as class variable, so we can use this instead.
4. The powerBF() use iteration, it use loop to multiply baseNumber by itself exponent number of times. While,powerDC()it uses recursion to split the exponentiation into smaller problems. Reduces the problem size by half each time

## 5.4 Calculating Array Sum Using Brute Force and Divide and Conquer Algorithms
## 5.4.2 Result : 

![image](https://github.com/user-attachments/assets/ae29a169-0b6d-4b49-9cce-4e36831a36df)

## 5.4.3. Question's Answer : 
1. mid variable is needed so that it can divide the problem into 2 smaller subproblems. It helps by dividing the array into 2 halves, left subarray and right sub
2. totalDC(arr, l, mid) Recursively computes the sum of the left half of the array (from index l to mid). totalDC(arr, mid+1, r) Recursively computes the sum of the right half of the array (from index mid+1 to r).
3. It's necessary since it's the combine stage, and returns the total sum for the current segment of the array
4. The if(l==r){ return arr[l]; is the base case

![image](https://github.com/user-attachments/assets/c337f07a-af30-4ebb-83a5-861b66ff77a5)

When the left index l is equal to the right index r
5. Divide the array into two halves, left and right. Each halves have a recursion function to sum the total. Finally it will returned the combined value of left half and right half.

## 5.5. Assignments
a) Find the highest Midterm Score (UTS) using the Divide and Conquer approach.

![image](https://github.com/user-attachments/assets/0ca534db-44f0-4b4f-b06c-1b6b8d25742c)

b) Find the lowest Midterm Score (UTS) using the Divide and Conquer approach.

![image](https://github.com/user-attachments/assets/745fe260-ca87-485a-93ba-19e4fd24dc13)

c) Calculate the average Final Score (UAS) of all students using the Brute Force approach.

![image](https://github.com/user-attachments/assets/aa206b5d-d542-4755-97e4-502460e36064)

## Main : 

![image](https://github.com/user-attachments/assets/b55c8f62-e762-4c1e-bfcc-7f733ce013b3)

## Result : 

![image](https://github.com/user-attachments/assets/57b8503d-35e4-44c0-a739-0580d656ba18)

























































































