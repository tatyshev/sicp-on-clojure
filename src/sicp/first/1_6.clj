; square root newton's method

(ns sicp.first.1_6)

(def precision 0.001)

(defn square [x] (* x x))

(defn abs [x] (if (> x 0) x (- x)))

(defn enough? [x y]
  (<
   (/ (abs (- (square x) y)) x) precision))

(defn avarage [x y]
  (/ (+ x y) 2))

(defn improve [guess x]
  (avarage guess (/ x guess)))

(defn sqrt-iter [guess x]
  (if (enough? guess x)
    guess
    (sqrt-iter (improve guess x) x)))

(defn subject [x]
  (sqrt-iter 1.0 x))
