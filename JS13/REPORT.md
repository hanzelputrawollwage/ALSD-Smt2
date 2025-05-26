|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020157|
| Nama |  HANZEL PUTRA WOLLWAGE |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/hanzelputrawollwage/ALSD-Smt2)|

# JOB SHEET 13 REPORT

# 12.2 Experiment 1

## 12.2.2 Output Verification

![image](https://github.com/user-attachments/assets/a28ef0aa-b396-42f9-84ef-a28aece75450)

12.2.3 Question's Answer
1. A singly linked list only goes one way — each node points to the next one. A doubly linked list goes both ways — each node has a pointer to the next and the previous node.
2. The next pointer moves forward to the next node. The prev pointer moves backward to the previous node.
3. The constructor sets up an empty list by making both head and tail null. This means the list starts with no data.
4. If the list is empty, the new node becomes both the head and tail since it’s the only node in the list.
5. When adding a node to the beginning of a non-empty list, we set head.prev = newNode to link the current first node back to the new node.
6. The line current.next.prev = newNode connects the new node to the next node in the list. This keeps the backward links correct when inserting in the middle.
7. The print() method walks through the list from head to tail, printing each node. The line temp = temp.next moves to the next node every time.
8. If the node you're inserting after is the tail, it just calls addLast() to add the new node at the end. If you remove this, you'd have to handle it manually, which could lead to bugs.
9. The search checks if the nim (student ID) matches the one you're looking for — it ignores uppercase/lowercase differences so it's easier to find.

# 12.3 Experiment 2

## 12.3.2 Output Verification

![image](https://github.com/user-attachments/assets/e0e53b99-41bd-4e60-bb25-93430aa0009d)

## 12.3.3 Question's Answer
1. head = head.next removes the first node by moving the head to the next one. head.prev = null cuts the backward link so the old head is completely removed.
2. This condition checks if there's only one node in the list. If so, both head and tail are set to null — the list is now empty. Skipping this can cause errors.
3. To remove the last node, go from head to the second-last node, then set next to null:

![image](https://github.com/user-attachments/assets/1e357c00-bc2e-4b41-8097-fb4cb9def603)

4. This code checks if the list is empty before doing anything. This prevents errors when trying to remove something from an empty list.
5. When removing the first node, it uses removeFirst() to update the head and disconnect the node. When removing the last, it uses removeLast() to do the same for the tail.
6. To remove a node at a specific index:
- Find the node
- Reconnect the previous and next nodes : 

![image](https://github.com/user-attachments/assets/90611b86-23d7-4753-9695-be739c532ab8)

# 12.5 Assignments
1. add()

![image](https://github.com/user-attachments/assets/d89adc3c-9fa0-41c5-b4f2-6e0957f711e9)
 
2. removeAfter()

![image](https://github.com/user-attachments/assets/5e4ed783-ed57-4ecd-818f-0e8b767eb7fe)

3. getFirst(), getLast(), getIndex()

![image](https://github.com/user-attachments/assets/ce249f86-6e34-4140-9ad2-111385e544e6)

4. getSize()

![image](https://github.com/user-attachments/assets/22c36609-59b6-45d1-afc9-9b55286773df)

   
5. indexOf()

![image](https://github.com/user-attachments/assets/1163008b-25dc-427e-bbdf-f09806a336c7)
