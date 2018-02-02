(ns sicp.first.1_6_test
  (:require [clojure.test :refer :all]
            [sicp.first.1_6 :refer [subject]]))

(testing "Exercise 1.6"
  (is (= (subject (> 1 2) "foo" "bar") "bar"))
  (is (= (subject (< 1 2) "foo" "bar") "foo")))
