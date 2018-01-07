(ns sicp.first.1_3_test
  (:require [clojure.test :refer :all]
            [sicp.first.1_3 :refer :all]))

(testing "Exercise 1.3"
  (is (= (subject 5 2 6) 61)))
