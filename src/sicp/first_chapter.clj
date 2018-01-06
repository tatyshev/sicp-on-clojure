(ns sicp.first_chapter)

; Regular expression written in prefix notation
(defn exercise_1_2 []
  (/
   (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5)))))
   (* 3 (- 6 2) (- 2 7))))

; Get 2 max values from [x y z] and return sum of squares
(defn exercise_1_3 [& args]
  (reduce +
    (map
      (fn [x] (* x x))
      (take-last 2 (sort args)))))

; Plus or minus, depending on the value of b
(defn exercise_1_4 [a b]
  ((if (> b 0) + -) a b))
