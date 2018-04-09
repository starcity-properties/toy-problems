(ns toy-problems.two-sum.two-sum-test
  (:require [toy-problems.two-sum.two-sum :as sut]
            [clojure.test :refer :all]))

(deftest two-sum-test-1
  (testing "Returns true for a simple case."
    (is (true? (sut/two-sum 7 [1 2 8 3 5 3])))))


(deftest two-sum-test-2
  (testing "returns false for a simple case."
    (is (false? (sut/two-sum 7 [1 8 3 5 3])))))


(deftest empty-list
  (testing "returns false when given an empty list"
    (is (false? (sut/two-sum 5 [])))))
