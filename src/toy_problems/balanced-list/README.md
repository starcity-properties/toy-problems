# Balanced List

## Contextual Information
Today, we'll be playing with the notion of a **balanced list of numbers**. A list is considered *balanced* if there is an index within the list at which the sum of all the values to the *left* of that index is equal to the sum of all the values to the *right* of that index, with neither sum including the value at the index itself.

To help introduce the concept, let's look at a vector of numbers:

```clojure
[2 8 12 5 3 2]
```

This vector is considered **balanced** at the third number in the vector, because the sum of the values to the left (`2 + 8`) is equal to the sum of the values to the right (`5 + 3 + 2`).

```clojure
[1 6 -3 21 7]
```

This vector, however, is **not balanced.** There is no point in the vector at which the values to the left equal the values to the right.

```clojure
[2 6 3 6 5]
```

This vector is **also not balanced**. We must ignore one of the numbers in the vector, as we determine whether or not that number is the point at which the vector becomes balanced.

```clojure
[1 1 1 1 1 1 15 6]
```

Note that a balanced vector is not necessarily symmetrical. This vector is **balanced** at the 6th index (where the value `15` appears).


## Your Goal
Write a function that accepts a vector of integers, and returns the index within that vector at which the vector is balanced, according to the definition above. If there is no point at which the vector is balanced, return `nil`.


## Example Usage

```clojure
(balanced-index [2 8 12 5 3 2]) ;;=> 2
(balanced-index [1 6 -3 21 7]) ;;=> nil
(balanced-index [2 6 3 6 5]) ;;=> nil
(balanced-index [1 1 1 1 1 1 15 6]) ;;=> 6
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
