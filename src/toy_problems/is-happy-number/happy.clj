(defn explode-digits [n]
  (map #(Integer. (str %))
    (str n)))

(defn happy?
  ([n seen]
   (prn n)
   (cond (= 1 n) true
         (seen n) false
         :else (recur
                 (apply + (map #(* % %)
                            (explode-digits n)))
                 (conj seen n))))
  ([n]
   (happy? n #{})))
