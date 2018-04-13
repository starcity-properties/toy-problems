(ns toy-problems.is-anagram.is-anagram)


;; time: O(n log(n))
;; space: O(n)
(defn is-anagram?
  [str1 str2]
  (and (not= str1 str2)
       (= (sort str1) (sort str2))))


(comment

  (is-anagram? "abb" "bba")

  (is-anagram? "aba" "bab")

  (is-anagram? "abbr" "rbab")

  (is-anagram? "abbc" "bbaa")

  (is-anagram? "abc" "abc")

  )


;; time O(n)
;; space O(1)
;; linear time and constant space achieved by
;; building a map of character frequencies
;; are the two maps equal?
