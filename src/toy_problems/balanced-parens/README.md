# Balanced Parens

Write a function that accepts a string and returns a boolean value indicating whether or not the parentheses in that string are "balanced," meaning that for every opening parenthesis there is a matching closing parenthesis in the correct order.

## Example Usage
```clojure
(balanced-parens "(") ;;=> false
(balanced-parens "()") ;;=> true
(balanced-parens ")(") ;;=> false
(balanced-parens "(())") ;;=> true
```

## Advanced Content
Extend your `balanced-parens` function to work on parenthesis, square brackets, and curly brackets!

```clojure
(balanced-parens "[](){}") ;;=> true
(balanced-parens "[({})]") ;;=> true
(balanced-parens "[(]{)}") ;;=> false

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
