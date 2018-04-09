(ns toy-problems.is-anagram.is-anagram-test
  (:require [toy-problems.is-anagram.is-anagram :as sut]
            [clojure.test :as t]))

(deftest is-anagram?-test
  (testing "returns true for an anagram"
    (is (true? (is-anagram? "listen" "silent"))))

  (testing "returns false for non-anagrams"
    (is (false? (is-anagram? "hams" "spam"))))

  (testing "handles strs of different lengths"
    (is (false? (is-anagram? "eat" "teas")))))
