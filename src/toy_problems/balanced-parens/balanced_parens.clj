(ns toy-problems.balanced-parens.balanced-parens)


(defn balanced-parens
  [string]
  (empty?
   (reduce (fn [stack ch]
             (let [standard-of-balance {\) \( \} \{ \] \[}
                   in-close-parens?    (partial get standard-of-balance)
                   in-open-parens?     (partial get (clojure.set/map-invert standard-of-balance))]

               (cond
                 (and (empty? stack)
                      (some? (in-close-parens? ch)))
                 (reduced (conj stack "exit early"))

                 (and (not (empty? stack))
                      (= (in-close-parens? ch) (peek stack)))
                 (pop stack)

                 (some? (in-open-parens? ch))
                 (conj stack ch)

                 :else stack)))
           []
           string)))


(comment

  (balanced-parens "()") ;; => true

  (balanced-parens ")(") ;; => false

  (balanced-parens "[]{}()") ;; => true

  (balanced-parens "(lol [0 1 2 3] + {})") ;; => true

  (balanced-parens "{:a 3 :b [{:c 4} {:d 5}] :e (inc 4)}") ;; => true

  (balanced-parens "{:a 3 } :b [{:c 4} {:d 5}] :e (inc 4)}") ;; => false

  )
