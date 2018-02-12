(ns sicp.first.1_9_test
  (:require [clojure.test :refer :all]
            [sicp.first.1_9 :refer [recursive iterative]]))

(testing "Exercise 1.9"
  (is (= (recursive 4 5) 9))
  (is (= (iterative 4 5) 9)))
