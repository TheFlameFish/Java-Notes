# If statements & remainders

Note: When comparing two strings, use ```"string.equals(stringB)"``` rather than ```"string == stringB"```

### A simple script to detect whether a given number is even, or odd:
```Java
float eooInput = 50f;
float remainder = eooInput % 2;
if(remainder==0){  // Practically, a switch statement might be better here
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```