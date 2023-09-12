# Switch Statements

### Basically a vastly simpler if statement (for specific cases)

* Don't use with floats, rounding errors
* Best with enums

```Java


int medalPlacement = 1;

switch (medalPlacement) {
    case 1: System.out.println("GOLD"); break;
    case 2: System.out.println("SILVER"); break;
    case 3: System.out.println("BRONZE"); break;
    default: System.out.println("NO MEDAL"); break; // Loser
}
```