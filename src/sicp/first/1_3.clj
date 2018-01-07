; Get 2 max values from [x y z] and return sum of squares

(ns sicp.first.1_3)

(defn subject [& args]
  (reduce +
    (map #(* % %)
      (take-last 2 (sort args)))))
