(ns toy-problems.common-characters.common-characters
  (:require [clojure.set :as cset]
            [clojure.string :as cstring]))


(defn- produce-common-set
  [strings]
  (->> (map set strings)
       (apply cset/intersection)))


(defn common-characters
  [& strings]
  (let [common-set (produce-common-set strings)]
    (reduce #(if (and (contains? common-set %2)
                      (not (cstring/includes? %1 (str %2))))
               (str %1 %2)
               %1)
            "" (first strings))))


(common-characters "lkaaaadaaasaaaaadjf" "aads" "lskdajfslls") ;;=> "ads"
