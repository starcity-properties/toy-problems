# Longest Run

 Write a function that, given a string, Finds the longest run of identical characters and returns an vector containing the start and end indices of that run. If there are two runs of equal length, return the first one.

  For example:
```clojure
(longest-run "abbbcc") ;;=> [1, 3]
(longest-run "aabbc") ;; => [0, 1]
(longest-run "abcd") ;; => [0, 0]
```
 Try your function with long, random strings to make sure it handles large inputs well.
