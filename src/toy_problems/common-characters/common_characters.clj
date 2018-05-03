(ns toy-problems.common-characters.common-characters
  (:require [clojure.string :as str]))


(defn collect-chars
  [str1 strs]
  (reduce
   (fn [coll str]
     (conj coll
           (into #{}
                 (map (into #{} (str/split str1 #"")) (str/split str #"")))))
   #{}
   strs))


(defn common-characters-unordered
  [string1 & strings]
  (str/join (apply min-key
                   #(count %)
                   (remove #{" "} (collect-chars string1 strings)))))


;; ======================================



(defn ordered-chars
  [str1 str2]
  (reduce
   (fn [coll letter]
     (when
         (and (some? ((into #{} (str/split str1 #"")) (str letter)))
              (not (some (into #{} (str/split coll #"")) (str letter))))
       (str coll letter)))
   ""
   (str/replace str2 " " "")))


(defn common-characters
  [string1 & strings]
  (apply min-key
         #(count %)
         (reduce
          (fn [coll string]
            (conj coll (ordered-chars string1 string)))
          []
          strings)))
