# Coin Sums

## Contextual Information about the Problem
In England the currency is made up of **pound, £**, And **pence, p**.
There are eight coins in circulation:

* 1p piece
* 2p piece
* 5p piece
* 10p piece
* 20p piece
* 50p piece
* £1 (100p)
* £2 (200p)

It is possible to make £2 in the following way:
1 * £1 + 1 * 50p + 2 * 20p + 1 * 5p + 1 * 2p + 3 * 1p

**Thought Exercise:** How many different ways can £2 be made using any number of coins?

## Your Goal
Write a function `make-change` that accepts a *number* indicating an amount of money, expressed in `p`'. Your function will return a *number* representing the total number of possible ways you could create that sum from the denominations of coins listed above.


**RED HERRING ALERT!** Note that our return value is an expression of *the total number of combinations which add up to the input sum*, not the *list of combinations itself*. That being said, your solution should not count the same combination twice (that is, **`3 * 1p + 1 * 2p`** is considered the same as **`1 * 2p + 3 * 1p`**).

## Example Usage
```clojure
;; there's only one way to make 1p, with one 1p coin (1 * 1p)
(make-change 1) ;; => 1

;; there are two ways to make 2p (2 * 1p, 1 * 2p)
(make-change 2) ;; => 2

;; there are four ways to make 5p (5 * 1p, 1 * 2p + 3 * 1p, 2 * 2p + 1 * 1p, 1 * 5p)
(make-change 5) ;; => 4
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
