# Roman Numeral Translator


## Your Goal
Write a function, `roman->arabic`, that will accept a *string* representing a [Roman numeral](https://en.wikipedia.org/wiki/Roman_numerals) and return an *integer* that expresses that roman numeral as an [Arabic numeral](https://en.wikipedia.org/wiki/Arabic_numerals).

When a smaller numeral appears in front of a larger one, its value is subtracted from the value of the next numeral (for more context about this feature of Roman numerals, see [this Wikipedia article](https://en.wikipedia.org/wiki/Subtractive_notation)). This means numbers like `4` and `9` are expressed as `IV` and `IX`, respectively. You may assume, for the sake of this problem, that **you will only encounter one smaller numeral in front of a larger one**.

## Other Helpful Assumptions
In addition to the assumption described above, you may also assume:

- The input will always be a string of capital letters
- The input will always be a correctly-formed Roman numeral
- You will never need to handle numbers larger than MMMCMXCIX (3999), which is the largest number representable with ordinary letters.


## Example Usage

```clojure
(roman->arabic "I") ;;=> 1
(roman->arabic "IV") ;;=> 4
(roman->arabic "LX") ;;=> 60
(roman->arabic "XC") ;;=> 90
(roman->arabic "MCMLXXXIII") ;;=> 1983
(roman->arabic "MMCMXCIX") ;;=> 2999
```
