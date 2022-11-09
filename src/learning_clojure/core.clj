(ns learning-clojure.core)                                  ;setting a namespace for the project

;; this is a 1 line comment

(println "Hello, World!")                                   ;and this is another comment at the end of the line

(.println System/out "Hi!!!")                               ;calling Java methods

(assert (= 1 1))                                            ;asserting conditions,  (assert (= 1 0)) fails

(def x 1)                                                   ;defining variables
(println x)