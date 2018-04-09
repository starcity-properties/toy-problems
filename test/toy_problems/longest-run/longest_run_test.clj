(ns toy-problems.longest-run.longest-run-test
  (:require [toy-problems.longest-run.longest-run :refer :all]
            [clojure.test :refer :all]))


(deftest simple
  (testing "handles a simple case"
    (is (= (longest-run "bobby") [2 3]))))


(deftest no-run
  (testing "returns [0 0] when there are no runs"
    (is (= (longest-run "a dingo ate my baby") [0 0]))))


(deftest multiple-runs
  (testing "can handle inputs with multiple runs"
    (is (= (longest-run "aabbbcc") [2 4]))))


(deftest multiple-runs-of-same-length
  (testing "gives the first occurence of the longest run"
    (is (= (longest-run "abbbccdddeee") [1 3]))))


(deftest empty-input
  (testing "doesn't barf at an empty input"
    (is (= (longest-run "") [0 0]))))
