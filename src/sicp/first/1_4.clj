; Plus or minus, depending on the value of b

(ns sicp.first.1_4)

(defn subject [a b]
  ((if (> b 0) + -) a b))
