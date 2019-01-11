# Latest Version Numbers

> Adapted from [Leetcode # 165](https://leetcode.com/problems/compare-version-numbers/):

Write a function that accepts two strings which represent *version numbers*, and returns the "latest" version number. If both numbers are the same, return the first version number.

You may assume that the version strings are non-empty and contain only digits and the `.` character.

The `.` character does not represent a decimal point and is used to separate number sequences.

For instance, `"2.5"` is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

You may assume the default revision number for each level of a version number to be 0. For example, version number 3.4 has a revision number of 3 and 4 for its first and second level revision number. Its third and fourth level revision number are both 0.

## Example Usage
#### in Clojure:

```clojure
(latest-version-number "0.1" "1.1") ;;=> "1.1"
(latest-version-number "1.0.1" "1") ;;=> "1.0.1"
(latest-version-number "7.5.2.4" "7.5.3") ;;=> "7.5.3"

;; NOTE: leading zeroes should be ignored.
(latest-version-number "1.01" "1.001") ;;=> "1.01"
(latest-version-number "1.01" "1.1") ;;=> "1.01"
```

#### in JavaScript:

```javascript
latestVersionNumber("0.1", "1.1"); // => "1.1"
latestVersionNumber("1.0.1", "1"); //=> "1.0.1"
latestVersionNumber("7.5.2.4", "7.5.3"); //=> "7.5.3"

// NOTE: leading zeroes should be ignored.
latestVersionNumber("1.01", "1.001"); //=> "1.01"
latestVersionNumber("1.01", "1.1"); //=> "1.01"
```

## Problem Solving Process
Use these steps below to aid you in using the problem solving process.

#### Specification (define the rules to the problem)


#### Justificaiton (why would I call this function?)


#### Explanation (how does the input to the function relate to the output?)


#### Visualization (draw a plan that another engineer could understand and implement)


#### Approximation (translate your drawing of a plan into pseudocode)


#### Verification (use sample inputs and "be the machine" - interpreting your plan like code)


#### Implementation (translate your pseudocode into beautiful, simple code!)
