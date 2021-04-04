I. You have a singly linked list, how do you find the 3rd element from the end
#a linked list is a linear collection of data elements, does not have indexes but instead nodes and pointers

def print3rdFromLast(list)
main_ptr = list.head #first element in list
ref_ptr = list.head #first element in list

count = 0 #difference / space between desired element and length
if(list.head is not None):
while(count < 3):
if(ref_ptr is None): #checks if linked list is greater than 0
print "3 is greater than the no. nodes in list"
ref_ptr = ref_ptr.next #goes to next element, creating space between main and ref (difference)
count += 1

while(ref_ptr is not None): #goes until ref is null
main_ptr = main_ptr.next #before first element, now the 3rd element
ref_ptr = ref_ptr.next #the last element or null

print "Node no. 3rd from last is %d " (main_ptr.data)



II. Code up a simple class in the language of your choice to represent a deck of cards with operations to shuffle the deck and to deal one card
#Itertools.Product() is a cartesian product of 2 sets is defines as set of(a,b)

import itertools, random
#make a deck of cards with two sets
deck = list(itertoolss.product(range(1, 14), ['Spade' , 'Heart' , 'Diamond' , 'Club']))
#shuffles the deck
random.shuffle(deck)
#print one card
print(deck[i][0], "of", deck[i][1])  

III. Write a function that takes two strings and return the index of the first occurence of one string in the other
#str.find(sub[, start[, end]]) to find occurences

def occurence(str1, str2):
index = str2.find(str1)
    return index

IV. I have an array of numbers, how do I return the list of numbers that have an odd number of occurrences
def oddInArray(array):
  listOdd = []
  for i in array:
    count = 0
    for j in array:
      if i == j:
        count += 1
    if count % 2 != 0:
      if i not in listOdd:
        listOdd.append(i)  
  return listOdd

myArray = [3, 5, 6, 3, 4, 5, 3, 4, 6, 2, 4, 5, 1]
print (oddInArray(myArray))

V. I have an array of random numbers, how do I find the 2nd largest and 2nd smallest number in an array?
list1 = [10, 2, 4, 5, 3, 4, 5, 14, 16, 14, 3, 16, 2]
 
# sorting the list
list1.sort()
final_list = []
for num in list1:
        if num not in final_list:
            final_list.append(num)

# printing the second last element
print("Second largest number is:", final_list[-2])
print("Second Smallest number is:", final_list[1])

VI. Write a function to reverse a string
def reverseString(str):
  return str[::-1]
  #the slice statement [::-1] means start at the end of the string and end at position 0, move with the step -1, negative one, which means one step backwards.

mytxt = reverseString("Hello World")

print(mytxt)
