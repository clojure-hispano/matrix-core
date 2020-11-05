(ns matrix.matrix-test
  (:require [clojure.test :refer [deftest is]]
            [expectations.clojure.test :refer [defexpect expect]]))

(deftest smoke-test-1 (is (= 1 1)))
(defexpect smoke-test-2 (expect 1 1))
