; Yet another "if" implementation

(ns sicp.first.1_6)

(defn subject [predicate then-clause else-clause]
  (cond
    predicate then-clause
    :else else-clause))
