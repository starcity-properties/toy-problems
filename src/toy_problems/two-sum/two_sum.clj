(ns toy-problems.two-sum.two-sum)

(defn two-sum*
  [target numbers]
  (let [s (set numbers)]
    (boolean
     (some
      #(contains? s (- target %))
      numbers))))


(defn two-sum
  "Returns true if any two `numbers` add up to `target`."
  [target numbers]
  (if (even? target)
    (or (= 2 (filter (partial = (/ target 2)) numbers))
        (two-sum* target numbers))
    (two-sum* target numbers)))
