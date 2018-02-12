(ns sicp.first.1_10)

(defn subject [x y]
  (cond (= y 0) 0
        (= x 0) (* 2 y)
        (= y 1) 2
        :else (subject (- x 1)
                 (subject x (- y 1)))))
