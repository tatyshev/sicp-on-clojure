(ns sicp.first.1_10_test
  (:require [clojure.test :refer :all]
            [sicp.first.1_10 :refer [subject]]))

(testing "Exercise 1.10"
  (is (= (subject 1 10) 1024))
  (is (= (subject 2 4) 65536))
  (is (= (subject 3 3) 65536)))
