(ns toy-problems.contiguous-sum.contiguous-sum)

;; Write a function that accepts a vector of numbers and returns the greatest contiguous sum of numbers in it.
;; If a vector contains only one number, that single number will count as a contiguous sum.


(defn contiguous-sum
  [numbers]
  (first
   (reduce
    (fn [[max-sum running-sum] n]
      (let [current-running-sum (max n (+ running-sum n))]
        [(max max-sum current-running-sum) current-running-sum]))
    [Integer/MIN_VALUE Integer/MIN_VALUE] numbers)))


(contiguous-sum [1 2 3]) ;;=> 6

(contiguous-sum [1 2 3 -4]) ;;=> 6

(contiguous-sum [1 2 3 -4 5]) ;;=> 7

(contiguous-sum [4 -1 5]) ;;=> 8

(contiguous-sum [10 -11 11]) ;;=> 11

(contiguous-sum [-10 -11 30]) ;;=> 30

(contiguous-sum [10 -1 30]) ;;=> 39

(contiguous-sum [-10 -100 -30]) ;;=> -10
