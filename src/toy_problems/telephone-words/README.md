# Telephone Words

## Contextual Information about the Problem


Before the advent of websites with memorable URLs, businesses would often use [phonewords](https://en.wikipedia.org/wiki/Phoneword) to make their phone numbers more memorable (and therefore, more useful in advertisements).

From Wikipedia:

> Phonewords are mnemonic phrases represented as alphanumeric equivalents of a telephone number. In many countries, the digits on the telephone keypad also have letters assigned. By replacing the digits of a telephone number with the corresponding letters, it is sometimes possible to form a whole or partial word, an acronym, abbreviation, or some other alphanumeric combination.

For example: if Starcity had the number `1-800-782-7289`, we might display that phone number in marketing materials as "1-800-STARCTY".


## Your Goal
Write a function `telephone-words` that accepts a *string* representing up to four digits of a phone number, and returns a *list* of *strings* representing all the words that could be written on a phone with that number. You should return all possibilities, not only English words.

To help you get started, you have been provided a mapping of keypad digits to their possible letters. Note that the digits `0` and `1` do not have letters associated with them - these digits should be kept in the output as numbers.

## Example Usage
```clojure
(telephone-words "2745") ;;=> '("APGJ" "APGK" "APGL" ...)

(telephone-words "022") ;;=> '("0AA", "0AB" "0AC" ...)
```


## Problem Solving Process
Use these steps below to aid you in using the problem solving process.

#### Specification (define the rules to the problem)


#### Justificaiton (why would I call this function?)


#### Explanation (how does the input to the function relate to the output?)


#### Visualization (draw a plan that another engineer could understand and implement)


#### Approximation (translate your drawing of a plan into pseudocode)


#### Verification (use sample inputs and "be the machine" - interpreting your plan like code)


#### Implementation (translate your pseudocode into beautiful, simple clojure!)
