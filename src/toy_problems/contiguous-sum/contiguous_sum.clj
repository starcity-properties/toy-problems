(ns toy-problems.contiguous-sum.contiguous-sum)


(defn- largest-sum
  [numbers]
  (when (not (empty? numbers))
    (vec (map-indexed (fn [idx _]
                        (apply + (subvec numbers 0 (inc idx))))
                      numbers))))

(defn contiguous-sum
  [numbers]
  (if (<= (count numbers) 1)
    (first numbers)
    (loop [left numbers
           sums #{}]
      (if (empty? left)
        (apply max sums)
        (recur (vec (second (split-at 1 left))) (into sums (largest-sum left)))))))
