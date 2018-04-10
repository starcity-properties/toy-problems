(ns toy-problems.is-anagram.is-anagram
  (:require [clojure.string :as str]))

(defn- remove-at
  [v i]
  (concat (subvec v 0 i) (subvec v (inc i))))


(defn is-anagram?
  [str1 str2]
  (boolean
   (when (and (= (count str1) (count str2))
              (not= str1 str2))
     (empty? (reduce (fn [left char]
                          (if-let [char-index (str/index-of left char)]
                            (str/join "" (remove-at (str/split left #"") char-index))
                            (reduced "not an anagram...")))
                        str1
                        str2)))))
