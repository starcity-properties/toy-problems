(ns toy-problems.longest-run.longest-run)


(defn- str->tuples
  [str]
  (map-indexed
   (fn [i v]
     [i v])
   str))


(defn- find-starts-of-runs
  [str tuples]
  (reduce
   (fn [acc [i char]]
     (if (>= (dec i) 0)
       (if (not= char (nth str (dec i)))
         (conj acc i)
         acc)
       (conj acc i)))
   []
   tuples))


(defn- match-starts-to-ends
  [length starts]
  (map-indexed
   (fn [i start]
     [start (if (< (inc i) (count starts))
              (dec (nth starts (inc i)))
              start)])
   starts))


(defn- find-largest-diff
  [pairs]
  (reduce
   (fn [[a b] [x y]]
     (if (> (- y x) (- b a))
       [x y]
       [a b]))
   [0 0]
   pairs))


(defn longest-run
  [str]
  (->> (str->tuples str)
       (find-starts-of-runs str)
       (match-starts-to-ends (count str))
       (find-largest-diff)))
