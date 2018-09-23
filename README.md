# isPalindrome

A simple program that detects if an accepted string is a palindrome or not and then outputs true or false. The way this implementation works is using Stack objects. It converts an accepted string into 2 identical stacks (one immutable and one mutable). Then, one of the stacks is pushed into a new, empty stack (thus reversing its contents). Finally, the new stack is compared with the original stack (this is where the immutable stack comes in). 
