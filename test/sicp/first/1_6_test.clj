(ns sicp.first.1_6_test
  (:require [clojure.test :refer :all]
            [sicp.first.1_6 :refer [subject]]))

(testing "Exercise 1.6"
  (is (= (subject 4) 2.0000000929222947))
  (is (= (subject 3) 1.7321428571428572)))
