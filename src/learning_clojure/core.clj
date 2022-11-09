(ns learning-clojure.core)                                  ;setting a namespace for the project

;; this is a 1 line comment

(println "Hello, World!")                                   ;and this is another comment at the end of the line

(.println System/out "Hi!!!")                               ;calling Java methods

(assert (= 1 1))                                            ;asserting conditions,  (assert (= 1 0)) fails

(def x 1)                                                   ;defining variables
(println x)

(println (mod 5 3))                                         ;playing with the order in operations
(println (mod 3 5))

(def y '(1 2 3 4))                                          ;playing with set of values
(println (first y))

;;managing exceptions
(try (throw (Exception. "launching an error")) (catch Exception e (println (.getMessage e)))) ;printing exception message

(def z '(+ 2 3))                                            ;creating a data structure (not text)
(println z)                                                 ;printing the data structure
(println (eval z))                                          ;evaluate the data structure (doesn't work with strings)

(defn sayHi [name] (println (str "Hi " name)))              ;playing with functions
(sayHi "Helder")

(println (for [n '(1 2 3 4)] (* 2 n)))                      ;playing with for statement

;;let's try a fizzbuzz
(defn fizzbuzz [numbers]
  (for [n numbers]
    (cond
      (= 0 (mod n 15)) "FizzBuzz"
      (= 0 (mod n 3)) "Fizz"
      (= 0 (mod n 5)) "Buzz"
      :else n
      )
    )
  )
(println (fizzbuzz '(1 2 3 4 5 6 7 8 9 10 15)))

(def r (range 1 10))                                        ;define a range of elements
(println r)

(println (map inc r))                                       ;map takes a list of elements and applies a function on it

(println (reduce + r))                                      ;reduce takes all the elements and applies a function returning 1 value

(def w [1 2 3 4 5])
(println (pop w))                                           ;pop returns an array without the last element
(println (peek w))                                          ;peek returns the last element of an array

(println (group-by even? (range 1 10)))                     ;grouping elements

(def s (set '(1 2 3 4 5)))                                  ;defining a set
(println (contains? s 3))

(def mymap {:name "Helder" :age 44})                        ;defining a map
(println (:name mymap))
(println (contains? mymap :name))

(defn fizzbuzz2 [ns]
  (map
    (fn [n] (cond
              (= 0 (mod n 15)) "FizzBuzz"
              (= 0 (mod n 3)) "Fizz"
              (= 0 (mod n 5)) "Buzz"
              :else n
              )) ns))
(println (fizzbuzz2 '(1 2 3 4 5 6 7 8 9 10 15)))

(defn innerfizzbuzz [n]
  (cond

    (= 0 (mod n 15)) "FizzBuzz"
    (= 0 (mod n 3)) "Fizz"
    (= 0 (mod n 5)) "Buzz"
    :else n
    ))
(defn fizzbuzz3 [ns]
  (map innerfizzbuzz ns))
(println (fizzbuzz3 '(1 2 3 4 5 6 7 8 9 10 15)))
