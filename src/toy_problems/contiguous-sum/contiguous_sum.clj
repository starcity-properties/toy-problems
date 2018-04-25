(ns toy-problems.contiguous-sum.contiguous-sum)


(defn- largest-sum
  [numbers]
  (when (not (empty? numbers))
    (vec (map-indexed (fn [idx _]
                        (apply + (first (split-at (inc idx) numbers))))
                  numbers))))


(defn contiguous-sum
  [numbers]
  (if (= 1 (count numbers))
    (first numbers)
    (loop [i   0
           left numbers
           sums #{}]
      (if (empty? left)
        (apply max sums)
        (recur (inc i) (second (split-at i left)) (into sums (largest-sum left)))))))
