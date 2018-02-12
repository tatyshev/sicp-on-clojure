; recursive vs iterative

(ns sicp.first.1_9)

(defn recursive [a b]
  (if (= a 0)
      b
      (inc (recursive (dec a) b))))

(defn iterative [a b]
  (if (= a 0)
      b
      (+ (dec a) (inc b))))
