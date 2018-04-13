(ns toy-problems.is-anagram.is-anagram)


(defn has-same-chars?
  [str1 str2]
  (= (set str1) (set str2)))


(defn char-count
  "given a char `c` return the amount of times it's in a string"
  [c str]
  (count (filter #(= c %) str)))


(defn is-anagram?
  [str1 str2]
  ;;TODO - your code here!
  (if (has-same-chars? str1 str2)
    (reduce
     (fn [acc c]
       (if (= (char-count c str1) (char-count c str2))
         true
         (reduced false)))
     true
     (set str1))
    false))
