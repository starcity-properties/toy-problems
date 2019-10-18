(defn sort-str [s]
  (apply str (sort s)))

(defn anagrams [coll]
  (filter #(> (count %) 1)
    (->> coll
      (sort-by sort-str)
      (partition-by sort-str))))

(->> words
  anagrams
  (sort-by first))
