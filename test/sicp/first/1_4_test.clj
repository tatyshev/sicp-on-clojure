(ns sicp.first.1_4_test
  (:require [clojure.test :refer :all]
            [sicp.first.1_4 :refer :all]))

(testing "Exercise 1.4"
  (is (= (subject 1 3) 4))
  (is (= (subject -1 3) 2)))
