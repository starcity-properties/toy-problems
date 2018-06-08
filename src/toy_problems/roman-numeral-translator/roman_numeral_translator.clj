(ns toy-problems.path-parser.roman-numeral-translator.roman-numeral-translator)


(ns roman-arabic-conv.core
  (:gen-class))

(def digit-values {:I 1
                   :V 5
                   :X 10
                   :L 50
                   :C 100
                   :D 500
                   :M 1000})

(defn char->keyword [c] (-> c str keyword))

(defn compute-value [n1 n2]
  (let [v1 (n1 digit-values)
        v2 (n2 digit-values)]
    (prn :v1 v1 :v2 v2)
    (if (>= v1 v2)
      (+ v1 v2)
      (- v2 v1))))

(defn roman->arabic [num arabic-sum]
  (prn :num num :empty? (empty? num))
  (if (empty? num)
    arabic-sum
    (let [first-num (char->keyword (first num))
          second-num (char->keyword (second num))
          rest-num (rest (rest num))]
      (recur rest-num (+ arabic-sum (compute-value first-num second-num))))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (roman->arabic "MM" 0)))
