(ns toy-problems.telephone-words.telephone-words)

(def digits->letters
  {"0" "0"
   "1" "1"
   "2" "ABC"
   "3" "DEF"
   "4" "GHI"
   "5" "JKL"
   "6" "MNO"
   "7" "PQRS"
   "8" "TUV"
   "9" "WXYZ"})


(defn telephone-words
  "Given a string of digits in a phone number, produce a list of words that could
  be spelled on a telephone keypad using those digits."
  [digits]
  (->> digits
       (map str)
       (map digits->letters)
       (reduce #(for [ss %1 s %2] (str ss s)))))
