(ns toy-problems.even-occurrence.even-occurence)


(defn- get-first-even-occurrence
  [items frequencies]
  (reduce
   (fn [coll val]
     (if (even? (get frequencies val))
       (reduced val)
       coll))
   items
   items))


(defn even-occurence
  [items]
  (let [solution (->> (frequencies items)
                      (get-first-even-occurrence items))]
    (when-not (= solution items)
      solution)))



(even-occurence [:one :two :three :four :two :three :one :five])

(frequencies [:one :two :three :four :two :three :one :five])

(even-occurence [1 7 2 4 5 6 8 9 6 4])

(even-occurence [5 3 2 5 4 5 9])

(even-occurence [ [1 2] [3 4] [1 2]])
