(ns sicp.first_chapter_test
  (:require [clojure.test :refer :all]
            [sicp.first_chapter :refer :all]))

(testing "Exercise 1.2"
  (is (= (exercise_1_2) -37/150)))

(testing "Exercise 1.3"
  (is (= (exercise_1_3 5 2 6) 61)))

(testing "Exercise 1.4"
  (is (= (exercise_1_4 1 3) 4))
  (is (= (exercise_1_4 -1 3) 2)))
